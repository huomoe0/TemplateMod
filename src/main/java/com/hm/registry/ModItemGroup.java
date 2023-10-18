package com.hm.registry;


import com.hm.TemplateMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> CITRINE_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(TemplateMod.MOD_ID, "citrine"));

//    public static ItemGroup CITRINE = FabricItemGroup.builder(new Identifier(TemplateMod.MOD_ID, "citrine"))
//            .displayName(Text.translatable("itemgroup.tutorial-mod.citrine"))
//            .icon(() -> new ItemStack(ModItems.CITRINE))
//            .build();

    public static void registerModItemGroup() {
        TemplateMod.LOGGER.debug("Registering mod item group for " + TemplateMod.MOD_ID);
        Registry.register(Registries.ITEM_GROUP, CITRINE_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("modid.test_group"))
                .icon(() -> new ItemStack(Items.DIAMOND))
                .build());
    }
}
