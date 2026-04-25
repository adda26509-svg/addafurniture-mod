package com.addafurniture.client;

import com.addafurniture.registry.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EmptyEntityRenderer;

public class AddaFurnitureClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.ELEPHANT, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.TIGER, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.LION, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.GIRAFFE, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.ZEBRA, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.HIPPO, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.GORILLA, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.PENGUIN, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.FLAMINGO, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.CROCODILE, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.SHARK, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.KANGAROO, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.CAR_ENTITY, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.BIKE_ENTITY, EmptyEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.SCOOTER_ENTITY, EmptyEntityRenderer::new);
    }
}
