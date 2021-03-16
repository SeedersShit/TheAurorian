package com.elseytd.theaurorian.Items;

import java.util.List;

import javax.annotation.Nullable;

import com.elseytd.theaurorian.TAItems;
import com.elseytd.theaurorian.TAMod;
import com.elseytd.theaurorian.Util.OreDictionaryHelper;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Enchantments;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TAItem_Tool_Crystalline_Pickaxe extends ItemPickaxe {
	public static final String ITEMNAME = "crystallinepickaxe";

	public TAItem_Tool_Crystalline_Pickaxe() {
		super(TAItems.Materials.CRYSTALLINE);
		this.setCreativeTab(TAMod.CREATIVE_TAB);
		this.setRegistryName(ITEMNAME);
		this.setUnlocalizedName(TAMod.MODID + "." + ITEMNAME);
	}

	@Override
	public net.minecraftforge.common.IRarity getForgeRarity(ItemStack stack) {
		return EnumRarity.EPIC;
	}

	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
		return !(EnchantmentHelper.getEnchantments(book).containsKey(Enchantments.FORTUNE));
	}

	@Override
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
		if (!worldIn.isRemote && state.getBlockHardness(worldIn, pos) != 0.0D) {
			ItemStack block = new ItemStack(state.getBlock(), 1, state.getBlock().getMetaFromState(state));
			if (OreDictionaryHelper.isOre(block)) {
				ItemStack nugget = OreDictionaryHelper.getTypeFromOre(block, "nugget");
				ItemStack ingot = OreDictionaryHelper.getTypeFromOre(block, "ingot");
				if (ingot != null) {
					worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), ingot));
					if (nugget != null) {
						nugget.setCount(Item.itemRand.nextInt(3) + 1);
						worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), nugget));
					}
					stack.damageItem(2, entityLiving);
					worldIn.destroyBlock(pos, false);
					return true;
				}
			}
			stack.damageItem(1, entityLiving);
		}
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (!GuiScreen.isShiftKeyDown()) {
			tooltip.add(TextFormatting.ITALIC + I18n.format("string.theaurorian.tooltip.shiftinfo") + TextFormatting.RESET);
		} else {
			tooltip.add(I18n.format("string.theaurorian.tooltip.crystallinepickaxe"));
		}
	}
}
