package gg.seedermodding.theaurorianreforged.data;

import gg.seedermodding.theaurorianreforged.handler.registry.BlockRegistry;
import gg.seedermodding.theaurorianreforged.handler.registry.ItemRegistry;
import gg.seedermodding.theaurorianreforged.util.Reference;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class AurorianBlockTags extends BlockTagsProvider
{
    public AurorianBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, ExistingFileHelper helper)
    {
        super(output, provider, Reference.MODID, helper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockRegistry.AURORIAN_COBBLESTONE.get())
                //.add(AURORIAN_COBBLESTONE_STAIRS.get(), LootTableHelper.createSimpleTable("aurorian_cobblestone_stairs", () -> new StairsBlock(new AurorianCobblestone()));
                .add(BlockRegistry.AURORIAN_FURNACE_CHIMNEY.get())
                .add(BlockRegistry.AURORIAN_FURNACE_OFF.get())
                .add(BlockRegistry.AURORIAN_FURNACE_ON.get())
                .add(BlockRegistry.AURORIAN_PORTAL.get())
                .add(BlockRegistry.AURORIAN_PORTAL_FRAME_BRICKS.get())
                .add(BlockRegistry.AURORIAN_STONE.get())
                .add(BlockRegistry.AURORIAN_STONE_BRICK.get());
                //.add(AURORIAN_STONE_BRICKS_STAIRS.get(), LootTableHelper.createSimpleTable("aurorian_stone_bricks_stairs", () -> new StairsBloc
        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(BlockRegistry.AURORIAN_DIRT.get())
                .add(BlockRegistry.AURORIAN_FARM_TILE.get())
                .add(BlockRegistry.AURORIAN_GRASS.get())
                .add(BlockRegistry.AURORIAN_GRASS_LIGHT.get());
    }
}
