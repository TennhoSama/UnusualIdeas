package name.unusualideas.datagen;

import name.unusualideas.block.ModBlocks;
import name.unusualideas.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZIRCONIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZIRCONIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ZIRCONIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TITANIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.TEST_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANOTHER_TEST_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZIRCONIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TITANIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.ZIRCONIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ZIRCONIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ZIRCONIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ZIRCONIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ZIRCONIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.ZIRCONIUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ZIRCONIUM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ZIRCONIUM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ZIRCONIUM_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_BOOTS);

        itemModelGenerator.register(ModItems.RANDOM_ENTITIES_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.IBUPROFEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.ABOXOFIBUPROFEN, Models.GENERATED);

    }
}
