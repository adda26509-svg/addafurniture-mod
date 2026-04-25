package com.addafurniture.registry;

import com.addafurniture.AddaFurnitureMod;
import com.addafurniture.entity.mob.*;
import com.addafurniture.entity.vehicle.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    // ==================== CUSTOM MOBS ====================

    public static final EntityType<ElephantEntity> ELEPHANT = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "elephant"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ElephantEntity::new)
                    .dimensions(EntityDimensions.fixed(2.5f, 3.0f))
                    .build()
    );

    public static final EntityType<TigerEntity> TIGER = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "tiger"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TigerEntity::new)
                    .dimensions(EntityDimensions.fixed(1.4f, 0.9f))
                    .build()
    );

    public static final EntityType<LionEntity> LION = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "lion"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, LionEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 1.0f))
                    .build()
    );

    public static final EntityType<GiraffeEntity> GIRAFFE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "giraffe"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GiraffeEntity::new)
                    .dimensions(EntityDimensions.fixed(1.6f, 5.5f))
                    .build()
    );

    public static final EntityType<ZebraEntity> ZEBRA = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "zebra"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ZebraEntity::new)
                    .dimensions(EntityDimensions.fixed(1.4f, 1.6f))
                    .build()
    );

    public static final EntityType<HippoEntity> HIPPO = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "hippo"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, HippoEntity::new)
                    .dimensions(EntityDimensions.fixed(2.5f, 1.5f))
                    .build()
    );

    public static final EntityType<GorillaEntity> GORILLA = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "gorilla"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GorillaEntity::new)
                    .dimensions(EntityDimensions.fixed(1.2f, 1.8f))
                    .build()
    );

    public static final EntityType<PenguinEntity> PENGUIN = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "penguin"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PenguinEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.9f))
                    .build()
    );

    public static final EntityType<FlamingoEntity> FLAMINGO = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "flamingo"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FlamingoEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.8f))
                    .build()
    );

    public static final EntityType<CrocodileEntity> CROCODILE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "crocodile"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CrocodileEntity::new)
                    .dimensions(EntityDimensions.fixed(2.0f, 0.7f))
                    .build()
    );

    public static final EntityType<SharkEntity> SHARK = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "shark"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, SharkEntity::new)
                    .dimensions(EntityDimensions.fixed(2.5f, 1.0f))
                    .build()
    );

    public static final EntityType<KangarooEntity> KANGAROO = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "kangaroo"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, KangarooEntity::new)
                    .dimensions(EntityDimensions.fixed(0.9f, 1.9f))
                    .build()
    );

    // ==================== VEHICLES ====================

    public static final EntityType<CarEntity> CAR_ENTITY = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "car"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, CarEntity::new)
                    .dimensions(EntityDimensions.fixed(2.5f, 1.5f))
                    .build()
    );

    public static final EntityType<BikeEntity> BIKE_ENTITY = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "bike"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, BikeEntity::new)
                    .dimensions(EntityDimensions.fixed(0.7f, 1.4f))
                    .build()
    );

    public static final EntityType<ScooterEntity> SCOOTER_ENTITY = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(AddaFurnitureMod.MOD_ID, "scooter"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, ScooterEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.2f))
                    .build()
    );

    public static void registerEntities() {
        AddaFurnitureMod.LOGGER.info("Registering AddaFurniture Entities (Mobs + Vehicles)...");
    }
}
