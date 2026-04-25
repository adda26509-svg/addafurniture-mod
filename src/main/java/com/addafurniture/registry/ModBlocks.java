package com.addafurniture.registry;

import com.addafurniture.AddaFurnitureMod;
import com.addafurniture.block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // ==================== FURNITURE ====================

    public static final Block WOODEN_CHAIR = register("wooden_chair",
            new ChairBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.5f)));

    public static final Block GAMING_CHAIR = register("gaming_chair",
            new ChairBlock(FabricBlockSettings.create().mapColor(MapColor.RED).strength(1.5f)
                    .sounds(BlockSoundGroup.WOOL)));

    public static final Block PARTY_CHAIR = register("party_chair",
            new ChairBlock(FabricBlockSettings.create().mapColor(MapColor.GOLD).strength(1.5f)
                    .sounds(BlockSoundGroup.WOOL)));

    public static final Block SOFA_LEFT = register("sofa_left",
            new SofaBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(1.5f)
                    .sounds(BlockSoundGroup.WOOL)));

    public static final Block SOFA_MIDDLE = register("sofa_middle",
            new SofaBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(1.5f)
                    .sounds(BlockSoundGroup.WOOL)));

    public static final Block SOFA_RIGHT = register("sofa_right",
            new SofaBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(1.5f)
                    .sounds(BlockSoundGroup.WOOL)));

    public static final Block ALMIRAH = register("almirah",
            new AlmirahBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f)));

    public static final Block STUDY_TABLE = register("study_table",
            new TableBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.5f)));

    public static final Block DINING_TABLE = register("dining_table",
            new TableBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.5f)));

    public static final Block COMPUTER_DESK = register("computer_desk",
            new TableBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.5f)));

    public static final Block DRAWER_CHEST = register("drawer_chest",
            new DrawerBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f)));

    public static final Block BOOKSHELF_FANCY = register("bookshelf_fancy",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF).strength(1.5f)));

    public static final Block WALL_SHELF = register("wall_shelf",
            new WallShelfBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.0f)));

    public static final Block DOUBLE_BED = register("double_bed",
            new Block(FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(0.2f)
                    .sounds(BlockSoundGroup.WOOL)));

    public static final Block BUNK_BED = register("bunk_bed",
            new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(0.2f)
                    .sounds(BlockSoundGroup.WOOL)));

    // ==================== TECH / GAMING ====================

    public static final Block GAMING_PC = register("gaming_pc",
            new GamingPCBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(2.0f)
                    .sounds(BlockSoundGroup.METAL).luminance(state -> 7)));

    public static final Block NOOB_PC = register("noob_pc",
            new GamingPCBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(2.0f)
                    .sounds(BlockSoundGroup.METAL).luminance(state -> 3)));

    public static final Block MONITOR_SMALL = register("monitor_small",
            new MonitorBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(1.5f)
                    .sounds(BlockSoundGroup.METAL).luminance(state -> 10)));

    public static final Block MONITOR_LARGE = register("monitor_large",
            new MonitorBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(1.5f)
                    .sounds(BlockSoundGroup.METAL).luminance(state -> 12)));

    public static final Block SMART_TV = register("smart_tv",
            new MonitorBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(1.5f)
                    .sounds(BlockSoundGroup.METAL).luminance(state -> 12)));

    public static final Block WIFI_ROUTER = register("wifi_router",
            new Block(FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(0.5f)
                    .sounds(BlockSoundGroup.METAL).luminance(state -> 4)));

    // ==================== APPLIANCES ====================

    public static final Block AIR_CONDITIONER = register("air_conditioner",
            new ApplianceBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(3.0f)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block CEILING_FAN = register("ceiling_fan",
            new CeilingFanBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(1.5f)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block REFRIGERATOR = register("refrigerator",
            new ApplianceBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(3.0f)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block WASHING_MACHINE = register("washing_machine",
            new ApplianceBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(3.0f)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block MICROWAVE = register("microwave",
            new ApplianceBlock(FabricBlockSettings.create().mapColor(MapColor.WHITE).strength(1.5f)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block GAS_STOVE = register("gas_stove",
            new ApplianceBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).strength(2.0f)
                    .sounds(BlockSoundGroup.METAL)));

    // ==================== DECOR / LIGHTING ====================

    public static final Block TABLE_LAMP = register("table_lamp",
            new LampBlock(FabricBlockSettings.create().mapColor(MapColor.YELLOW).strength(0.5f)
                    .luminance(state -> state.get(LampBlock.LIT) ? 14 : 0)));

    public static final Block FLOOR_LAMP = register("floor_lamp",
            new LampBlock(FabricBlockSettings.create().mapColor(MapColor.YELLOW).strength(0.5f)
                    .luminance(state -> state.get(LampBlock.LIT) ? 15 : 0)));

    public static final Block RGB_LED_STRIP = register("rgb_led_strip",
            new RGBLedBlock(FabricBlockSettings.create().mapColor(MapColor.MAGENTA).strength(0.2f)
                    .luminance(state -> 10)));

    public static final Block WALL_MIRROR = register("wall_mirror",
            new Block(FabricBlockSettings.create().mapColor(MapColor.LIGHT_BLUE).strength(0.5f)
                    .sounds(BlockSoundGroup.GLASS)));

    public static final Block PHOTO_FRAME = register("photo_frame",
            new Block(FabricBlockSettings.create().strength(0.3f)));

    public static final Block WALL_CLOCK = register("wall_clock",
            new WallClockBlock(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(0.5f)));

    public static final Block CARPET_RUG = register("carpet_rug",
            new Block(FabricBlockSettings.create().mapColor(MapColor.RED).strength(0.1f)
                    .sounds(BlockSoundGroup.WOOL)));

    // ==================== SAFETY ====================

    public static final Block FIRE_EXTINGUISHER = register("fire_extinguisher",
            new Block(FabricBlockSettings.create().mapColor(MapColor.RED).strength(1.5f)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block SECURITY_CAMERA = register("security_camera",
            new Block(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(1.5f)
                    .sounds(BlockSoundGroup.METAL).luminance(state -> 2)));

    // ==================== VEHICLES (decorative) ====================

    public static final Block FUEL_PUMP = register("fuel_pump",
            new Block(FabricBlockSettings.create().mapColor(MapColor.RED).strength(3.0f)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block TRAFFIC_CONE = register("traffic_cone",
            new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5f)));

    // ==================== HELPER ====================

    private static Block register(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(AddaFurnitureMod.MOD_ID, name), block);
    }

    public static void registerBlocks() {
        AddaFurnitureMod.LOGGER.info("Registering AddaFurniture Blocks...");
    }
}
