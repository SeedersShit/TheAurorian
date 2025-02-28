package gg.seedermodding.theaurorianreforged.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class AurorianGrass extends Block
{

	public static final String BLOCKNAME = "auroriangrass";
	public static final String BLOCKNAME_LIGHT = "auroriangrasslight";

	public AurorianGrass()
	{
		super(BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).strength(0.5F).sound(SoundType.GRASS).randomTicks().requiresCorrectToolForDrops());
	}

	/*@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return BlockRegistry.Registry.AURORIANDIRT.getBlock().getItemDropped(BlockRegistry.Registry.AURORIANDIRT.getBlock().getDefaultState(), rand, fortune);
	}

	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, net.minecraftforge.common.IPlantable plantable) {
		net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.offset(direction));

		if (direction != EnumFacing.UP) {
			return false;
		}
		return plantType == EnumPlantType.Plains;
	}

	@Override
	public void onPlantGrow(IBlockState state, World world, BlockPos pos, BlockPos source) {
		world.setBlockState(pos, BlockRegistry.Registry.AURORIANDIRT.getBlock().getDefaultState(), 2);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		if (worldIn.isRemote && (worldIn.isAirBlock(pos.up()) || worldIn.getBlockState(pos.up()).getBlock() instanceof BlockBush)) {
			if (AurorianUtil.randomChanceOf(0.01) && AurorianUtil.randomChanceOf(0.5)) {
				double d0 = pos.getX() + 0.5D;
				double d1 = pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
				double d2 = pos.getZ() + 0.5D;
				double d3 = 4 * rand.nextDouble();
				double mo = 0.1D * rand.nextDouble();
				worldIn.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, d0, d1 + 4 + d3, d2, mo, 0.0D, mo);
			}
		}
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (!worldIn.isRemote) {
			if (!worldIn.isAreaLoaded(pos, 3)) {
				return;
			}

			if (worldIn.getLightFromNeighbors(pos.up()) < 4 && worldIn.getBlockState(pos.up()).getLightOpacity(worldIn, pos.up()) > 2) {
				worldIn.setBlockState(pos, BlockRegistry.Registry.AURORIANDIRT.getBlock().getDefaultState());
			} else {
				if (worldIn.getLightFromNeighbors(pos.up()) >= 9) {
					for (int i = 0; i < 4; ++i) {
						BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

						if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos)) {
							return;
						}

						IBlockState iblockstate = worldIn.getBlockState(blockpos.up());
						IBlockState iblockstate1 = worldIn.getBlockState(blockpos);

						if (iblockstate1.getBlock() == BlockRegistry.Registry.AURORIANDIRT.getBlock() && worldIn.getLightFromNeighbors(blockpos.up()) >= 4 && iblockstate.getLightOpacity(worldIn, pos.up()) <= 2) {
							worldIn.setBlockState(blockpos, this.getDefaultState());
						}
					}
				}
			}
		}
	}*/

}
