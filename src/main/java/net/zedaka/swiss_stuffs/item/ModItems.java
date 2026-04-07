package net.zedaka.swiss_stuffs.item;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zedaka.swiss_stuffs.Swiss_Stuffs;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Swiss_Stuffs.MODID);

    public static final RegistryObject<Item> SWISS_FLAG = ITEMS.register("swiss_flag",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
                    tooltip.add(Component.translatable("item.swiss_stuffs.swiss_flag.tooltip").withStyle(ChatFormatting.GRAY));
                }
            });

    public static final RegistryObject<Item> SWISS_ARMY_KNIFE = ITEMS.register("swiss_army_knife",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
