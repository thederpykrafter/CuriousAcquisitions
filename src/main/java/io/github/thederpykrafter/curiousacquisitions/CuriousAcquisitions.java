package io.github.thederpykrafter.curiousacquisitions;

import io.github.thederpykrafter.curiousacquisitions.block.ModBlocks;
import io.github.thederpykrafter.curiousacquisitions.item.ModItemGroups;
import io.github.thederpykrafter.curiousacquisitions.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CuriousAcquisitions implements ModInitializer {
		public static final String MOD_ID = "curiousacquisitions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}