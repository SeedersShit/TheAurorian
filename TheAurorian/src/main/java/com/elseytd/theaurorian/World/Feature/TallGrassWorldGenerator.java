package com.elseytd.theaurorian.World.Feature;

import com.elseytd.theaurorian.Registry.BlockRegistry;
import net.minecraft.block.BlockBush;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class TallGrassWorldGenerator extends WorldGenerator {

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		for (IBlockState iblockstate = worldIn.getBlockState(position); (iblockstate.getBlock().isAir(iblockstate, worldIn, position) || iblockstate.getBlock().isLeaves(iblockstate, worldIn, position)) && position.getY() > 0; iblockstate = worldIn.getBlockState(position)) {
			position = position.down();
		}
		for (int i = 0; i < 128; ++i) {
			BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
			IBlockState grass = null;

			if (worldIn.getBlockState(blockpos.down()).getBlock() == BlockRegistry.Registry.AURORIANGRASS.getBlock()) {
				grass = BlockRegistry.Registry.PLANTTALLGRASS.getBlock().getDefaultState();
			} else if (worldIn.getBlockState(blockpos.down()).getBlock() == BlockRegistry.Registry.AURORIANGRASSLIGHT.getBlock()) {
				grass = BlockRegistry.Registry.PLANTTALLGRASSLIGHT.getBlock().getDefaultState();
			}

			if (grass != null) {
				if (worldIn.isAirBlock(blockpos) && ((BlockBush) grass.getBlock()).canBlockStay(worldIn, blockpos, worldIn.getBlockState(blockpos.down()))) {
					worldIn.setBlockState(blockpos, grass, 2);
				}
			}
		}
		return true;

	}
}
