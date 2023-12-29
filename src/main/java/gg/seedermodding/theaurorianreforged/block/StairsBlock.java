package gg.seedermodding.theaurorianreforged.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

public class StairsBlock extends StairBlock
{
	public StairsBlock(BlockState state)
	{
		super(state, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(0.5F).sound(SoundType.WOOD).requiresCorrectToolForDrops());
		//this.setLightOpacity(0);
	}
}
