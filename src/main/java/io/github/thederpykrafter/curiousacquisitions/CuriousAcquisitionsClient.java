package io.github.thederpykrafter.curiousacquisitions;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import static io.github.thederpykrafter.curiousacquisitions.block.ModBlocks.STRANGE_BLOCK;

public class CuriousAcquisitionsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(STRANGE_BLOCK, RenderLayer.getCutout());
    }
}
