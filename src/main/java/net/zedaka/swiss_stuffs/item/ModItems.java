package net.zedaka.swiss_stuffs.item;

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
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Swiss_Stuffs.MODID);

    public static final RegistryObject<Item> SWISS_FLAG = ITEMS.register("swiss_flag",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.swiss_stuffs.swiss_flag.tooltip").withStyle(ChatFormatting.GRAY));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            }
    );

    public static final RegistryObject<Item> SWISS_ARMY_KNIFE = ITEMS.register("swiss_army_knife",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SWISS_CHEESE = ITEMS.register("swiss_cheese",
            () -> new Item(new Item.Properties().food(ModFoods.SWISS_CHEESE)));
    public static final RegistryObject<Item> SWISS_RIVELLA = ITEMS.register("swiss_rivella",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
