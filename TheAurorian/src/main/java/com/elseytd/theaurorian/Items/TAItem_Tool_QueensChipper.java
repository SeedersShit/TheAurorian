package com.elseytd.theaurorian.Items;

import java.util.List;

import javax.annotation.Nullable;

import com.elseytd.theaurorian.TAItems;
import com.elseytd.theaurorian.TAMod;
import com.elseytd.theaurorian.Blocks.TABlock_DungeonStone;
import com.elseytd.theaurorian.Blocks.TABlock_DungeonStoneBars;
import com.elseytd.theaurorian.Blocks.TABlock_DungeonStoneGate;
import com.elseytd.theaurorian.Blocks.TABlock_DungeonStoneGateKeyhole;
import com.elseytd.theaurorian.Blocks.TABlock_DungeonStoneLamp;
import com.elseytd.theaurorian.Blocks.TABlock_DungeonStoneSmooth;
import com.elseytd.theaurorian.Blocks.TABlock_Stairs;

import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TAItem_Tool_QueensChipper extends ItemPickaxe {

	public static final String ITEMNAME = "queenschipper";

	public TAItem_Tool_QueensChipper() {
		super(TAItems.Materials.AURORIANSTEEL);
		this.setCreativeTab(TAMod.CREATIVE_TAB);
		this.setRegistryName(ITEMNAME);
		this.setUnlocalizedName(TAMod.MODID + "." + ITEMNAME);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack itemstack = player.getHeldItem(hand);
		if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack)) {
			return EnumActionResult.FAIL;
		} else {
			Block block = worldIn.getBlockState(pos).getBlock();
			if (block instanceof TABlock_DungeonStone || block instanceof TABlock_DungeonStoneBars || block instanceof TABlock_DungeonStoneGate || block instanceof TABlock_DungeonStoneGateKeyhole || block instanceof TABlock_DungeonStoneLamp || block instanceof TABlock_DungeonStoneSmooth || (block instanceof TABlock_Stairs && worldIn.getBlockState(pos).getBlockHardness(worldIn, pos) == -1.0F)) {
				worldIn.playSound(player, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 0.8F, 0.7F);
				if (!worldIn.isRemote) {
					worldIn.destroyBlock(pos, true);
					itemstack.damageItem(1, player);
				}
				return EnumActionResult.SUCCESS;
			} else {
				return EnumActionResult.PASS;
			}
		}
	}

	@Override
	public net.minecraftforge.common.IRarity getForgeRarity(ItemStack stack) {
		return EnumRarity.RARE;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (!GuiScreen.isShiftKeyDown()) {
			tooltip.add(TextFormatting.ITALIC + I18n.format("string.theaurorian.tooltip.shiftinfo") + TextFormatting.RESET);
		} else {
			tooltip.add(I18n.format("string.theaurorian.tooltip.queenschipper"));
		}
	}

}
