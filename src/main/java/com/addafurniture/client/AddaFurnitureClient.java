package com.addafurniture.client;

import com.addafurniture.registry.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CowEntityModel;
import net.minecraft.client.render.entity.CowEntityRenderer;

public class AddaFurnitureClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.ELEPHANT, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.TIGER, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.LION, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.GIRAFFE, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.ZEBRA, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.HIPPO, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.GORILLA, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.PENGUIN, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.FLAMINGO, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.CROCODILE, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.SHARK, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.KANGAROO, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.CAR_ENTITY, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.BIKE_ENTITY, CowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.SCOOTER_ENTITY, CowEntityRenderer::new);
    }
}
