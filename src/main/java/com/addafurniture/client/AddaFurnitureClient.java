package com.addafurniture.client;

import com.addafurniture.registry.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.CowEntityRenderer;
import net.minecraft.client.render.entity.IronGolemEntityRenderer;
import net.minecraft.client.render.entity.BoatEntityRenderer;

/**
 * Client-side initialization.
 * Registers entity renderers for all custom mobs and vehicles.
 * In a full mod, each mob would have its own custom renderer + model + texture.
 * For now, we use placeholder renderers until custom models are made in Blockbench.
 */
public class AddaFurnitureClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // ── MOBS (placeholder renderers — replace with custom in full release) ──
        // Use CowEntityRenderer as placeholder for quadruped animals
        EntityRendererRegistry.register(ModEntities.ELEPHANT,
                context -> new CowEntityRenderer(context));

        EntityRendererRegistry.register(ModEntities.TIGER,
                context -> new CowEntityRenderer(context));

        EntityRendererRegistry.register(ModEntities.LION,
                context -> new CowEntityRenderer(context));

        EntityRendererRegistry.register(ModEntities.GIRAFFE,
                context -> new CowEntityRenderer(context));

        EntityRendererRegistry.register(ModEntities.ZEBRA,
                context -> new CowEntityRenderer(context));

        EntityRendererRegistry.register(ModEntities.HIPPO,
                context -> new CowEntityRenderer(context));

        EntityRendererRegistry.register(ModEntities.GORILLA,
                context -> new CowEntityRenderer(context));

        EntityRendererRegistry.register(ModEntities.PENGUIN,
                context -> new CowEntityRenderer(context));

        EntityRendererRegistry.register(ModEntities.FLAMINGO,
                context -> new CowEntityRenderer(context));

        EntityRendererRegistry.register(ModEntities.CROCODILE,
                context -> new CowEntityRenderer(context));

        EntityRendererRegistry.register(ModEntities.SHARK,
                context -> new CowEntityRenderer(context));

        EntityRendererRegistry.register(ModEntities.KANGAROO,
                context -> new CowEntityRenderer(context));

        // ── VEHICLES ──
        EntityRendererRegistry.register(ModEntities.CAR_ENTITY,
                context -> new BoatEntityRenderer(context, false));

        EntityRendererRegistry.register(ModEntities.BIKE_ENTITY,
                context -> new BoatEntityRenderer(context, false));

        EntityRendererRegistry.register(ModEntities.SCOOTER_ENTITY,
                context -> new BoatEntityRenderer(context, false));
    }
}
