package net.krtm.tutorialmod.event;

import net.krtm.tutorialmod.TutorialMod;
import net.krtm.tutorialmod.block.ModBlocks;
import net.krtm.tutorialmod.block.entity.ModBlockEntities;
import net.krtm.tutorialmod.block.entity.renderer.GemPolishingBlockEntityRenderer;
import net.krtm.tutorialmod.entity.client.ModModelLayers;
import net.krtm.tutorialmod.entity.client.RhinoModel;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvent {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.RHINO_LAYER, RhinoModel::createBodyLayer);

    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.GEM_POLISHING_BE.get(), GemPolishingBlockEntityRenderer::new);

        event.registerBlockEntityRenderer(ModBlockEntities.MOD_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_HANGING_SIGN.get(), HangingSignRenderer::new);
    }
}
