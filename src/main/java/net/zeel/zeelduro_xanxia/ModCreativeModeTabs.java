package net.zeel.zeelduro_xanxia;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB,zeelduro_xanxia.MOD_ID);
    public static final RegistryObject<CreativeModeTab> xanxia_tab = CREATIVE_MODE_TABS.register("xanxia_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.BLUEBALLS.get()))
                    .title(Component.translatable("creativetab.xanxia_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.BLUEBALLS.get());
                        pOutput.accept(Moditems.UNCOOKEDBALLS.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
