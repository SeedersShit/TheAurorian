package gg.seedermodding.theaurorianreforged.data;

import gg.seedermodding.theaurorianreforged.block.*;
import gg.seedermodding.theaurorianreforged.handler.registry.BlockRegistry;
import gg.seedermodding.theaurorianreforged.util.Reference;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredBlock;

public class AurorianLanguage extends LanguageProvider
{
    public AurorianLanguage(PackOutput output, String locale)
    {
        super(output, Reference.MODID, locale);
    }

    @Override
    protected void addTranslations()
    {
        add("itemGroup." + "blocks_tab", "The Aurorian: Reforged");
        add(BlockRegistry.AURORIAN_COBBLESTONE.get(), "Aurorian Cobblestone");
        add(BlockRegistry.AURORIAN_COBBLESTONE_STAIRS.get(), "Aurorian Cobblestone Stairs");
        add(BlockRegistry.AURORIAN_DIRT.get(), "Aurorian Dirt");
        add(BlockRegistry.AURORIAN_FARM_TILE.get(), "Aurorian Farm Tile");
        add(BlockRegistry.AURORIAN_FURNACE_CHIMNEY.get(), "Aurorian Furnace Chimney");
        add(BlockRegistry.AURORIAN_FURNACE_OFF.get(), "Aurorian Furnace (Off)");
        add(BlockRegistry.AURORIAN_FURNACE_ON.get(), "Aurorian Furnace (On)");
        add(BlockRegistry.AURORIAN_GRASS.get(), "Aurorian Grass");
        add(BlockRegistry.AURORIAN_GRASS_LIGHT.get(), "Light Aurorian Grass");
        add(BlockRegistry.AURORIAN_PORTAL.get(), "Aurorian Portal");
        add(BlockRegistry.AURORIAN_PORTAL_FRAME_BRICKS.get(), "Aurorian Portal Frame");
        add(BlockRegistry.AURORIAN_STONE.get(), "Aurorian Stone");
        add(BlockRegistry.AURORIAN_STONE_BRICK.get(), "Aurorian Stone Brick");
        add(BlockRegistry.AURORIAN_STONE_BRICKS_STAIRS.get(), "Aurorian Stone Brick Stairs");
        add(BlockRegistry.BOSS_SPAWNER_KEEPER.get(), "");
        add(BlockRegistry.BOSS_SPAWNER_MOON_QUEEN.get(), "");
        add(BlockRegistry.BOSS_SPAWNER_SPIDER.get(), "");
        add(BlockRegistry.CRYSTAL.get(), "");
        add(BlockRegistry.DUNGEON_STONE_DARK.get(), "");
        add(BlockRegistry.DUNGEON_STONE_DARK_FANCY.get(), "");
        add(BlockRegistry.DUNGEON_STONE_DARK_GATE.get(), "");
        add(BlockRegistry.DUNGEON_STONE_DARK_GATE_KEYHOLE.get(), "");
        add(BlockRegistry.DUNGEON_STONE_DARK_LAMP.get(), "");
        add(BlockRegistry.DUNGEON_STONE_DARK_LAYERS.get(), "");
        add(BlockRegistry.DUNGEON_STONE_DARK_STAIRS.get(), "");
        add(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE.get(), "");
        add(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_BARS.get(), "");
        add(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE.get(), "");
        add(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_CELL.get(), "");
        add(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE.get(), "");
        add(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE_CELL.get(), "");
        add(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_LAMP.get(), "");
        add(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_SMOOTH.get(), "");
        add(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_STAIRS.get(), "");
        add(BlockRegistry.DUNGEON_STONE_RUNE_STONE.get(), "");
        add(BlockRegistry.DUNGEON_STONE_RUNE_STONE_BARS.get(), "");
        add(BlockRegistry.DUNGEON_STONE_RUNE_STONE_GATE.get(), "");
        add(BlockRegistry.DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE.get(), "");
        add(BlockRegistry.DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE_LOOT.get(), "");
        add(BlockRegistry.DUNGEON_STONE_RUNE_STONE_GATE_LOOT.get(), "");
        add(BlockRegistry.DUNGEON_STONE_RUNE_STONE_LAMP.get(), "");
        add(BlockRegistry.DUNGEON_STONE_RUNE_STONE_SMOOTH.get(), "");
        add(BlockRegistry.DUNGEON_STONE_RUNE_STONE_STAIRS.get(), "");

    }
}
