package net.diligentelzee.hoav.item;

import net.diligentelzee.hoav.HOaV;
import net.diligentelzee.hoav.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HOaV.MOD_ID);

    public static final Supplier<CreativeModeTab> CREATE_FILLERS_TAB = CREATIVE_MODE_TAB.register("create_fillers_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.HYPERDENSE_DIAMOND_ORE.get()))
                    .title(Component.translatable("createivetab.hoav.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.HYPERDENSE_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE);

                        output.accept(ModBlocks.HYPERDENSE_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE);

                        output.accept(ModBlocks.HYPERDENSE_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE);

                        output.accept(ModBlocks.HYPERDENSE_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE);

                        output.accept(ModBlocks.HYPERDENSE_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_GOLD_ORE);

                        output.accept(ModBlocks.HYPERDENSE_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE);

                        output.accept(ModBlocks.HYPERDENSE_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE);

                        output.accept(ModBlocks.HYPERDENSE_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE);

                        output.accept(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE);

                        output.accept(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE);
                    }).build());

    public static final Supplier<CreativeModeTab> TEMP_EOV_TAB = CREATIVE_MODE_TAB.register("temp_eov_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ANDESITE_DIAMOND_ORE.get()))
                    .title(Component.translatable("createivetab.temp_eov_tab.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ANDESITE_COAL_ORE);
                        output.accept(ModBlocks.DIORITE_COAL_ORE);
                        output.accept(ModBlocks.GRANITE_COAL_ORE);
                        output.accept(ModBlocks.TUFF_COAL_ORE);
                        output.accept(ModBlocks.BLACKSTONE_COAL_ORE);
                        
                        output.accept(ModBlocks.ANDESITE_COPPER_ORE);
                        output.accept(ModBlocks.DIORITE_COPPER_ORE);
                        output.accept(ModBlocks.GRANITE_COPPER_ORE);
                        output.accept(ModBlocks.TUFF_COPPER_ORE);
                        output.accept(ModBlocks.BLACKSTONE_COPPER_ORE);

                        output.accept(ModBlocks.ANDESITE_DIAMOND_ORE);
                        output.accept(ModBlocks.DIORITE_DIAMOND_ORE);
                        output.accept(ModBlocks.GRANITE_DIAMOND_ORE);
                        output.accept(ModBlocks.TUFF_DIAMOND_ORE);
                        output.accept(ModBlocks.BLACKSTONE_DIAMOND_ORE);

                        output.accept(ModBlocks.ANDESITE_EMERALD_ORE);
                        output.accept(ModBlocks.DIORITE_EMERALD_ORE);
                        output.accept(ModBlocks.GRANITE_EMERALD_ORE);
                        output.accept(ModBlocks.TUFF_EMERALD_ORE);
                        output.accept(ModBlocks.BLACKSTONE_EMERALD_ORE);

                        output.accept(ModBlocks.ANDESITE_GOLD_ORE);
                        output.accept(ModBlocks.DIORITE_GOLD_ORE);
                        output.accept(ModBlocks.GRANITE_GOLD_ORE);
                        output.accept(ModBlocks.TUFF_GOLD_ORE);

                        output.accept(ModBlocks.ANDESITE_IRON_ORE);
                        output.accept(ModBlocks.DIORITE_IRON_ORE);
                        output.accept(ModBlocks.GRANITE_IRON_ORE);
                        output.accept(ModBlocks.TUFF_IRON_ORE);
                        output.accept(ModBlocks.BLACKSTONE_IRON_ORE);

                        output.accept(ModBlocks.ANDESITE_LAPIS_ORE);
                        output.accept(ModBlocks.DIORITE_LAPIS_ORE);
                        output.accept(ModBlocks.GRANITE_LAPIS_ORE);
                        output.accept(ModBlocks.TUFF_LAPIS_ORE);
                        output.accept(ModBlocks.BLACKSTONE_LAPIS_ORE);

                        output.accept(ModBlocks.ANDESITE_REDSTONE_ORE);
                        output.accept(ModBlocks.DIORITE_REDSTONE_ORE);
                        output.accept(ModBlocks.GRANITE_REDSTONE_ORE);
                        output.accept(ModBlocks.TUFF_REDSTONE_ORE);
                        output.accept(ModBlocks.BLACKSTONE_REDSTONE_ORE);

                        output.accept(ModBlocks.BLACKSTONE_GOLD_ORE);

                        output.accept(ModBlocks.BLACKSTONE_QUARTZ_ORE);
                    }).build());
    
    
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);

        HOaV.LOGGER.info("[Module] CREATIVE MODE TABS Registered!");
    }


}
