package com.hm.registry;

import com.hm.TemplateMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static Block CITRINE_BLOCK = registerBlock("citrine_block",
            new Block(FabricBlockSettings.create().strength(4.0f).requiresTool())
            , ModItemGroup.CITRINE_GROUP);
    public static Block CITRINE_ORE = registerBlock("citrine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().strength(4.0f).requiresTool(), UniformIntProvider.create(2, 6))
            , ModItemGroup.CITRINE_GROUP);
    public static Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().strength(4.0f).requiresTool(), UniformIntProvider.create(2, 6))
            , ModItemGroup.CITRINE_GROUP);
    public static Block registerBlock(String name, Block block, RegistryKey<ItemGroup>... itemGroups) {
        ModItems.registerItem(name, new BlockItem(block, new FabricItemSettings()), itemGroups);
        return Registry.register(Registries.BLOCK, new Identifier(TemplateMod.MOD_ID, name), block);

    }

    public static void registerModBlock() {
        TemplateMod.LOGGER.debug("Registering mod block for" + TemplateMod.MOD_ID);
    }
}
