package gg.seedermodding.theaurorianreforged.handler.registry;

import gg.seedermodding.theaurorianreforged.block.*;
import gg.seedermodding.theaurorianreforged.util.Reference;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry
{
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Reference.MODID);
    public static final DeferredBlock<Block> AURORIAN_COBBLESTONE = BLOCKS.register("aurorian_cobblestone", AurorianCobblestone::new);
    public static final DeferredBlock<StairBlock> AURORIAN_COBBLESTONE_STAIRS = BLOCKS.register("aurorian_cobblestone_stairs", () -> new StairsBlock(AURORIAN_COBBLESTONE.get().defaultBlockState()));
    public static final DeferredBlock<Block>  AURORIAN_DIRT = BLOCKS.register("aurorian_dirt", AurorianDirt::new);
    public static final DeferredBlock<Block> AURORIAN_FARM_TILE = BLOCKS.register("aurorian_farm_tile", AurorianFarmTile::new);
    public static final DeferredBlock<Block> AURORIAN_FURNACE_CHIMNEY = BLOCKS.register("aurorian_furnace_chimney", AurorianFurnaceChimney::new);
    public static final DeferredBlock<Block> AURORIAN_FURNACE_OFF = BLOCKS.register("aurorian_furnace_off", AurorianFurnace::new);
    public static final DeferredBlock<Block> AURORIAN_FURNACE_ON = BLOCKS.register("aurorian_furnace_on", AurorianFurnace::new);
    public static final DeferredBlock<Block> AURORIAN_GRASS = BLOCKS.register("aurorian_grass", AurorianGrass::new);
    public static final DeferredBlock<Block> AURORIAN_GRASS_LIGHT = BLOCKS.register("aurorian_grass_light", AurorianGrass::new);
    public static final DeferredBlock<Block> AURORIAN_PORTAL = BLOCKS.register("aurorian_portal", AurorianPortal::new);
    public static final DeferredBlock<Block> AURORIAN_PORTAL_FRAME_BRICKS = BLOCKS.register("aurorian_portal_frame_bricks", AurorianPortalFrameBricks::new);
    public static final DeferredBlock<Block> AURORIAN_STONE = BLOCKS.register("aurorian_stone", AurorianStone::new);
    public static final DeferredBlock<Block> AURORIAN_STONE_BRICK = BLOCKS.register("aurorian_stone_brick", AurorianStoneBrick::new);
    public static final DeferredBlock<StairBlock> AURORIAN_STONE_BRICKS_STAIRS = BLOCKS.register("aurorian_stone_bricks_stairs", () -> new StairsBlock(AURORIAN_STONE_BRICK.get().defaultBlockState()));
    public static final DeferredBlock<Block> BOSS_SPAWNER_KEEPER = BLOCKS.register("boss_spawner_keeper", BossSpawner::new);
    public static final DeferredBlock<Block> BOSS_SPAWNER_MOON_QUEEN = BLOCKS.register("boss_spawner_moon_queen", BossSpawner::new);
    public static final DeferredBlock<Block> BOSS_SPAWNER_SPIDER = BLOCKS.register("boss_spawner_spider", BossSpawner::new);
    public static final DeferredBlock<Block> CRYSTAL = BLOCKS.register("crystal", CrystalBlock::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_DARK = BLOCKS.register("dungeon_stone_dark", DungeonStone::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_DARK_FANCY = BLOCKS.register("dungeon_stone_dark_fancy", DungeonStone::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_DARK_GATE = BLOCKS.register("dungeon_stone_dark_gate", DungeonStoneGate::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_DARK_GATE_KEYHOLE = BLOCKS.register("dungeon_stone_dark_gate_keyhole", DungeonStoneGateKeyhole::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_DARK_LAMP = BLOCKS.register("dungeon_stone_dark_lamp", DungeonStoneLamp::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_DARK_LAYERS = BLOCKS.register("dungeon_stone_dark_layers", DungeonStone::new);
    public static final DeferredBlock<StairBlock> DUNGEON_STONE_DARK_STAIRS = BLOCKS.register("dungeon_stone_dark_stairs", () -> new StairsBlock(DUNGEON_STONE_DARK.get().defaultBlockState()));
    public static final DeferredBlock<Block> DUNGEON_STONE_MOON_TEMPLE = BLOCKS.register("dungeon_stone_moon_temple", DungeonStone::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_MOON_TEMPLE_BARS = BLOCKS.register("dungeon_stone_moon_temple_bars", DungeonStoneBars::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_MOON_TEMPLE_GATE = BLOCKS.register("dungeon_stone_moon_temple_gate", DungeonStoneGate::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_MOON_TEMPLE_GATE_CELL = BLOCKS.register("dungeon_stone_moon_temple_gate_cell", DungeonStoneGate::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE = BLOCKS.register("dungeon_stone_moon_temple_gate_keyhole", DungeonStoneGateKeyhole::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_MOON_TEMPLE_GATE_KEYHOLE_CELL = BLOCKS.register("dungeon_stone_moon_temple_gate_keyhole_cell", DungeonStoneGateKeyhole::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_MOON_TEMPLE_LAMP = BLOCKS.register("dungeon_stone_moon_temple_lamp", DungeonStoneLamp::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_MOON_TEMPLE_SMOOTH = BLOCKS.register("dungeon_stone_moon_temple_smooth", DungeonStoneSmooth::new);
    public static final DeferredBlock<StairBlock> DUNGEON_STONE_MOON_TEMPLE_STAIRS = BLOCKS.register("dungeon_stone_moon_temple_stairs", () -> new StairsBlock(DUNGEON_STONE_MOON_TEMPLE.get().defaultBlockState()));
    public static final DeferredBlock<Block> DUNGEON_STONE_RUNE_STONE = BLOCKS.register("dungeon_stone_rune_stone", DungeonStone::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_RUNE_STONE_BARS = BLOCKS.register("dungeon_stone_rune_stone_bars", DungeonStoneBars::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_RUNE_STONE_GATE = BLOCKS.register("dungeon_stone_rune_stone_gate", DungeonStoneGate::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE = BLOCKS.register("dungeon_stone_rune_stone_gate_keyhole", DungeonStoneGateKeyhole::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_RUNE_STONE_GATE_KEYHOLE_LOOT = BLOCKS.register("dungeon_stone_rune_stone_gate_keyhole_loot",DungeonStoneGateKeyhole::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_RUNE_STONE_GATE_LOOT = BLOCKS.register("dungeon_stone_rune_stone_gate_loot", DungeonStoneGate::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_RUNE_STONE_LAMP = BLOCKS.register("dungeon_stone_rune_stone_lamp", DungeonStoneLamp::new);
    public static final DeferredBlock<Block> DUNGEON_STONE_RUNE_STONE_SMOOTH = BLOCKS.register("dungeon_stone_rune_stone_smooth", DungeonStoneSmooth::new);
    public static final DeferredBlock<StairBlock> DUNGEON_STONE_RUNE_STONE_STAIRS = BLOCKS.register("dungeon_stone_rune_stone_stairs", () -> new StairsBlock(DUNGEON_STONE_RUNE_STONE.get().defaultBlockState()));
       /* FLUIDMOLTENCERULEAN(new MoltenCeruleanFluidBlock()),
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

    public static void registerBlocks(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
