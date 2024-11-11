package com.jidutianxia.tutorialmod.item;

import com.jidutianxia.tutorialmod.TutorialMod;
import com.jidutianxia.tutorialmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
//    public static final RegistryKey<ItemGroup> TUTORIAL_GROUP= register("tutorial_group");
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(TutorialMod.MOD_ID,id));
//    }
//    public static void registerModItemGroups(){
//        Registry.register(
//                Registries.ITEM_GROUP,
//                TUTORIAL_GROUP,
//                ItemGroup.create(ItemGroup.Row.TOP,7)
//                        .displayName(Text.translatable("itemGroup.tutorial_group"))
//                        .icon(()->new ItemStack(ModItems.ICE_ETHER))
//                        .entries((displayContext, entries) -> {
//                            entries.add(ModItems.ICE_ETHER);
//                        })
//                        .build()
//        );
//
//        TutorialMod.LOGGER.info("Registering Item Groups");
//
//    }
    public static final ItemGroup TUTORIAL_GROUP =
        Registry.register(
                Registries.ITEM_GROUP,
                Identifier.of(TutorialMod.MOD_ID,"tutorial_group"),
                ItemGroup.create(null,-1)
                        .displayName(Text.translatable("itemGroup.tutorial_group"))
                        .icon(()->new ItemStack(ModItems.ICE_ETHER))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.ICE_ETHER);
                            entries.add(Blocks.BRICKS);
                            entries.add(Blocks.SAND);
                            entries.add(Blocks.GRASS_BLOCK);
                            entries.add(ModItems.RAW_ICE_ETHER);

                            entries.add(Items.DIAMOND);
                            entries.add(ModBlocks.ICE_ETHER_BLOCK);
                            entries.add(ModBlocks.ICE_ETHER_ORE);
                            entries.add(ModBlocks.RAW_ICE_ETHER_BLOCK);
                        })
                        .build()
        );
    public static void registerModItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups");
    }

}
