package com.addafurniture.registry;

import com.addafurniture.AddaFurnitureMod;
import com.addafurniture.item.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // ==================== DRINKS ====================

    public static final Item WATER_BOTTLE_CUSTOM = register("water_bottle_custom",
            new DrinkItem(new FabricItemSettings().maxCount(16).food(ModFoods.WATER_BOTTLE)));

    public static final Item BEER_CAN = register("beer_can",
            new DrinkItem(new FabricItemSettings().maxCount(16).food(ModFoods.BEER)));

    public static final Item COLD_DRINK = register("cold_drink",
            new DrinkItem(new FabricItemSettings().maxCount(16).food(ModFoods.COLD_DRINK)));

    public static final Item COFFEE_MUG = register("coffee_mug",
            new DrinkItem(new FabricItemSettings().maxCount(1).food(ModFoods.COFFEE)));

    public static final Item JUICE_PACK = register("juice_pack",
            new DrinkItem(new FabricItemSettings().maxCount(16).food(ModFoods.JUICE)));

    public static final Item GREEN_TEA = register("green_tea",
            new DrinkItem(new FabricItemSettings().maxCount(16).food(ModFoods.GREEN_TEA)));

    public static final Item ENERGY_DRINK = register("energy_drink",
            new DrinkItem(new FabricItemSettings().maxCount(8).food(ModFoods.ENERGY_DRINK)));

    public static final Item LEMONADE = register("lemonade",
            new DrinkItem(new FabricItemSettings().maxCount(16).food(ModFoods.JUICE)));

    // ==================== BAGS ====================

    public static final Item SCHOOL_BAG = register("school_bag",
            new BagItem(new FabricItemSettings().maxCount(1).maxDamage(0)));

    public static final Item COLLEGE_BAG = register("college_bag",
            new BagItem(new FabricItemSettings().maxCount(1).maxDamage(0)));

    public static final Item LAPTOP_BAG = register("laptop_bag",
            new BagItem(new FabricItemSettings().maxCount(1).maxDamage(0)));

    public static final Item TRAVEL_BAG = register("travel_bag",
            new BagItem(new FabricItemSettings().maxCount(1).maxDamage(0)));

    public static final Item SLING_BAG = register("sling_bag",
            new BagItem(new FabricItemSettings().maxCount(1).maxDamage(0)));

    public static final Item GYM_BAG = register("gym_bag",
            new BagItem(new FabricItemSettings().maxCount(1).maxDamage(0)));

    public static final Item SHOPPING_BAG = register("shopping_bag",
            new BagItem(new FabricItemSettings().maxCount(1).maxDamage(0)));

    public static final Item TIFFIN_BOX = register("tiffin_box",
            new Item(new FabricItemSettings().maxCount(1)));

    // ==================== HELMETS / SAFETY ====================

    public static final Item BIKE_HELMET = register("bike_helmet",
            new BikeHelmetItem(new FabricItemSettings().maxCount(1).maxDamage(200)));

    public static final Item FULL_FACE_HELMET = register("full_face_helmet",
            new BikeHelmetItem(new FabricItemSettings().maxCount(1).maxDamage(350)));

    public static final Item CONSTRUCTION_HELMET = register("construction_helmet",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item SAFETY_VEST = register("safety_vest",
            new Item(new FabricItemSettings().maxCount(1)));

    // ==================== VEHICLES (Spawn Eggs / Placeable) ====================

    public static final Item CAR_SPAWN_EGG = register("car_spawn_egg",
            new SpawnEggItem(ModEntities.CAR_ENTITY, 0xFF0000, 0x333333,
                    new FabricItemSettings()));

    public static final Item BIKE_SPAWN_EGG = register("bike_spawn_egg",
            new SpawnEggItem(ModEntities.BIKE_ENTITY, 0xF4A035, 0x111111,
                    new FabricItemSettings()));

    public static final Item SCOOTER_SPAWN_EGG = register("scooter_spawn_egg",
            new SpawnEggItem(ModEntities.SCOOTER_ENTITY, 0x3399FF, 0xFFFFFF,
                    new FabricItemSettings()));

    // ==================== MOB SPAWN EGGS (Custom Mobs) ====================

    public static final Item ELEPHANT_SPAWN_EGG = register("elephant_spawn_egg",
            new SpawnEggItem(ModEntities.ELEPHANT, 0x808080, 0x5C4033,
                    new FabricItemSettings()));

    public static final Item TIGER_SPAWN_EGG = register("tiger_spawn_egg",
            new SpawnEggItem(ModEntities.TIGER, 0xFF6600, 0x000000,
                    new FabricItemSettings()));

    public static final Item LION_SPAWN_EGG = register("lion_spawn_egg",
            new SpawnEggItem(ModEntities.LION, 0xC8A83C, 0x8B4513,
                    new FabricItemSettings()));

    public static final Item GIRAFFE_SPAWN_EGG = register("giraffe_spawn_egg",
            new SpawnEggItem(ModEntities.GIRAFFE, 0xFFCC00, 0x8B4513,
                    new FabricItemSettings()));

    public static final Item ZEBRA_SPAWN_EGG = register("zebra_spawn_egg",
            new SpawnEggItem(ModEntities.ZEBRA, 0xFFFFFF, 0x000000,
                    new FabricItemSettings()));

    public static final Item HIPPO_SPAWN_EGG = register("hippo_spawn_egg",
            new SpawnEggItem(ModEntities.HIPPO, 0x9B8EA2, 0x7B6D7D,
                    new FabricItemSettings()));

    public static final Item GORILLA_SPAWN_EGG = register("gorilla_spawn_egg",
            new SpawnEggItem(ModEntities.GORILLA, 0x1A1A1A, 0x3D2B1F,
                    new FabricItemSettings()));

    public static final Item PENGUIN_SPAWN_EGG = register("penguin_spawn_egg",
            new SpawnEggItem(ModEntities.PENGUIN, 0x000000, 0xFFFFFF,
                    new FabricItemSettings()));

    public static final Item FLAMINGO_SPAWN_EGG = register("flamingo_spawn_egg",
            new SpawnEggItem(ModEntities.FLAMINGO, 0xFF69B4, 0xFF1493,
                    new FabricItemSettings()));

    public static final Item CROCODILE_SPAWN_EGG = register("crocodile_spawn_egg",
            new SpawnEggItem(ModEntities.CROCODILE, 0x2D5A27, 0x1A3A18,
                    new FabricItemSettings()));

    public static final Item SHARK_SPAWN_EGG = register("shark_spawn_egg",
            new SpawnEggItem(ModEntities.SHARK, 0x5B7FA6, 0xFFFFFF,
                    new FabricItemSettings()));

    public static final Item KANGAROO_SPAWN_EGG = register("kangaroo_spawn_egg",
            new SpawnEggItem(ModEntities.KANGAROO, 0xC4956A, 0x8B6347,
                    new FabricItemSettings()));

    // ==================== MOB DROPS ====================

    public static final Item ELEPHANT_TUSK = register("elephant_tusk",
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item TIGER_FUR = register("tiger_fur",
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item LION_MANE = register("lion_mane",
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item CROCODILE_SCALE = register("crocodile_scale",
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item SHARK_FIN = register("shark_fin",
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item KANGAROO_POUCH = register("kangaroo_pouch",
            new Item(new FabricItemSettings().maxCount(1)));

    // ==================== FOOD ====================

    public static final Item BURGER = register("burger",
            new Item(new FabricItemSettings().maxCount(16).food(ModFoods.BURGER)));

    public static final Item PIZZA_SLICE = register("pizza_slice",
            new Item(new FabricItemSettings().maxCount(16).food(ModFoods.PIZZA)));

    public static final Item SAMOSA = register("samosa",
            new Item(new FabricItemSettings().maxCount(16).food(ModFoods.SAMOSA)));

    public static final Item BIRYANI = register("biryani",
            new Item(new FabricItemSettings().maxCount(4).food(ModFoods.BIRYANI)));

    // ==================== MISC ====================

    public static final Item CRICKET_BAT = register("cricket_bat",
            new SwordItem(ToolMaterials.WOOD, 5, -2.5f, new FabricItemSettings()));

    public static final Item CRICKET_BALL = register("cricket_ball",
            new Item(new FabricItemSettings().maxCount(16)));

    public static final Item FOOTBALL = register("football",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item MOBILE_PHONE = register("mobile_phone",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item REMOTE_CONTROL = register("remote_control",
            new Item(new FabricItemSettings().maxCount(1)));

    // ==================== BLOCK ITEMS for all blocks ====================

    public static final Item WOODEN_CHAIR_ITEM = registerBlockItem("wooden_chair", ModBlocks.WOODEN_CHAIR);
    public static final Item GAMING_CHAIR_ITEM = registerBlockItem("gaming_chair", ModBlocks.GAMING_CHAIR);
    public static final Item PARTY_CHAIR_ITEM = registerBlockItem("party_chair", ModBlocks.PARTY_CHAIR);
    public static final Item SOFA_LEFT_ITEM = registerBlockItem("sofa_left", ModBlocks.SOFA_LEFT);
    public static final Item ALMIRAH_ITEM = registerBlockItem("almirah", ModBlocks.ALMIRAH);
    public static final Item STUDY_TABLE_ITEM = registerBlockItem("study_table", ModBlocks.STUDY_TABLE);
    public static final Item DINING_TABLE_ITEM = registerBlockItem("dining_table", ModBlocks.DINING_TABLE);
    public static final Item COMPUTER_DESK_ITEM = registerBlockItem("computer_desk", ModBlocks.COMPUTER_DESK);
    public static final Item DRAWER_CHEST_ITEM = registerBlockItem("drawer_chest", ModBlocks.DRAWER_CHEST);
    public static final Item BOOKSHELF_FANCY_ITEM = registerBlockItem("bookshelf_fancy", ModBlocks.BOOKSHELF_FANCY);
    public static final Item DOUBLE_BED_ITEM = registerBlockItem("double_bed", ModBlocks.DOUBLE_BED);
    public static final Item BUNK_BED_ITEM = registerBlockItem("bunk_bed", ModBlocks.BUNK_BED);
    public static final Item GAMING_PC_ITEM = registerBlockItem("gaming_pc", ModBlocks.GAMING_PC);
    public static final Item NOOB_PC_ITEM = registerBlockItem("noob_pc", ModBlocks.NOOB_PC);
    public static final Item MONITOR_SMALL_ITEM = registerBlockItem("monitor_small", ModBlocks.MONITOR_SMALL);
    public static final Item MONITOR_LARGE_ITEM = registerBlockItem("monitor_large", ModBlocks.MONITOR_LARGE);
    public static final Item SMART_TV_ITEM = registerBlockItem("smart_tv", ModBlocks.SMART_TV);
    public static final Item WIFI_ROUTER_ITEM = registerBlockItem("wifi_router", ModBlocks.WIFI_ROUTER);
    public static final Item AIR_CONDITIONER_ITEM = registerBlockItem("air_conditioner", ModBlocks.AIR_CONDITIONER);
    public static final Item CEILING_FAN_ITEM = registerBlockItem("ceiling_fan", ModBlocks.CEILING_FAN);
    public static final Item REFRIGERATOR_ITEM = registerBlockItem("refrigerator", ModBlocks.REFRIGERATOR);
    public static final Item WASHING_MACHINE_ITEM = registerBlockItem("washing_machine", ModBlocks.WASHING_MACHINE);
    public static final Item MICROWAVE_ITEM = registerBlockItem("microwave", ModBlocks.MICROWAVE);
    public static final Item GAS_STOVE_ITEM = registerBlockItem("gas_stove", ModBlocks.GAS_STOVE);
    public static final Item TABLE_LAMP_ITEM = registerBlockItem("table_lamp", ModBlocks.TABLE_LAMP);
    public static final Item FLOOR_LAMP_ITEM = registerBlockItem("floor_lamp", ModBlocks.FLOOR_LAMP);
    public static final Item RGB_LED_STRIP_ITEM = registerBlockItem("rgb_led_strip", ModBlocks.RGB_LED_STRIP);
    public static final Item WALL_MIRROR_ITEM = registerBlockItem("wall_mirror", ModBlocks.WALL_MIRROR);
    public static final Item FIRE_EXTINGUISHER_ITEM = registerBlockItem("fire_extinguisher", ModBlocks.FIRE_EXTINGUISHER);
    public static final Item SECURITY_CAMERA_ITEM = registerBlockItem("security_camera", ModBlocks.SECURITY_CAMERA);
    public static final Item FUEL_PUMP_ITEM = registerBlockItem("fuel_pump", ModBlocks.FUEL_PUMP);
    public static final Item CARPET_RUG_ITEM = registerBlockItem("carpet_rug", ModBlocks.CARPET_RUG);

    // ==================== HELPERS ====================

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AddaFurnitureMod.MOD_ID, name), item);
    }

    private static Item registerBlockItem(String name, net.minecraft.block.Block block) {
        return Registry.register(Registries.ITEM,
                new Identifier(AddaFurnitureMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerItems() {
        AddaFurnitureMod.LOGGER.info("Registering AddaFurniture Items...");
    }
}
