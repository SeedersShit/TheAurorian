package gg.seedermodding.theaurorianreforged.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class DungeonStoneLamp extends Block
{
	public DungeonStoneLamp()
	{
		super(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(6000000.0F).sound(SoundType.STONE));
		//this.setLightLevel(1F);
	}
}
