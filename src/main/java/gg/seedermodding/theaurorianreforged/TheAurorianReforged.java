package gg.seedermodding.theaurorianreforged;

import gg.seedermodding.theaurorianreforged.handler.registry.BlockRegistry;
import gg.seedermodding.theaurorianreforged.handler.registry.ItemRegistry;
import gg.seedermodding.theaurorianreforged.util.Reference;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredItem;

@Mod(Reference.MODID)
public class TheAurorianReforged
{

    public TheAurorianReforged(IEventBus modEventBus)
    {
        BlockRegistry.registerBlocks(modEventBus);
        ItemRegistry.registerItems(modEventBus);
        Reference.CREATIVE_MODE_TABS.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTab() == Reference.BLOCKS_TAB.get())
        {
            event.accept(ItemRegistry.AURORIAN_COBBLESTONE.get());
            event.accept(ItemRegistry.AURORIAN_COBBLESTONE_STAIRS.get());
            event.accept(ItemRegistry.AURORIAN_DIRT.get());
            event.accept(ItemRegistry.AURORIAN_FARM_TILE.get());
            event.accept(ItemRegistry.AURORIAN_FURNACE_CHIMNEY.get());
            event.accept(ItemRegistry.AURORIAN_FURNACE_OFF.get());
            event.accept(ItemRegistry.AURORIAN_FURNACE_ON.get());
            event.accept(ItemRegistry.AURORIAN_GRASS.get());
            event.accept(ItemRegistry.AURORIAN_GRASS_LIGHT.get());
            event.accept(ItemRegistry.AURORIAN_PORTAL.get());
            event.accept(ItemRegistry.AURORIAN_PORTAL_FRAME_BRICKS.get());
            event.accept(ItemRegistry.AURORIAN_STONE.get());
            event.accept(ItemRegistry.AURORIAN_STONE_BRICK.get());
            event.accept(ItemRegistry.AURORIAN_STONE_BRICKS_STAIRS.get());
            event.accept(ItemRegistry.BOSS_SPAWNER_KEEPER.get());
            event.accept(ItemRegistry.BOSS_SPAWNER_MOON_QUEEN.get());
            event.accept(ItemRegistry.BOSS_SPAWNER_SPIDER.get());
            event.accept(ItemRegistry.CRYSTAL.get());
            event.accept(ItemRegistry.DUNGEON_STONE_DARK.get());
            event.accept(ItemRegistry.DUNGEON_STONE_DARK_FANCY.get());
            event.accept(ItemRegistry.DUNGEON_STONE_DARK_GATE.get());
            event.accept(ItemRegistry.DUNGEON_STONE_DARK_GATE_KEYHOLE.get());
            event.accept(ItemRegistry.DUNGEON_STONE_DARK_LAMP.get());
            event.accept(ItemRegistry.DUNGEON_STONE_DARK_LAYERS.get());
            event.accept(ItemRegistry.DUNGEON_STONE_DARK_STAIRS.get());
            event.accept(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE.get());
            event.accept(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_BARS.get());
            event.accept(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE.get());
            event.accept(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_CELL.get());
            event.accept(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE.get());
            event.accept(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE_CELL.get());
            event.accept(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_LAMP.get());
            event.accept(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_SMOOTH.get());
            event.accept(ItemRegistry.DUNGEON_STONE_MOON_TEMPLE_STAIRS.get());
            event.accept(ItemRegistry.DUNGEON_STONE_RUNE_STONE.get());
            event.accept(ItemRegistry.DUNGEON_STONE_RUNE_STONE_BARS.get());
            event.accept(ItemRegistry.DUNGEON_STONE_RUNE_STONE_GATE.get());
            event.accept(ItemRegistry.DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE.get());
            event.accept(ItemRegistry.DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE_LOOT.get());
            event.accept(ItemRegistry.DUNGEON_STONE_RUNE_STONE_GATE_LOOT.get());
            event.accept(ItemRegistry.DUNGEON_STONE_RUNE_STONE_LAMP.get());
            event.accept(ItemRegistry.DUNGEON_STONE_RUNE_STONE_SMOOTH.get());
            event.accept(ItemRegistry.DUNGEON_STONE_RUNE_STONE_STAIRS.get());


        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
