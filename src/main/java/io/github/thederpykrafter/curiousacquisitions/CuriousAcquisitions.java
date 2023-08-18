package io.github.thederpykrafter.curiousacquisitions;

import io.github.thederpykrafter.curiousacquisitions.block.ModBlocks;
import io.github.thederpykrafter.curiousacquisitions.data.ModModelPredicateProvider;
import io.github.thederpykrafter.curiousacquisitions.item.ModFoodComponents;
import io.github.thederpykrafter.curiousacquisitions.item.ModItemGroups;
import io.github.thederpykrafter.curiousacquisitions.item.ModItems;
import io.github.thederpykrafter.curiousacquisitions.loottables.ModLootTables;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CuriousAcquisitions implements ModInitializer {
	public static final String MOD_ID = "curiousacquisitions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Identifier TEST_CHEST = new Identifier("curiousacquisitions", "chests/test_loot");


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTables.modifyLootTables();
		ModFoodComponents.registerModFoodComponents();
		ModModelPredicateProvider.registerModModels();
	}
}