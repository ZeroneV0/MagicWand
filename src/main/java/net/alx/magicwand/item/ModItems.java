package net.alx.magicwand.item;

import net.alx.magicwand.MagicWand;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GARNET = registeredItem("pink_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MagicWand.MOD_ID, "pink_garnet")))));
    public static final Item RAW_PINK_GARNET = registeredItem("raw_pink_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MagicWand.MOD_ID, "raw_pink_garnet")))));

    private static Item registeredItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MagicWand.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MagicWand.LOGGER.info("Registering Mod Items for " + MagicWand.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PINK_GARNET);
            fabricItemGroupEntries.add(RAW_PINK_GARNET);
        });
    }

}
