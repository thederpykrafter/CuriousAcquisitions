package io.github.thederpykrafter.curiousacquisitions.item;

import io.github.thederpykrafter.curiousacquisitions.CuriousAcquisitions;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CURIOUS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CuriousAcquisitions.MOD_ID, "curious_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.curious_group"))
                    .icon(() -> new ItemStack(ModItems.STRANGE_DRINK))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.STRANGE_DRINK);


                    }
                    ).build());


    public static void registerItemGroups() {
        CuriousAcquisitions.LOGGER.info("Registering Item Groups for " + CuriousAcquisitions.MOD_ID);
    }
}
