package gg.seedermodding.theaurorianreforged.data;

import gg.seedermodding.theaurorianreforged.handler.registry.BlockRegistry;
import gg.seedermodding.theaurorianreforged.util.Reference;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class AurorianBlockStates extends BlockStateProvider
{
    public AurorianBlockStates(PackOutput output, ExistingFileHelper helper)
    {
        super(output, Reference.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        simpleBlock(BlockRegistry.AURORIAN_COBBLESTONE.get());
        stairsBlock(BlockRegistry.AURORIAN_COBBLESTONE_STAIRS.get(), modLoc("block/aurorian_cobblestone"));
        simpleBlock(BlockRegistry.AURORIAN_DIRT.get());
        simpleBlock(BlockRegistry.AURORIAN_FARM_TILE.get());
        registerChimney();
        registerFurnaceOff();
        registerFurnaceOn();
        registerGrass();
        registerGrassLight();
        simpleBlock(BlockRegistry.AURORIAN_PORTAL.get());
        simpleBlock(BlockRegistry.AURORIAN_PORTAL_FRAME_BRICKS.get());
        simpleBlock(BlockRegistry.AURORIAN_STONE.get());
        simpleBlock(BlockRegistry.AURORIAN_STONE_BRICK.get());
        stairsBlock(BlockRegistry.AURORIAN_STONE_BRICKS_STAIRS.get(), modLoc("block/aurorian_stone_brick"));
        simpleBlock(BlockRegistry.BOSS_SPAWNER_KEEPER.get());
        simpleBlock(BlockRegistry.BOSS_SPAWNER_MOON_QUEEN.get());
        simpleBlock(BlockRegistry.BOSS_SPAWNER_SPIDER.get());
        simpleBlock(BlockRegistry.CRYSTAL.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_DARK.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_DARK_FANCY.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_DARK_GATE.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_DARK_GATE_KEYHOLE.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_DARK_LAMP.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_DARK_LAYERS.get());
        stairsBlock(BlockRegistry.DUNGEON_STONE_DARK_STAIRS.get(), modLoc("block/dungeon_stone_dark"));
        simpleBlock(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_BARS.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_CELL.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE_CELL.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_LAMP.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_SMOOTH.get());
        stairsBlock(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_STAIRS.get(), modLoc("block/dungeon_stone_moon_temple"));
        simpleBlock(BlockRegistry.DUNGEON_STONE_RUNE_STONE.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_RUNE_STONE_BARS.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_RUNE_STONE_GATE.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE_LOOT.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_RUNE_STONE_GATE_LOOT.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_RUNE_STONE_LAMP.get());
        simpleBlock(BlockRegistry.DUNGEON_STONE_RUNE_STONE_SMOOTH.get());
        stairsBlock(BlockRegistry.DUNGEON_STONE_RUNE_STONE_STAIRS.get(), modLoc("block/dungeon_stone_rune_stone"));

    }

    private void registerChimney()
    {
        Block block = BlockRegistry.AURORIAN_FURNACE_CHIMNEY.get();
        ResourceLocation side = modLoc("block/aurorian_furnace_chimney");
        ResourceLocation top = modLoc("block/aurorian_furnace_chimney_top");
        simpleBlock(block, models().cube(BlockRegistry.AURORIAN_FURNACE_CHIMNEY.getId().getPath(), side, top, side, side, side, side));
    }

    private void registerFurnaceOff()
    {
        Block block = BlockRegistry.AURORIAN_FURNACE_OFF.get();
        ResourceLocation side = modLoc("block/aurorian_furnace_side");
        ResourceLocation front = modLoc("block/aurorian_furnace_face_off");
        ResourceLocation top = modLoc("block/aurorian_furnace_top");
        simpleBlock(block, models().orientable(BlockRegistry.AURORIAN_FURNACE_OFF.getId().getPath(), side, front, top));
    }
    private void registerFurnaceOn()
    {
        Block block = BlockRegistry.AURORIAN_FURNACE_ON.get();
        ResourceLocation side = modLoc("block/aurorian_furnace_side");
        ResourceLocation front = modLoc("block/aurorian_furnace_face_on");
        ResourceLocation top = modLoc("block/aurorian_furnace_top");
        simpleBlock(block, models().orientable(BlockRegistry.AURORIAN_FURNACE_ON.getId().getPath(), side, front, top));
    }

    private void registerGrass()
    {
        Block block = BlockRegistry.AURORIAN_GRASS.get();
        ResourceLocation side = modLoc("block/aurorian_grass_side");
        ResourceLocation top = modLoc("block/aurorian_grass_top");
        simpleBlock(block, models().cube(BlockRegistry.AURORIAN_GRASS.getId().getPath(), side, top, side, side, side, side));
    }

    private void registerGrassLight()
    {
        Block block = BlockRegistry.AURORIAN_GRASS_LIGHT.get();
        ResourceLocation side = modLoc("block/aurorian_grass_light_side");
        ResourceLocation top = modLoc("block/aurorian_grass_light_top");

        simpleBlock(block, models().cube(BlockRegistry.AURORIAN_GRASS_LIGHT.getId().getPath(), side, top, side, side, side, side));
    }
}
