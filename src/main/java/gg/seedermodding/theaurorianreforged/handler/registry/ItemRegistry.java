package gg.seedermodding.theaurorianreforged.handler.registry;

import gg.seedermodding.theaurorianreforged.util.Reference;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry
{
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Reference.MODID);
    public static final DeferredItem<BlockItem> AURORIAN_COBBLESTONE = ITEMS.register("aurorian_cobblestone", () -> new BlockItem(BlockRegistry.AURORIAN_COBBLESTONE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> AURORIAN_COBBLESTONE_STAIRS = ITEMS.register("aurorian_cobblestone_stairs", () -> new BlockItem(BlockRegistry.AURORIAN_COBBLESTONE_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem>  AURORIAN_DIRT = ITEMS.register("aurorian_dirt", () -> new BlockItem(BlockRegistry.AURORIAN_DIRT.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> AURORIAN_FARM_TILE = ITEMS.register("aurorian_farm_tile", () -> new BlockItem(BlockRegistry.AURORIAN_FARM_TILE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> AURORIAN_FURNACE_CHIMNEY = ITEMS.register("aurorian_furnace_chimney", () -> new BlockItem(BlockRegistry.AURORIAN_FURNACE_CHIMNEY.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> AURORIAN_FURNACE_OFF = ITEMS.register("aurorian_furnace_off", () -> new BlockItem(BlockRegistry.AURORIAN_FURNACE_OFF.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> AURORIAN_FURNACE_ON = ITEMS.register("aurorian_furnace_on", () -> new BlockItem(BlockRegistry.AURORIAN_FURNACE_ON.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> AURORIAN_GRASS = ITEMS.register("aurorian_grass", () -> new BlockItem(BlockRegistry.AURORIAN_GRASS.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> AURORIAN_GRASS_LIGHT = ITEMS.register("aurorian_grass_light", () -> new BlockItem(BlockRegistry.AURORIAN_GRASS_LIGHT.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> AURORIAN_PORTAL = ITEMS.register("aurorian_portal", () -> new BlockItem(BlockRegistry.AURORIAN_PORTAL.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> AURORIAN_PORTAL_FRAME_BRICKS = ITEMS.register("aurorian_portal_frame_bricks", () -> new BlockItem(BlockRegistry.AURORIAN_PORTAL_FRAME_BRICKS.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> AURORIAN_STONE = ITEMS.register("aurorian_stone", () -> new BlockItem(BlockRegistry.AURORIAN_STONE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> AURORIAN_STONE_BRICK = ITEMS.register("aurorian_stone_brick", () -> new BlockItem(BlockRegistry.AURORIAN_STONE_BRICK.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> AURORIAN_STONE_BRICKS_STAIRS = ITEMS.register("aurorian_stone_bricks_stairs", () -> new BlockItem(BlockRegistry.AURORIAN_STONE_BRICKS_STAIRS.get(), new Item.Properties()));

    public static final DeferredItem<BlockItem> BOSS_SPAWNER_KEEPER = ITEMS.register("boss_spawner_keeper", () -> new BlockItem(BlockRegistry.BOSS_SPAWNER_KEEPER.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> BOSS_SPAWNER_MOON_QUEEN = ITEMS.register("boss_spawner_moon_queen", () -> new BlockItem(BlockRegistry.BOSS_SPAWNER_MOON_QUEEN.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> BOSS_SPAWNER_SPIDER = ITEMS.register("boss_spawner_spider", () -> new BlockItem(BlockRegistry.BOSS_SPAWNER_SPIDER.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> CRYSTAL = ITEMS.register("crystal", () -> new BlockItem(BlockRegistry.CRYSTAL.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_DARK = ITEMS.register("dungeon_stone_dark", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_DARK.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_DARK_FANCY = ITEMS.register("dungeon_stone_dark_fancy", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_DARK_FANCY.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_DARK_GATE = ITEMS.register("dungeon_stone_dark_gate", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_DARK_GATE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_DARK_GATE_KEYHOLE = ITEMS.register("dungeon_stone_dark_gate_keyhole", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_DARK_GATE_KEYHOLE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_DARK_LAMP = ITEMS.register("dungeon_stone_dark_lamp", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_DARK_LAMP.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_DARK_LAYERS = ITEMS.register("dungeon_stone_dark_layers", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_DARK_LAYERS.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_DARK_STAIRS = ITEMS.register("dungeon_stone_dark_stairs", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_DARK_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_MOON_TEMPLE = ITEMS.register("dungeon_stone_moon_temple", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_MOON_TEMPLE_BARS = ITEMS.register("dungeon_stone_moon_temple_bars", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_BARS.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_MOON_TEMPLE_GATE = ITEMS.register("dungeon_stone_moon_temple_gate", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_MOON_TEMPLE_GATE_CELL = ITEMS.register("dungeon_stone_moon_temple_gate_cell", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_CELL.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE = ITEMS.register("dungeon_stone_moon_temple_gate_keyhole", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE_CELL = ITEMS.register("dungeon_stone_moon_temple_gate_keyhole_cell", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE_CELL.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_MOON_TEMPLE_LAMP = ITEMS.register("dungeon_stone_moon_temple_lamp", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_LAMP.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_MOON_TEMPLE_SMOOTH = ITEMS.register("dungeon_stone_moon_temple_smooth", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_SMOOTH.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_MOON_TEMPLE_STAIRS = ITEMS.register("dungeon_stone_moon_temple_stairs", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_MOON_TEMPLE_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_RUNE_STONE = ITEMS.register("dungeon_stone_rune_stone", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_RUNE_STONE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_RUNE_STONE_BARS = ITEMS.register("dungeon_stone_rune_stone_bars", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_RUNE_STONE_BARS.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_RUNE_STONE_GATE = ITEMS.register("dungeon_stone_rune_stone_gate", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_RUNE_STONE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE = ITEMS.register("dungeon_stone_rune_stone_gate_keyhole", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE_LOOT = ITEMS.register("dungeon_stone_rune_stone_gate_keyhole_loot",() -> new BlockItem(BlockRegistry.DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE_LOOT.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_RUNE_STONE_GATE_LOOT = ITEMS.register("dungeon_stone_rune_stone_gate_loot", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_RUNE_STONE_GATE_LOOT.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_RUNE_STONE_LAMP = ITEMS.register("dungeon_stone_rune_stone_lamp", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_RUNE_STONE_LAMP.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_RUNE_STONE_SMOOTH = ITEMS.register("dungeon_stone_rune_stone_smooth", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_RUNE_STONE_SMOOTH.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> DUNGEON_STONE_RUNE_STONE_STAIRS = ITEMS.register("dungeon_stone_rune_stone_stairs", () -> new BlockItem(BlockRegistry.DUNGEON_STONE_RUNE_STONE_STAIRS.get(), new Item.Properties()));
    
    
    /*  AURORIANCOBBLESTONESTAIRS(new StairsBlock(new AurorianCobblestone(), StairsBlock.BLOCKNAME_AURORIANCOBBLESTONE)),
        AURORIANDIRT(new AurorianDirt()),
        AURORIANFARMTILE(new AurorianFarmTile()),
        AURORIANFURNACECHIMNEY(new AurorianFurnaceChimney()),
        AURORIANFURNACEOFF(new AurorianFurnace(false)),
        AURORIANFURNACEON(new AurorianFurnace(true)),
        AURORIANGRASS(new AurorianGrass(AurorianGrass.BLOCKNAME)),
        AURORIANGRASSLIGHT(new AurorianGrass(AurorianGrass.BLOCKNAME_LIGHT)),
        AURORIANPORTAL(new AurorianPortal()),
        AURORIANPORTALFRAME(new AurorianPortalframeBricks()),
        AURORIANSTONE(new AurorianStone()),
        AURORIANSTONEBRICK(new AurorianStoneBrick()),
        AURORIANSTONEBRICKSSTAIRS(new StairsBlock(new AurorianStoneBrick(), StairsBlock.BLOCKNAME_AURORIANSTONE)),
        BOSSSPAWNERKEEPER(new BossSpawner(BossSpawner.Bosses.KEEPER)),
        BOSSSPAWNERMOONQUEEN(new BossSpawner(BossSpawner.Bosses.MOONQUEEN)),
        BOSSSPAWNERSPIDER(new BossSpawner(BossSpawner.Bosses.SPIDER)),
        CRYSTAL(new CrystalBlock()),
        DUNGEONSTONEDARK(new DungeonStone(DungeonStone.BLOCKNAME_DARK)),
        DUNGEONSTONEDARKFANCY(new DungeonStone(DungeonStone.BLOCKNAME_DARK_FANCY)),
        DUNGEONSTONEDARKGATE(new DungeonStoneGate(DungeonStoneGate.BLOCKNAME_DARK, DungeonStoneGateKeyhole.BLOCKNAME_DARK)),
        DUNGEONSTONEDARKGATEKEYHOLE(new DungeonStoneGateKeyhole(DungeonStoneGateKeyhole.BLOCKNAME_DARK, DungeonStoneGate.BLOCKNAME_DARK, DungeonKeyItem.Keys.DARKSTONE)),
        DUNGEONSTONEDARKLAMP(new DungeonStoneLamp(DungeonStoneLamp.BLOCKNAME_DARK)),
        DUNGEONSTONEDARKLAYERS(new DungeonStone(DungeonStone.BLOCKNAME_DARK_LAYERS)),
        DUNGEONSTONEDARKSTAIRS(new StairsBlock(new DungeonStone(DungeonStone.BLOCKNAME_DARK), StairsBlock.BLOCKNAME_DARK)),
        DUNGEONSTONEMOONTEMPLE(new DungeonStone(DungeonStone.BLOCKNAME_MOONTEMPLE)),
        DUNGEONSTONEMOONTEMPLEBARS(new DungeonStoneBars(DungeonStoneBars.BLOCKNAME_MOONTEMPLE)),
        DUNGEONSTONEMOONTEMPLEGATE(new DungeonStoneGate(DungeonStoneGate.BLOCKNAME_MOONTEMPLE, DungeonStoneGateKeyhole.BLOCKNAME_MOONTEMPLE)),
        DUNGEONSTONEMOONTEMPLEGATECELL(new DungeonStoneGate(DungeonStoneGate.BLOCKNAME_MOONTEMPLECELL, DungeonStoneGateKeyhole.BLOCKNAME_MOONTEMPLECELL)),
        DUNGEONSTONEMOONTEMPLEGATEKEYHOLE(new DungeonStoneGateKeyhole(DungeonStoneGateKeyhole.BLOCKNAME_MOONTEMPLE, DungeonStoneGate.BLOCKNAME_MOONTEMPLE, DungeonKeyItem.Keys.MOONTEMPLE)),
        DUNGEONSTONEMOONTEMPLEGATEKEYHOLECELL(new DungeonStoneGateKeyhole(DungeonStoneGateKeyhole.BLOCKNAME_MOONTEMPLECELL, DungeonStoneGate.BLOCKNAME_MOONTEMPLECELL, DungeonKeyItem.Keys.MOONTEMPLECELL)),
        DUNGEONSTONEMOONTEMPLELAMP(new DungeonStoneLamp(DungeonStoneLamp.BLOCKNAME_MOONTEMPLE)),
        DUNGEONSTONEMOONTEMPLESMOOTH(new DungeonStoneSmooth(DungeonStoneSmooth.BLOCKNAME_MOONTEMPLE)),
        DUNGEONSTONEMOONTEMPLESTAIRS(new StairsBlock(new DungeonStone(DungeonStone.BLOCKNAME_MOONTEMPLE), StairsBlock.BLOCKNAME_MOONTEMPLE)),
        DUNGEONSTONERUNESTONE(new DungeonStone(DungeonStone.BLOCKNAME_RUNESTONE)),
        DUNGEONSTONERUNESTONEBARS(new DungeonStoneBars(DungeonStoneBars.BLOCKNAME_RUNESTONE)),
        DUNGEONSTONERUNESTONEGATE(new DungeonStoneGate(DungeonStoneGate.BLOCKNAME_RUNESTONE, DungeonStoneGateKeyhole.BLOCKNAME_RUNESTONE)),
        DUNGEONSTONERUNESTONEGATEKEYHOLE(new DungeonStoneGateKeyhole(DungeonStoneGateKeyhole.BLOCKNAME_RUNESTONE, DungeonStoneGate.BLOCKNAME_RUNESTONE, DungeonKeyItem.Keys.RUNESTONE, true)),
        DUNGEONSTONERUNESTONEGATEKEYHOLELOOT(new DungeonStoneGateKeyhole(DungeonStoneGateKeyhole.BLOCKNAME_RUNESTONELOOT, DungeonStoneGate.BLOCKNAME_RUNESTONELOOT, DungeonKeyItem.Keys.RUNESTONELOOT)),
        DUNGEONSTONERUNESTONEGATELOOT(new DungeonStoneGate(DungeonStoneGate.BLOCKNAME_RUNESTONELOOT, DungeonStoneGateKeyhole.BLOCKNAME_RUNESTONELOOT)),
        DUNGEONSTONERUNESTONELAMP(new DungeonStoneLamp(DungeonStoneLamp.BLOCKNAME_RUNESTONE)),
        DUNGEONSTONERUNESTONESMOOTH(new DungeonStoneSmooth(DungeonStoneSmooth.BLOCKNAME_RUNESTONE)),
        DUNGEONSTONERUNESTONESTAIRS(new StairsBlock(new DungeonStone(DungeonStone.BLOCKNAME_RUNESTONE), StairsBlock.BLOCKNAME_RUNESTONE)),
        FLUIDMOLTENCERULEAN(new MoltenCeruleanFluidBlock()),
        FLUIDMOLTENMOONSTONE(new MoltenMoonstoneFluidBlock()),
        FLUIDMOLTENAURORIANSTEEL(new MoltenAurorianSteelFluidBlock()),
        FLUIDMOONWATER(new MoonwaterFluidBlock()),
        GLASSAURORIAN(new AurorianGlass(AurorianGlass.BLOCKNAME_AURORIAN)),
        GLASSMOON(new AurorianGlass(AurorianGlass.BLOCKNAME_MOONGLASS)),
        GLASSPANEAURORIAN(new AurorianGlassPane(AurorianGlassPane.BLOCKNAME_AURORIAN)),
        GLASSPANEMOON(new AurorianGlassPane(AurorianGlassPane.BLOCKNAME_MOONGLASS)),
        MATERIALAURORIANSTEEL(new MaterialBlock(MaterialBlock.BLOCKNAME_AURORIANSTEEL)),
        MATERIALCERULEAN(new MaterialBlock(MaterialBlock.BLOCKNAME_CERULEAN)),
        MATERIALCOAL(new MaterialBlock(MaterialBlock.BLOCKNAME_COAL)),
        MATERIALMOONSTONE(new MaterialBlock(MaterialBlock.BLOCKNAME_MOONSTONE)),
        MOONGEM(new MoonGem()),
        MOONLIGHTFORGE(new MoonLightForge()),
        MOONSAND(new Moonsand()),
        MOONTORCH(new MoonTorch()),
        MUSHROOM(new IndigoMushroom()),
        MUSHROOMCRYSTAL(new IndigoMushroomCrystal()),
        MUSHROOMSMALL(new IndigoMushroomSmall()),
        MUSHROOMSTEM(new IndigoMushroomStem()),
        MYSTICALBARRIER(new MysticalBarrier()),
        OREAURORIANCOAL(new AurorianCoalOre()),
        ORECERULEAN(new CeruleanOre()),
        OREGEODE(new GeodeOre()),
        OREMOONSTONE(new MoonstoneOre()),
        PERIDOTITE(new Peridotite(Peridotite.BLOCKNAME)),
        PERIDOTITESMOOTH(new Peridotite(Peridotite.BLOCKNAME_SMOOTH)),
        PERIDOTITESMOOTHSTAIRS(new StairsBlock(new Peridotite(Peridotite.BLOCKNAME_SMOOTH), StairsBlock.BLOCKNAME_PERIDOTITESMOOTH)),
        PLANTLAVENDER(new LavenderBlock()),
        PLANTLAVENDERCROP(new CropsBlock(CropsBlock.BLOCKNAME_LAVENDER)),
        PLANTPETUNIA(new PetuniaBlock()),
        PLANTSILENTWOODSAPLING(new SilentwoodSapling()),
        PLANTSILKBERRY(new SilkberryBlock()),
        PLANTSILKBERRYCROP(new CropsBlock(CropsBlock.BLOCKNAME_SILKBERRY)),
        PLANTTALLGRASS(new AurorianTallgrass()),
        PLANTTALLGRASSLIGHT(new AurorianTallgrassLight()),
        SCRAPPER(new ScrapperBlock()),
        SILENTWOODCHEST(new SilentwoodChest()),
        SILENTWOODLADDER(new SilentwoodLadder()),
        SILENTWOODLEAVES(new SilentwoodLeaves()),
        SILENTWOODLOG(new SilentwoodLog()),
        SILENTWOODPLANKS(new SilentwoodPlanks()),
        SILENTWOODPLANKSSTAIRS(new StairsBlock(new SilentwoodPlanks(), StairsBlock.BLOCKNAME_SILENTWOOD)),
        SILENTWOODTORCH(new SilentwoodTorch()),
        SILENTWOODWORKBENCH(new SilentwoodWorkbench()),
        UMBRASTONE(new UmbraStone(UmbraStone.BLOCKNAME_UMBRASTONE)),
        UMBRASTONECRACKED(new UmbraStone(UmbraStone.BLOCKNAME_UMBRASTONECRACKED)),
        UMBRASTONEROOFTILES(new UmbraStone(UmbraStone.BLOCKNAME_UMBRASTONEROOFTILES)),
        UMBRASTONEROOFTILESSTAIRS(new StairsBlock(new UmbraStone(UmbraStone.BLOCKNAME_UMBRASTONEROOFTILES), StairsBlock.BLOCKNAME_UMBRASTONEROOFTILES)),
        URN(new UrnBlock()),
        WEEPINGWILLOWLEAVES(new WeepingWillowLeaves()),
        WEEPINGWILLOWLOG(new WeepingWillowLog()),
        WEEPINGWILLOWPLANKS(new WeepingWillowPlanks()),
        WEEPINGWILLOWPLANKSSTAIRS(new StairsBlock(new UmbraStone(WeepingWillowPlanks.BLOCKNAME), StairsBlock.BLOCKNAME_WEEPINGWILLOWPLANKS)),
        WEEPINGWILLOWSAPLING(new WeepingWillowSapling());

    }*/

    public static void registerItems(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
