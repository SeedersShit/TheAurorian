package gg.seedermodding.theaurorianreforged.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.Random;

public class BossSpawner extends Block //implements ITileEntityProvider
{

/*	public static final String BLOCKNAME_KEEPER = "bossspawnerkeeper";
	public static final String BLOCKNAME_MOONQUEEN = "bossspawnermoonqueen";
	public static final String BLOCKNAME_SPIDER = "bossspawnerspider";

	public enum Bosses {
		KEEPER(BLOCKNAME_KEEPER, KeeperEntity.EntityName),
		MOONQUEEN(BLOCKNAME_MOONQUEEN, MoonQueenEntity.EntityName),
		SPIDER(BLOCKNAME_SPIDER, SpiderEntity.EntityName);

		private final String BLOCKNAME;
		private final String BOSS;

		Bosses(String blockname, String boss) {
			this.BLOCKNAME = blockname;
			this.BOSS = boss;
		}

		public String getName() {
			return BLOCKNAME;
		}

		public String getBoss() {
			return BOSS;
		}

	}

	private final Bosses blockBoss;*/

	public BossSpawner()
	{
		super(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(Float.MAX_VALUE).sound(SoundType.STONE));
		//this.blockBoss = boss;
	}

/*	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		double rx = pos.getX() + worldIn.rand.nextFloat();
		double ry = pos.getY() + worldIn.rand.nextFloat();
		double rz = pos.getZ() + worldIn.rand.nextFloat();
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, rx, ry, rz, 0.0D, 0.0D, 0.0D);
		worldIn.spawnParticle(EnumParticleTypes.FLAME, rx, ry, rz, 0.0D, 0.0D, 0.0D);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new BossSpawnerTileEntity(this.blockBoss.getBoss());
	}*/

}
