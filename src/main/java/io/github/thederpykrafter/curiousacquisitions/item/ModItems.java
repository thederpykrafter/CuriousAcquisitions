package io.github.thederpykrafter.curiousacquisitions.item;

import io.github.thederpykrafter.curiousacquisitions.CuriousAcquisitions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.item.v1.FabricItemStack;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item STRANGE_DRINK = registerItem("strange_drink", new Item(new FabricItemSettings()
            .food(ModFoodComponents.STRANGE_DRINK)
            .rarity(Rarity.UNCOMMON)
    ));

    public static final Item BOW_OF_RETURN = registerItem("bow_of_return", new BowItem((new FabricItemSettings()
            .rarity(Rarity.EPIC)
            .maxDamage(384)
    )));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CuriousAcquisitions.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CuriousAcquisitions.LOGGER.info("Registering Items for " + CuriousAcquisitions.MOD_ID);
    }
}