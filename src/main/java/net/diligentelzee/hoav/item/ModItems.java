package net.diligentelzee.hoav.item;

import net.diligentelzee.hoav.HOaV;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HOaV.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

        HOaV.LOGGER.info("[Module] ITEMS Registered!");
    }
}
