package io.github.thederpykrafter.curiousacquisitions.data;

import io.github.thederpykrafter.curiousacquisitions.block.ModBlocks;
import io.github.thederpykrafter.curiousacquisitions.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }


    public static final TagKey<Item> CURIOUS_ACQUISITIONS_TAG = TagKey.of(RegistryKeys.ITEM, new Identifier("curiousacquisitions:curious_acquisitions_tag"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(CURIOUS_ACQUISITIONS_TAG)
                .add(ModItems.BOW_OF_RETURN)
                .add(ModItems.STRANGE_DRINK)

                .add(ModBlocks.STRANGE_BLOCK.asItem())
        ;
    }



}