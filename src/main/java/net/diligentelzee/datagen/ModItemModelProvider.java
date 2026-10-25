package net.diligentelzee.datagen;

import net.diligentelzee.hoav.HOaV;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HOaV.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
    }
}
