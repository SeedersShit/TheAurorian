package gg.seedermodding.theaurorianreforged.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class AurorianCobblestone extends Block
{
	public AurorianCobblestone()
	{
		super(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
				.strength(2.0F)
				.sound(SoundType.STONE)
				.requiresCorrectToolForDrops()
		);
	}
}
