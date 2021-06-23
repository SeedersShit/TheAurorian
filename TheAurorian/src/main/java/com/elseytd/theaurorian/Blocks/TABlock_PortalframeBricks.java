package com.elseytd.theaurorian.Blocks;

import com.elseytd.theaurorian.TABlocks;
import com.elseytd.theaurorian.TAConfig;
import com.elseytd.theaurorian.TAItems;
import com.elseytd.theaurorian.TAMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class TABlock_PortalframeBricks extends Block {

	public static final String BLOCKNAME = "aurorianportalframebricks";

	public TABlock_PortalframeBricks() {
		super(Material.ROCK);
		this.setCreativeTab(TAMod.CREATIVE_TAB);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 0);
		this.setRegistryName(BLOCKNAME);
		this.setSoundType(SoundType.STONE);
		this.setUnlocalizedName(TAMod.MODID + "." + BLOCKNAME);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (!GuiScreen.isShiftKeyDown()) {
			tooltip.add(TextFormatting.ITALIC + I18n.format("string.theaurorian.tooltip.shiftinfo") + TextFormatting.RESET);
		} else {
			tooltip.add(I18n.format("string.theaurorian.tooltip.portalframebricks"));
		}
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

		ItemStack itemstack = playerIn.getHeldItem(hand);

		if (!itemstack.isEmpty()) {
			if (itemstack.getItem() == TAItems.Registry.SILENTWOODSTICK.getItem() && TAConfig.Config_SticksMakeFire) {
				itemstack.shrink(1);
				if (playerIn.getHeldItemOffhand().getItem() == TAItems.Registry.SILENTWOODSTICK.getItem()) {
					playerIn.getHeldItemOffhand().shrink(1);
				}
				((TABlock_Portal) TABlocks.Registry.AURORIANPORTAL.getBlock()).trySpawnPortal(worldIn, pos.up());
				return true;
			} else {
				for (String i : TAConfig.Config_PortalLighter) {
					if (Item.getByNameOrId(i) == itemstack.getItem()) {
						if (itemstack.getItem().isDamageable()) {
							itemstack.damageItem(1, playerIn);
						} else {
							itemstack.shrink(1);
						}
						((TABlock_Portal) TABlocks.Registry.AURORIANPORTAL.getBlock()).trySpawnPortal(worldIn, pos.up());
						return true;
					}
				}
			}
		}
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
	}
}
