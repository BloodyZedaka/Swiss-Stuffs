package net.zedaka.swiss_stuffs.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.zedaka.swiss_stuffs.Swiss_Stuffs;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Swiss_Stuffs.MODID);

    public static final RegistryObject<CreativeModeTab> SWISS_STUFFS_TAB = CREATIVE_MODE_TABS.register("swiss_stuffs_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SWISS_FLAG.get()))
                    .title(Component.translatable("creativetab.swiss_stuffs_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Copy the line " pOutput.accept(ModItems.MOD_ITEM.get());" to add items
                        pOutput.accept(ModItems.SWISS_ARMY_KNIFE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
