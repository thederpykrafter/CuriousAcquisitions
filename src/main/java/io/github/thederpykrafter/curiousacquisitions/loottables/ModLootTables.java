package io.github.thederpykrafter.curiousacquisitions.loottables;

import io.github.thederpykrafter.curiousacquisitions.block.ModBlocks;
import io.github.thederpykrafter.curiousacquisitions.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.Collection;

public class ModLootTables {
    /*
    private static final Identifier GRASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/grass");
    */
    private static final Identifier IGLOO_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/igloo_chest");

    private static final Identifier L1 = new Identifier("minecraft","abandoned_mineshaft");
    private static final Identifier L2 = new Identifier("minecraft","ancient_city");
    private static final Identifier L3 = new Identifier("minecraft","ancient_cityox");
    private static final Identifier L4 = new Identifier("minecraft","bastion_bridge");
    private static final Identifier L5 = new Identifier("minecraft","bastion_hoglin_stable");
    private static final Identifier L6 = new Identifier("minecraft","bastion_other");
    private static final Identifier L7 = new Identifier("minecraft","bastion_treasure");
    private static final Identifier L8 = new Identifier("minecraft","buried_treasure");
    private static final Identifier L9 = new Identifier("minecraft","desert_pyramid");
    private static final Identifier L10 = new Identifier("minecraft","end_city_treasure");
    private static final Identifier L12 = new Identifier("minecraft","igloo_chest");
    private static final Identifier L13 = new Identifier("minecraft","jungle_temple");
    private static final Identifier L14 = new Identifier("minecraft","jungle_temple_dispenser");
    private static final Identifier L15 = new Identifier("minecraft","nether_bridge");
    private static final Identifier L16 = new Identifier("minecraft","pillager_outpost");
    private static final Identifier L17 = new Identifier("minecraft","ruined_portal");
    private static final Identifier L18 = new Identifier("minecraft","shipwreck_map");
    private static final Identifier L19 = new Identifier("minecraft","shipwreck_supply");
    private static final Identifier L20 = new Identifier("minecraft","shipwreck_treasure");
    private static final Identifier L21 = new Identifier("minecraft","simple_dungeon");
    private static final Identifier L22 = new Identifier("minecraft","spawn_bonus");
    private static final Identifier L23 = new Identifier("minecraft","stronghold_corridor");
    private static final Identifier L24 = new Identifier("minecraft","stronghold_crossing");
    private static final Identifier L25 = new Identifier("minecraft","stronghold_library");
    private static final Identifier L26 = new Identifier("minecraft","underwater_ruin_big");
    private static final Identifier L27 = new Identifier("minecraft","underwater_ruin_small");
    private static final Identifier L28 = new Identifier("minecraft","woodland_mansion");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            /*
            if(GRASS_BLOCK_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(ModItems.EGGPLANT_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            */
            if (source.isBuiltin() && L1.equals(id)) {
                LootPool.Builder p1 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.BOW_OF_RETURN))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 1.0f)).build());
                        ;

                tableBuilder.pool((p1));
            }

            if(IGLOO_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder curious_acquisitions_pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.BOW_OF_RETURN))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 1.0f)).build());
                tableBuilder.pool(curious_acquisitions_pool.build());

                LootPool.Builder strange_drink_pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(2f)) // Drops 200% of the time
                        .with(ItemEntry.builder(ModItems.STRANGE_DRINK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());
                tableBuilder.pool(strange_drink_pool.build());

                LootPool.Builder strange_block_pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(3f)) // Drops 300% of the time
                        .with((ItemEntry.builder(ModBlocks.STRANGE_BLOCK)))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());
                tableBuilder.pool(strange_block_pool.build());

                LootPool.Builder bow_of_return_pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with((ItemEntry.builder(ModItems.BOW_OF_RETURN)))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 1.0f)).build());
                tableBuilder.pool(bow_of_return_pool.build());
            }
        });
    }
}