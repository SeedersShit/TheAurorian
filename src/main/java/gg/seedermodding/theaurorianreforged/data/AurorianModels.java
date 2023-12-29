package gg.seedermodding.theaurorianreforged.data;

import gg.seedermodding.theaurorianreforged.handler.registry.ItemRegistry;
import gg.seedermodding.theaurorianreforged.util.Reference;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class AurorianModels extends ItemModelProvider
{
    public AurorianModels(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, Reference.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        withExistingParent(ItemRegistry.AURORIAN_COBBLESTONE.getId().getPath(), modLoc("block/aurorian_cobblestone"));
        stairs(ItemRegistry.AURORIAN_COBBLESTONE_STAIRS.getId().getPath(), modLoc("block/aurorian_cobblestone"), modLoc("block/aurorian_cobblestone"), modLoc("block/aurorian_cobblestone"));
        withExistingParent(ItemRegistry.AURORIAN_DIRT.getId().getPath(), modLoc("block/aurorian_dirt"));
        withExistingParent(ItemRegistry.AURORIAN_FARM_TILE.getId().getPath(), modLoc("block/aurorian_farm_tile"));
        withExistingParent(ItemRegistry.AURORIAN_FURNACE_CHIMNEY.getId().getPath(), modLoc("block/aurorian_furnace_chimney"));
        withExistingParent(ItemRegistry.AURORIAN_FURNACE_OFF.getId().getPath(), modLoc("block/aurorian_furnace_off"));
        withExistingParent(ItemRegistry.AURORIAN_FURNACE_ON.getId().getPath(), modLoc("block/aurorian_furnace_on"));
        withExistingParent(ItemRegistry.AURORIAN_GRASS.getId().getPath(), modLoc("block/aurorian_grass"));
        withExistingParent(ItemRegistry.AURORIAN_GRASS_LIGHT.getId().getPath(), modLoc("block/aurorian_grass_light"));
        withExistingParent(ItemRegistry.AURORIAN_PORTAL.getId().getPath(), modLoc("block/aurorian_portal"));
        withExistingParent(ItemRegistry.AURORIAN_PORTAL_FRAME_BRICKS.getId().getPath(), modLoc("block/aurorian_portal_frame_bricks"));
        withExistingParent(ItemRegistry.AURORIAN_STONE.getId().getPath(), modLoc("block/aurorian_stone"));
        withExistingParent(ItemRegistry.AURORIAN_STONE_BRICK.getId().getPath(), modLoc("block/aurorian_stone_brick"));
        stairs(ItemRegistry.AURORIAN_STONE_BRICKS_STAIRS.getId().getPath(), modLoc("block/aurorian_stone_brick"), modLoc("block/aurorian_stone_brick"), modLoc("block/aurorian_stone_brick"));
        withExistingParent(ItemRegistry.BOSS_SPAWNER_KEEPER.getId().getPath(), modLoc("block/boss_spawner_keeper"));
        withExistingParent(ItemRegistry.BOSS_SPAWNER_MOON_QUEEN.getId().getPath(), modLoc("block/boss_spawner_moon_queen"));
        withExistingParent(ItemRegistry.BOSS_SPAWNER_SPIDER.getId().getPath(), modLoc("block/boss_spawner_spider"));
        withExistingParent(ItemRegistry.CRYSTAL.getId().getPath(), modLoc("block/crystal"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_DARK.getId().getPath(), modLoc("block/dungeon_stone_dark"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_DARK_FANCY.getId().getPath(), modLoc("block/dungeon_stone_dark_fancy"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_DARK_GATE.getId().getPath(), modLoc("block/dungeon_stone_dark_gate"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_DARK_GATE_KEYHOLE.getId().getPath(), modLoc("block/dungeon_stone_dark_gate_keyhole"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_DARK_LAMP.getId().getPath(), modLoc("block/dungeon_stone_dark_lamp"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_DARK_LAYERS.getId().getPath(), modLoc("block/dungeon_stone_dark_layers"));
        stairs(ItemRegistry.DUNGEON_STONE_DARK_STAIRS.getId().getPath(), modLoc("block/dungeon_stone_dark"), modLoc("block/dungeon_stone_dark"), modLoc("block/dungeon_stone_dark"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE.getId().getPath(), modLoc("block/dungeon_stone_moon_temple"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_BARS.getId().getPath(), modLoc("block/dungeon_stone_moon_temple_bars"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE.getId().getPath(), modLoc("block/dungeon_stone_moon_temple_gate"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_CELL.getId().getPath(), modLoc("block/dungeon_stone_moon_temple_gate_cell"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE.getId().getPath(), modLoc("block/dungeon_stone_moon_temple_gate_keyhole"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE_CELL.getId().getPath(), modLoc("block/dungeon_stone_moon_temple_gate_keyhole_cell"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_LAMP.getId().getPath(), modLoc("block/dungeon_stone_moon_temple_lamp"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_SMOOTH.getId().getPath(), modLoc("block/dungeon_stone_moon_temple_smooth"));
        stairs(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_STAIRS.getId().getPath(), modLoc("block/dungeon_stone_moon_temple"), modLoc("block/dungeon_stone_moon_temple"), modLoc("block/dungeon_stone_moon_temple"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_RUNE_STONE.getId().getPath(), modLoc("block/dungeon_stone_rune_stone"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_RUNE_STONE_BARS.getId().getPath(), modLoc("block/dungeon_stone_rune_stone_bars"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_RUNE_STONE_GATE.getId().getPath(), modLoc("block/dungeon_stone_rune_stone_gate"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE.getId().getPath(), modLoc("block/dungeon_stone_rune_stone_gate_keyhole"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE_LOOT.getId().getPath(), modLoc("block/dungeon_stone_rune_stone_gate_keyhole_loot"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_RUNE_STONE_GATE_LOOT.getId().getPath(), modLoc("block/dungeon_stone_rune_stone_gate_loot"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_RUNE_STONE_LAMP.getId().getPath(), modLoc("block/dungeon_stone_rune_stone_lamp"));
        withExistingParent(ItemRegistry.DUNGEON_STONE_RUNE_STONE_SMOOTH.getId().getPath(), modLoc("block/dungeon_stone_rune_stone_smooth"));
        stairs(ItemRegistry.DUNGEON_STONE_RUNE_STONE_STAIRS.getId().getPath(), modLoc("block/dungeon_stone_rune_stone"), modLoc("block/dungeon_stone_rune_stone"), modLoc("block/dungeon_stone_rune_stone"));

    }
}
