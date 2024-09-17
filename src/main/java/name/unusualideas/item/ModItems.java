package name.unusualideas.item;

import name.unusualideas.UnusualIdeas;
import name.unusualideas.item.special.foods.ABoxOfIbuprofen;
import name.unusualideas.item.special.foods.Ibuprofen;
import name.unusualideas.item.special.items.RandomEntitiesStick;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //注册物品
    public static final Item TEST_ITEM = registerItems(
            "test_item", //←这只是个用来测试的物品
            new Item(new FabricItemSettings())
    );
    public static final Item ANOTHER_TEST_ITEM = registerItems(
            "another_test_item", //←这也只是个用来测试的物品
            new Item(new FabricItemSettings())
    );

    public static final Item ZIRCONIUM = registerItems(
            "zirconium",
            new Item(new FabricItemSettings())
    );

    public static final Item ZIRCONIUM_SWORD = registerItems(
            "zirconium_sword",
            new SwordItem(ModToolMaterial.ZIRCONIUM, 7, 1.6f, new FabricItemSettings())
    );
    public static final Item ZIRCONIUM_PICKAXE = registerItems(
            "zirconium_pickaxe",
            new PickaxeItem(ModToolMaterial.ZIRCONIUM, 5, 1.2f, new FabricItemSettings())
    );
    public static final Item ZIRCONIUM_AXE = registerItems(
            "zirconium_axe",
            new AxeItem(ModToolMaterial.ZIRCONIUM, 9, 0.95f, new FabricItemSettings())
    );
    public static final Item ZIRCONIUM_SHOVEL = registerItems(
            "zirconium_shovel",
            new ShovelItem(ModToolMaterial.ZIRCONIUM, 5, 1.0f,new FabricItemSettings())
    );
    public static final Item ZIRCONIUM_HOE = registerItems(
            "zirconium_hoe",
            new HoeItem(ModToolMaterial.ZIRCONIUM, 2, 3.0f,new FabricItemSettings())
    );

    public static final Item ZIRCONIUM_HELMET = registerItems(
            "zirconium_helmet",
            new ArmorItem(ModArmorMaterial.ZIRCONIUM, ArmorItem.Type.HELMET,new FabricItemSettings())
    );
    public static final Item ZIRCONIUM_CHESTPLATE = registerItems(
            "zirconium_chestplate",
            new ArmorItem(ModArmorMaterial.ZIRCONIUM, ArmorItem.Type.CHESTPLATE,new FabricItemSettings())
    );
    public static final Item ZIRCONIUM_LEGGINGS = registerItems(
            "zirconium_leggings",
            new ArmorItem(ModArmorMaterial.ZIRCONIUM, ArmorItem.Type.LEGGINGS,new FabricItemSettings())
    );
    public static final Item ZIRCONIUM_BOOTS = registerItems(
            "zirconium_boots",
            new ArmorItem(ModArmorMaterial.ZIRCONIUM, ArmorItem.Type.BOOTS,new FabricItemSettings())
    );

    public static final Item TITANIUM = registerItems(
            "titanium_ingot",
            new Item(new FabricItemSettings())
    );
    public static final Item RAW_TITANIUM = registerItems(
            "raw_titanium",
            new Item(new FabricItemSettings())
    );
    public static final Item TITANIUM_SWORD = registerItems(
            "titanium_sword",
            new SwordItem(ModToolMaterial.TITANIUM, 7, 1.8f, new FabricItemSettings())
    );
    public static final Item TITANIUM_PICKAXE = registerItems(
            "titanium_pickaxe",
            new PickaxeItem(ModToolMaterial.TITANIUM, 5, 1.4f, new FabricItemSettings())
    );
    public static final Item TITANIUM_AXE = registerItems(
            "titanium_axe",
            new AxeItem(ModToolMaterial.TITANIUM, 9, 1.0f, new FabricItemSettings())
    );
    public static final Item TITANIUM_SHOVEL = registerItems(
            "titanium_shovel",
            new ShovelItem(ModToolMaterial.TITANIUM, 5, 1.2f,new FabricItemSettings()));
    public static final Item TITANIUM_HOE = registerItems(
            "titanium_hoe",
            new HoeItem(ModToolMaterial.TITANIUM, 2, 3.0f,new FabricItemSettings())
    );

    public static final Item TITANIUM_HELMET = registerItems(
            "titanium_helmet",
            new ArmorItem(ModArmorMaterial.TITANIUM, ArmorItem.Type.HELMET,new FabricItemSettings())
    );
    public static final Item TITANIUM_CHESTPLATE = registerItems(
            "titanium_chestplate",
            new ArmorItem(ModArmorMaterial.TITANIUM, ArmorItem.Type.CHESTPLATE,new FabricItemSettings())
    );
    public static final Item TITANIUM_LEGGINGS = registerItems(
            "titanium_leggings",
            new ArmorItem(ModArmorMaterial.TITANIUM, ArmorItem.Type.LEGGINGS,new FabricItemSettings())
    );
    public static final Item TITANIUM_BOOTS = registerItems(
            "titanium_boots",
            new ArmorItem(ModArmorMaterial.TITANIUM, ArmorItem.Type.BOOTS,new FabricItemSettings())
    );

    public static final Item RANDOM_ENTITIES_STICK = registerItems(
            "random_stick",
            new RandomEntitiesStick(new FabricItemSettings())
    );

    public static final Item IBUPROFEN = registerItems(
            "ibuprofen",
            new Ibuprofen(new FabricItemSettings())
    );
    public static final Item ABOXOFIBUPROFEN = registerItems(
            "a_box_of_ibuprofen",
            new ABoxOfIbuprofen(new FabricItemSettings())
    );

    public static final Item CONCENTRATEDCOAL = registerItems(
            "concentrated_coal",
            new Item(new FabricItemSettings())
    );

    //添加物品至物品栏方法（？应该是吧）
    private static void AddTestItemToItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(TEST_ITEM);
    }
    private static void AddAnotherTestItemToItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ANOTHER_TEST_ITEM);
    }
    private static void AddZirconiumToItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ZIRCONIUM);
    }
    private static void AddTitaniumToItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(TITANIUM);
    }
    //模组物品的注册方法
    private static Item registerItems(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(UnusualIdeas.MOD_ID,name),item);
    }

    public static void registerModItem(){
        //添加物品到物品栏
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::AddTestItemToItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::AddAnotherTestItemToItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::AddZirconiumToItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::AddTitaniumToItemGroup);
    }
}
