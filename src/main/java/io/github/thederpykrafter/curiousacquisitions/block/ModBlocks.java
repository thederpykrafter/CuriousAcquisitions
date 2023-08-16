package io.github.thederpykrafter.curiousacquisitions.block;

import io.github.thederpykrafter.curiousacquisitions.CuriousAcquisitions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModBlocks {

    public static final Block STRANGE_BLOCK = registerBlock("strange_block",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CuriousAcquisitions.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(CuriousAcquisitions.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()
                        .rarity(Rarity.RARE)
                ));
    }

    public static void registerModBlocks() {
        CuriousAcquisitions.LOGGER.info("Registering ModBlocks for " + CuriousAcquisitions.MOD_ID);
    }
}
