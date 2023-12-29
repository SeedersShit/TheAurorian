package gg.seedermodding.theaurorianreforged.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class DungeonStoneGate extends Block
{

	public static final String BLOCKNAME_RUNESTONE = "runestonegate";
	public static final String BLOCKNAME_RUNESTONELOOT = "runestonelootgate";
	public static final String BLOCKNAME_MOONTEMPLE = "moontemplegate";
	public static final String BLOCKNAME_MOONTEMPLECELL = "moontemplecellgate";
	public static final String BLOCKNAME_DARK = "darkstonegate";

	private DungeonStoneGateKeyhole keyholeBlock = null;

	public DungeonStoneGate()
	{
		super(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(6000000.0F).sound(SoundType.STONE));
	}

/*
	public DungeonStoneGate(String blockname, String keyholeblockname) {
		this(blockname);
		this.setKeyhole(new DungeonStoneGateKeyhole(keyholeblockname));
	}
*/

	/*@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		return this.isInKeyholeRange(worldIn, pos);
	}

	public void setKeyhole(DungeonStoneGateKeyhole keyholename) {
		this.keyholeBlock = keyholename;
	}

	public DungeonStoneGateKeyhole getKeyhole() {
		return this.keyholeBlock;
	}

	public boolean isKeyhole(Block bcheck) {
		return getKeyhole().getRegistryName().equals(bcheck.getRegistryName());
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (!GuiScreen.isShiftKeyDown()) {
			tooltip.add(TextFormatting.ITALIC + I18n.format("string.theaurorian.tooltip.shiftinfo") + TextFormatting.RESET);
		} else {
			tooltip.add(I18n.format("string.theaurorian.tooltip.dungeonstonegate1") + " " + getKeyhole().getMaxGateDistance() + " " + I18n.format("string.theaurorian.tooltip.dungeonstonegate2"));
		}
	}

	public boolean isInKeyholeRange(World worldIn, BlockPos pos) {
		int maxBlocksFromKeyhole = getKeyhole().getMaxGateDistance();
		for (int x = -maxBlocksFromKeyhole; x <= maxBlocksFromKeyhole; x++) {
			for (int y = -maxBlocksFromKeyhole; y <= maxBlocksFromKeyhole; y++) {
				IBlockState blk = worldIn.getBlockState(new BlockPos(pos.getX() - x, pos.getY() - y, pos.getZ()));
				if (this.isKeyhole(blk.getBlock())) {
					return true;
				}
			}
		}
		for (int z = -maxBlocksFromKeyhole; z <= maxBlocksFromKeyhole; z++) {
			for (int y = -maxBlocksFromKeyhole; y <= maxBlocksFromKeyhole; y++) {
				IBlockState blk = worldIn.getBlockState(new BlockPos(pos.getX(), pos.getY() - y, pos.getZ() - z));
				if (this.isKeyhole(blk.getBlock())) {
					return true;
				}
			}
		}
		return false;
	}
*/
}
