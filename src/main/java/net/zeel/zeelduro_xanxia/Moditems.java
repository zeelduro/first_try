package net.zeel.zeelduro_xanxia;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, zeelduro_xanxia.MOD_ID);

    public static final RegistryObject<Item> BLUEBALLS = ITEMS.register("blueballs",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNCOOKEDBALLS = ITEMS.register("uncookedblueballs",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
