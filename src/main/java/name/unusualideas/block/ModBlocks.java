package name.unusualideas.block;

import name.unusualideas.UnusualIdeas;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ZIRCONIUM_BLOCK;
    static {
        ZIRCONIUM_BLOCK = registerBlocks("zirconium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.ZIRCONIUM_BLOCK.asItem());
        });
    }
    public static final Block ZIRCONIUM_ORE;
    static {
        ZIRCONIUM_ORE = registerBlocks("zirconium_ore", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> {
            itemGroup.add(ModBlocks.ZIRCONIUM_ORE.asItem());
        });
    }
    public static final Block DEEPSLATE_ZIRCONIUM_ORE;
    static {
        DEEPSLATE_ZIRCONIUM_ORE = registerBlocks("deepslate_zirconium_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE)));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> {
            itemGroup.add(ModBlocks.DEEPSLATE_ZIRCONIUM_ORE.asItem());
        });
    }

    public static final Block TITANIUM_BLOCK;
    static {
        TITANIUM_BLOCK = registerBlocks("titanium_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.TITANIUM_BLOCK.asItem());
        });
    }
    public static final Block RAW_TITANIUM_BLOCK;
    static {
        RAW_TITANIUM_BLOCK = registerBlocks("raw_titanium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.RAW_TITANIUM_BLOCK.asItem());
        });
    }
    public static final Block TITANIUM_ORE;
    static {
        TITANIUM_ORE = registerBlocks("titanium_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> {
            itemGroup.add(ModBlocks.TITANIUM_ORE.asItem());
        });
    }
    public static final Block DEEPSLATE_TITANIUM_ORE;
    static {
        DEEPSLATE_TITANIUM_ORE = registerBlocks("deepslate_titanium_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> {
            itemGroup.add(ModBlocks.DEEPSLATE_TITANIUM_ORE.asItem());
        });
    }

    private static Block registerBlocks(String name, Block block){
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(UnusualIdeas.MOD_ID, name), block);
    }

    private static Item registerBlockItems(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(UnusualIdeas.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        //There is nothing too XXXD
    }
}


