package io.github.thederpykrafter.curiousacquisitions.item;

import io.github.thederpykrafter.curiousacquisitions.CuriousAcquisitions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STRANGE_DRINK = registerItem("strange_drink", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CuriousAcquisitions.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CuriousAcquisitions.LOGGER.info("Registering Mod Items for " + CuriousAcquisitions.MOD_ID);
    }
}