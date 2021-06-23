package com.elseytd.theaurorian.Blocks;

import com.elseytd.theaurorian.TABlocks;
import com.elseytd.theaurorian.TAMod;
import com.elseytd.theaurorian.World.TABiomeDecorator.AurorianStonesPredicate.IAurorianStoneType;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class TABlock_Aurorian_Stone extends Block implements IAurorianStoneType {

	public static final String BLOCKNAME = "aurorianstone";

	public TABlock_Aurorian_Stone() {
		super(Material.ROCK);
		this.setCreativeTab(TAMod.CREATIVE_TAB);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 0);
		this.setRegistryName(BLOCKNAME);
		this.setSoundType(SoundType.STONE);
		this.setUnlocalizedName(TAMod.MODID + "." + BLOCKNAME);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(TABlocks.Registry.AURORIANCOBBLESTONE.getBlock());
	}

}
