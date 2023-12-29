package gg.seedermodding.theaurorianreforged.data;

import gg.seedermodding.theaurorianreforged.handler.registry.BlockRegistry;
import gg.seedermodding.theaurorianreforged.handler.registry.ItemRegistry;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.function.BiConsumer;

public class AurorianLootTables implements LootTableSubProvider
{
    @Override
    public void generate(BiConsumer<ResourceLocation, LootTable.Builder> builder)
    {
        builder.accept(BlockRegistry.AURORIAN_COBBLESTONE.getId(), LootTableHelper.createSimpleTable("aurorian_cobblestone", BlockRegistry.AURORIAN_COBBLESTONE.get()));
        //builder.accept(AURORIAN_COBBLESTONE_STAIRS.getId(), LootTableHelper.createSimpleTable("aurorian_cobblestone_stairs", () -> new StairsBlock(new AurorianCobblestone()));
        builder.accept(BlockRegistry.AURORIAN_DIRT.getId(), LootTableHelper.createSimpleTable("aurorian_dirt", BlockRegistry.AURORIAN_DIRT.get()));
        builder.accept(BlockRegistry.AURORIAN_FARM_TILE.getId(), LootTableHelper.createSimpleTable("aurorian_farm_tile", BlockRegistry.AURORIAN_FARM_TILE.get()));
        builder.accept(BlockRegistry.AURORIAN_FURNACE_CHIMNEY.getId(), LootTableHelper.createSimpleTable("aurorian_furnace_chimney", BlockRegistry.AURORIAN_FURNACE_CHIMNEY.get()));
        builder.accept(BlockRegistry.AURORIAN_FURNACE_OFF.getId(), LootTableHelper.createSimpleTable("aurorian_furnace_off", BlockRegistry.AURORIAN_FURNACE_OFF.get()));
        builder.accept(BlockRegistry.AURORIAN_FURNACE_ON.getId(), LootTableHelper.createSimpleTable("aurorian_furnace_on", BlockRegistry.AURORIAN_FURNACE_ON.get()));
        builder.accept(BlockRegistry.AURORIAN_GRASS.getId(), LootTableHelper.createSimpleTable("aurorian_grass", BlockRegistry.AURORIAN_GRASS.get()));
        builder.accept(BlockRegistry.AURORIAN_GRASS_LIGHT.getId(), LootTableHelper.createSimpleTable("aurorian_grass_light", BlockRegistry.AURORIAN_GRASS_LIGHT.get()));
        builder.accept(BlockRegistry.AURORIAN_PORTAL.getId(), LootTableHelper.createSimpleTable("aurorian_portal", BlockRegistry.AURORIAN_PORTAL.get()));
        builder.accept(BlockRegistry.AURORIAN_PORTAL_FRAME_BRICKS.getId(), LootTableHelper.createSimpleTable("aurorian_portal_frame_bricks", BlockRegistry.AURORIAN_PORTAL_FRAME_BRICKS.get()));
        builder.accept(BlockRegistry.AURORIAN_STONE.getId(), LootTableHelper.createSilkTouchTable("aurorian_stone", BlockRegistry.AURORIAN_STONE.get(), ItemRegistry.AURORIAN_STONE.get(), 1, 1));
        builder.accept(BlockRegistry.AURORIAN_STONE_BRICK.getId(), LootTableHelper.createSimpleTable("aurorian_stone_brick", BlockRegistry.AURORIAN_STONE_BRICK.get()));
        //builder.accept(AURORIAN_STONE_BRICKS_STAIRS.getId(), LootTableHelper.createSimpleTable("aurorian_stone_bricks_stairs", () -> new StairsBloc
    }
}
