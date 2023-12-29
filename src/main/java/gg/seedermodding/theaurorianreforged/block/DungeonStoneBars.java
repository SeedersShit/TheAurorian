package gg.seedermodding.theaurorianreforged.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class DungeonStoneBars extends Block
{

	public static final String BLOCKNAME_RUNESTONE = "runestonebars";
	public static final String BLOCKNAME_MOONTEMPLE = "moontemplebars";

	public DungeonStoneBars()
	{
		super(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).strength(6000000.0F).sound(SoundType.METAL));
	}
}
