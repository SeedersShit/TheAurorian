package gg.seedermodding.theaurorianreforged.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class AurorianPortalFrameBricks extends Block
{
	public AurorianPortalFrameBricks()
	{
		super(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F).sound(SoundType.STONE).requiresCorrectToolForDrops());
	}

/*	@Override
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
			if (itemstack.getItem() == ItemRegistry.Registry.SILENTWOODSTICK.getItem() && AurorianConfig.Config_SticksMakeFire) {
				itemstack.shrink(1);
				if (playerIn.getHeldItemOffhand().getItem() == ItemRegistry.Registry.SILENTWOODSTICK.getItem()) {
					playerIn.getHeldItemOffhand().shrink(1);
				}
				((AurorianPortal) BlockRegistry.Registry.AURORIANPORTAL.getBlock()).trySpawnPortal(worldIn, pos.up());
				return true;
			} else {
				for (String i : AurorianConfig.Config_PortalLighter) {
					if (Item.getByNameOrId(i) == itemstack.getItem()) {
						if (itemstack.getItem().isDamageable()) {
							itemstack.damageItem(1, playerIn);
						} else {
							itemstack.shrink(1);
						}
						((AurorianPortal) BlockRegistry.Registry.AURORIANPORTAL.getBlock()).trySpawnPortal(worldIn, pos.up());
						return true;
					}
				}
			}
		}
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
	}*/
}
