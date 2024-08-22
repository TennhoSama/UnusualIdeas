package name.unusualideas.datagen;

import name.unusualideas.block.ModBlocks;
import name.unusualideas.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;

public class ModRecipesProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> SmeltingZirconium = List.of(ModBlocks.ZIRCONIUM_ORE, ModBlocks.DEEPSLATE_ZIRCONIUM_ORE);
    private static final List<ItemConvertible> SmeltingTitanium = List.of(ModBlocks.TITANIUM_ORE, ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.RAW_TITANIUM);

    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ZIRCONIUM,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZIRCONIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TITANIUM,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_TITANIUM,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TITANIUM_BLOCK);

        offerSmelting(exporter, SmeltingZirconium, RecipeCategory.MISC, ModItems.ZIRCONIUM, 1.5f, 200, "zirconium");
        offerBlasting(exporter, SmeltingZirconium, RecipeCategory.MISC, ModItems.ZIRCONIUM, 2.0f, 100, "zirconium");
        offerSmelting(exporter, SmeltingTitanium, RecipeCategory.MISC, ModItems.TITANIUM, 1.0f, 250, "titanium");
        offerBlasting(exporter, SmeltingTitanium, RecipeCategory.MISC, ModItems.TITANIUM, 1.5f, 150, "titanium");
    }
}

