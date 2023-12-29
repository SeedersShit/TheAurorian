package gg.seedermodding.theaurorianreforged.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class DungeonStoneSmooth extends Block
{
	public DungeonStoneSmooth()
	{
		super(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(6000000.0F).sound(SoundType.STONE));
	}
}
