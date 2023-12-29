package gg.seedermodding.theaurorianreforged.util;

import com.mojang.logging.LogUtils;
import gg.seedermodding.theaurorianreforged.handler.registry.ItemRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

public class Reference
{
    public static final String MODID = "theaurorianreforged";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("blocks_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ItemRegistry.AURORIAN_COBBLESTONE.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistry.AURORIAN_COBBLESTONE.get());
                output.accept(ItemRegistry.AURORIAN_DIRT.get());
                output.accept(ItemRegistry.AURORIAN_FARM_TILE.get());
            }).build());
}
