package name.unusualideas.datagen;

import name.unusualideas.block.ModBlocks;
import name.unusualideas.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTablesProvider extends FabricBlockLootTableProvider {
    public ModLootTablesProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ZIRCONIUM_BLOCK);
        addDrop(ModBlocks.TITANIUM_BLOCK);
        addDrop(ModBlocks.RAW_TITANIUM_BLOCK);

        addDrop(ModBlocks.ZIRCONIUM_ORE, DropLikeRedstoneOreDrops(ModBlocks.ZIRCONIUM_ORE, ModItems.ZIRCONIUM));
        addDrop(ModBlocks.DEEPSLATE_ZIRCONIUM_ORE, DropLikeRedstoneOreDrops(ModBlocks.ZIRCONIUM_ORE, ModItems.ZIRCONIUM));
        addDrop(ModBlocks.TITANIUM_ORE, DropLikeCopperOreDrops(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE, DropLikeCopperOreDrops(ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.RAW_TITANIUM));
    }

    //掉落方式 the ways to drop
    public LootTable.Builder DropLikeRedstoneOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0F, 5.0F)))
                                .apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE))
                )
        );
    }

    public LootTable.Builder DropLikeCopperOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }
}
