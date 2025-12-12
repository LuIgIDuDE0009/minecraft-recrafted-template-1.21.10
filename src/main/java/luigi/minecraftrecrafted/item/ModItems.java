package luigi.minecraftrecrafted.item;

import luigi.minecraftrecrafted.MinecraftRecrafted;
import luigi.minecraftrecrafted.MinecraftRecraftedClient;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    //Item Initialization
    public static  final Item BARNACLE_TOOTH = registerItem("barnacle_tooth", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinecraftRecrafted.MOD_ID,"barnacle_tooth")))));
    public static  final Item HEART_OF_THE_NETHER = registerItem("heart_of_the_nether", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinecraftRecrafted.MOD_ID,"heart_of_the_nether")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MinecraftRecrafted.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MinecraftRecrafted.LOGGER.info("Registering Mod Items for " + MinecraftRecrafted.MOD_ID);

        //Creative Mode Tab Initialization
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BARNACLE_TOOTH);
            fabricItemGroupEntries.add(HEART_OF_THE_NETHER);
        });
    }
}
