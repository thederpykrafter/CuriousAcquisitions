package io.github.thederpykrafter.curiousacquisitions.data;

import io.github.thederpykrafter.curiousacquisitions.CuriousAcquisitions;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.TagEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class ModChestLootTableProvider extends SimpleFabricLootTableProvider {
    public ModChestLootTableProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, LootContextTypes.CHEST);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> exporter) {
        exporter.accept(CuriousAcquisitions.TEST_CHEST, LootTable.builder()
                .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(0.5F))
                //.with(((Entry.Builder(ModItemTagProvider.CURIOUS_ACQUISITIONS_TAG))))
                        .with(TagEntry.builder(ModItemTagProvider.CURIOUS_ACQUISITIONS_TAG))
                .apply(SetCountLootFunction
                .builder(UniformLootNumberProvider.create(0.1F, 1F)
                ))));

    }
}

// ...



