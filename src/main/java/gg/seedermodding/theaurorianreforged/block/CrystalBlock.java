package gg.seedermodding.theaurorianreforged.block;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.AABB;

public class CrystalBlock extends Block //implements ITileEntityProvider, ItemRegistry.IUniqueModel, BlockRegistry.IUniqueItemBlock
{

	public static final String BLOCKNAME = "crystal";
	protected static final AABB AABB = new AABB(0.4D, 0.0D, 0.4D, 0.6D, 1.0D, 0.6D);

	public CrystalBlock()
	{
		super(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F).sound(SoundType.STONE));
		//this.setLightLevel(1F);
	}

	/*@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return AABB;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new CrystalBlockTileEntity();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
		ClientRegistry.bindTileEntitySpecialRenderer(CrystalBlockTileEntity.class, new CrystalBlockTileEntityRenderer());
	}

	@Override
	public void registerItemBlock(Register<Item> event) {
		event.getRegistry().register(new ItemBlock(this).setRegistryName(this.getRegistryName()).setMaxStackSize(AurorianConfig.Config_CrystalStackSize));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (!GuiScreen.isShiftKeyDown()) {
			tooltip.add(TextFormatting.ITALIC + I18n.format("string.theaurorian.tooltip.shiftinfo") + TextFormatting.RESET);
		} else {
			tooltip.add(I18n.format("string.theaurorian.tooltip." + BLOCKNAME));
		}
	}*/
}
