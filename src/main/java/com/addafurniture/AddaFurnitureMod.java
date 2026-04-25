package com.addafurniture;

import com.addafurniture.registry.ModBlocks;
import com.addafurniture.registry.ModItems;
import com.addafurniture.registry.ModEntities;
import com.addafurniture.registry.ModItemGroups;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddaFurnitureMod implements ModInitializer {

    public static final String MOD_ID = "addafurniture";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("AddaFurniture Mod Loading... Bohut saari cheezein aa rahi hain! 🪑");

        ModEntities.registerEntities();
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModItemGroups.registerItemGroups();

        LOGGER.info("AddaFurniture Mod Loaded! Enjoy your furniture!");
    }
}
