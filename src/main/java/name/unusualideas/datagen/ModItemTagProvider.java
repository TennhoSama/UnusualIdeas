package name.unusualideas.datagen;

import name.unusualideas.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture){
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(
                        ModItems.ZIRCONIUM_HELMET,
                        ModItems.ZIRCONIUM_CHESTPLATE,
                        ModItems.ZIRCONIUM_LEGGINGS,
                        ModItems.ZIRCONIUM_BOOTS,

                        ModItems.TITANIUM_HELMET,
                        ModItems.TITANIUM_CHESTPLATE,
                        ModItems.TITANIUM_LEGGINGS,
                        ModItems.TITANIUM_BOOTS
                );
    }
}
