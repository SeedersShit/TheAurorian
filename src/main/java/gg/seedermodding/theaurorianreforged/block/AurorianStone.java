package gg.seedermodding.theaurorianreforged.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.Random;

public class AurorianStone extends Block //implements AurorianBiomeDecorator.AurorianStonesPredicate.IAurorianStoneType {
{
	public static final String BLOCKNAME = "aurorianstone";

	public AurorianStone() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F).sound(SoundType.STONE).requiresCorrectToolForDrops());
	}

/*
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BlockRegistry.Registry.AURORIANCOBBLESTONE.getBlock());
	}
*/

}
