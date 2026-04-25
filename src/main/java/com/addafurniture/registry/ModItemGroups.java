package com.addafurniture.registry;

import com.addafurniture.AddaFurnitureMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    // ── MAIN GROUP ──────────────────────────────────────────────────
    public static final RegistryKey<ItemGroup> ADDAFURNITURE_GROUP = RegistryKey.of(
            RegistryKeys.ITEM_GROUP,
            new Identifier(AddaFurnitureMod.MOD_ID, "main")
    );

    // ── MOBS GROUP ──────────────────────────────────────────────────
    public static final RegistryKey<ItemGroup> ADDAFURNITURE_MOBS = RegistryKey.of(
            RegistryKeys.ITEM_GROUP,
            new Identifier(AddaFurnitureMod.MOD_ID, "mobs")
    );

    public static void registerItemGroups() {

        // MAIN TAB — Furniture, Drinks, Tech, Vehicles, etc.
        Registry.register(Registries.ITEM_GROUP, ADDAFURNITURE_GROUP,
                FabricItemGroup.builder()
                        .icon(() -> new ItemStack(ModBlocks.GAMING_PC))
                        .displayName(Text.translatable("itemGroup.addafurniture.main"))
                        .entries((ctx, entries) -> {
                            // Drinks
                            entries.add(ModItems.WATER_BOTTLE_CUSTOM);
                            entries.add(ModItems.BEER_CAN);
                            entries.add(ModItems.COLD_DRINK);
                            entries.add(ModItems.COFFEE_MUG);
                            entries.add(ModItems.JUICE_PACK);
                            entries.add(ModItems.GREEN_TEA);
                            entries.add(ModItems.ENERGY_DRINK);
                            entries.add(ModItems.LEMONADE);
                            // Food
                            entries.add(ModItems.BURGER);
                            entries.add(ModItems.PIZZA_SLICE);
                            entries.add(ModItems.SAMOSA);
                            entries.add(ModItems.BIRYANI);
                            // Furniture blocks
                            entries.add(new ItemStack(ModBlocks.WOODEN_CHAIR));
                            entries.add(new ItemStack(ModBlocks.GAMING_CHAIR));
                            entries.add(new ItemStack(ModBlocks.PARTY_CHAIR));
                            entries.add(new ItemStack(ModBlocks.SOFA_LEFT));
                            entries.add(new ItemStack(ModBlocks.SOFA_MIDDLE));
                            entries.add(new ItemStack(ModBlocks.SOFA_RIGHT));
                            entries.add(new ItemStack(ModBlocks.ALMIRAH));
                            entries.add(new ItemStack(ModBlocks.STUDY_TABLE));
                            entries.add(new ItemStack(ModBlocks.DINING_TABLE));
                            entries.add(new ItemStack(ModBlocks.COMPUTER_DESK));
                            entries.add(new ItemStack(ModBlocks.DRAWER_CHEST));
                            entries.add(new ItemStack(ModBlocks.BOOKSHELF_FANCY));
                            entries.add(new ItemStack(ModBlocks.WALL_SHELF));
                            entries.add(new ItemStack(ModBlocks.DOUBLE_BED));
                            entries.add(new ItemStack(ModBlocks.BUNK_BED));
                            // Tech
                            entries.add(new ItemStack(ModBlocks.GAMING_PC));
                            entries.add(new ItemStack(ModBlocks.NOOB_PC));
                            entries.add(new ItemStack(ModBlocks.MONITOR_SMALL));
                            entries.add(new ItemStack(ModBlocks.MONITOR_LARGE));
                            entries.add(new ItemStack(ModBlocks.SMART_TV));
                            entries.add(new ItemStack(ModBlocks.WIFI_ROUTER));
                            // Appliances
                            entries.add(new ItemStack(ModBlocks.AIR_CONDITIONER));
                            entries.add(new ItemStack(ModBlocks.CEILING_FAN));
                            entries.add(new ItemStack(ModBlocks.REFRIGERATOR));
                            entries.add(new ItemStack(ModBlocks.WASHING_MACHINE));
                            entries.add(new ItemStack(ModBlocks.MICROWAVE));
                            entries.add(new ItemStack(ModBlocks.GAS_STOVE));
                            // Decor
                            entries.add(new ItemStack(ModBlocks.TABLE_LAMP));
                            entries.add(new ItemStack(ModBlocks.FLOOR_LAMP));
                            entries.add(new ItemStack(ModBlocks.RGB_LED_STRIP));
                            entries.add(new ItemStack(ModBlocks.WALL_MIRROR));
                            entries.add(new ItemStack(ModBlocks.CARPET_RUG));
                            entries.add(new ItemStack(ModBlocks.WALL_CLOCK));
                            // Safety
                            entries.add(new ItemStack(ModBlocks.FIRE_EXTINGUISHER));
                            entries.add(new ItemStack(ModBlocks.SECURITY_CAMERA));
                            entries.add(new ItemStack(ModBlocks.FUEL_PUMP));
                            entries.add(new ItemStack(ModBlocks.TRAFFIC_CONE));
                            // Bags
                            entries.add(ModItems.SCHOOL_BAG);
                            entries.add(ModItems.COLLEGE_BAG);
                            entries.add(ModItems.LAPTOP_BAG);
                            entries.add(ModItems.TRAVEL_BAG);
                            entries.add(ModItems.SLING_BAG);
                            entries.add(ModItems.GYM_BAG);
                            entries.add(ModItems.SHOPPING_BAG);
                            entries.add(ModItems.TIFFIN_BOX);
                            // Helmets
                            entries.add(ModItems.BIKE_HELMET);
                            entries.add(ModItems.FULL_FACE_HELMET);
                            entries.add(ModItems.CONSTRUCTION_HELMET);
                            entries.add(ModItems.SAFETY_VEST);
                            // Misc
                            entries.add(ModItems.CRICKET_BAT);
                            entries.add(ModItems.CRICKET_BALL);
                            entries.add(ModItems.FOOTBALL);
                            entries.add(ModItems.MOBILE_PHONE);
                            entries.add(ModItems.REMOTE_CONTROL);
                            // Vehicles
                        })
                        .build()
        );

        // MOBS TAB — All custom animals and their drops
        Registry.register(Registries.ITEM_GROUP, ADDAFURNITURE_MOBS,
                FabricItemGroup.builder()
                        .icon(() -> new ItemStack(ModItems.ELEPHANT_SPAWN_EGG))
                        .displayName(Text.translatable("itemGroup.addafurniture.mobs"))
                        .entries((ctx, entries) -> {
                            // Spawn Eggs
                            entries.add(ModItems.ELEPHANT_SPAWN_EGG);
                            entries.add(ModItems.TIGER_SPAWN_EGG);
                            entries.add(ModItems.LION_SPAWN_EGG);
                            entries.add(ModItems.GIRAFFE_SPAWN_EGG);
                            entries.add(ModItems.ZEBRA_SPAWN_EGG);
                            entries.add(ModItems.HIPPO_SPAWN_EGG);
                            entries.add(ModItems.GORILLA_SPAWN_EGG);
                            entries.add(ModItems.PENGUIN_SPAWN_EGG);
                            entries.add(ModItems.FLAMINGO_SPAWN_EGG);
                            entries.add(ModItems.CROCODILE_SPAWN_EGG);
                            entries.add(ModItems.SHARK_SPAWN_EGG);
                            entries.add(ModItems.KANGAROO_SPAWN_EGG);
                            // Mob Drops
                            entries.add(ModItems.ELEPHANT_TUSK);
                            entries.add(ModItems.TIGER_FUR);
                            entries.add(ModItems.LION_MANE);
                            entries.add(ModItems.CROCODILE_SCALE);
                            entries.add(ModItems.SHARK_FIN);
                            entries.add(ModItems.KANGAROO_POUCH);
                        })
                        .build()
        );

        AddaFurnitureMod.LOGGER.info("Item Groups Registered!");
    }
}
