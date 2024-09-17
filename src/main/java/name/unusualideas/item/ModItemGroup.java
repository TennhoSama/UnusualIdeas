package name.unusualideas.item;

import name.unusualideas.UnusualIdeas;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup UNUSUALITEMS_GROUP;

    static {
        UNUSUALITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(UnusualIdeas.MOD_ID, "unusualitems_group"),
                FabricItemGroup.builder().displayName(Text.translatable("itemGroup.unusualIdeas"))
                        .icon(() -> new ItemStack(ModItems.TEST_ITEM))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.TEST_ITEM);
                            entries.add(ModItems.ANOTHER_TEST_ITEM);

                            entries.add(ModItems.ZIRCONIUM);

                            entries.add(ModItems.ZIRCONIUM_HELMET);
                            entries.add(ModItems.ZIRCONIUM_CHESTPLATE);
                            entries.add(ModItems.ZIRCONIUM_LEGGINGS);
                            entries.add(ModItems.ZIRCONIUM_BOOTS);

                            entries.add(ModItems.ZIRCONIUM_PICKAXE);
                            entries.add(ModItems.ZIRCONIUM_SWORD);
                            entries.add(ModItems.ZIRCONIUM_AXE);
                            entries.add(ModItems.ZIRCONIUM_SHOVEL);
                            entries.add(ModItems.ZIRCONIUM_HOE);

                            entries.add(ModItems.TITANIUM);
                            entries.add(ModItems.RAW_TITANIUM);

                            entries.add(ModItems.TITANIUM_HELMET);
                            entries.add(ModItems.TITANIUM_CHESTPLATE);
                            entries.add(ModItems.TITANIUM_LEGGINGS);
                            entries.add(ModItems.TITANIUM_BOOTS);

                            entries.add(ModItems.TITANIUM_PICKAXE);
                            entries.add(ModItems.TITANIUM_SWORD);
                            entries.add(ModItems.TITANIUM_AXE);
                            entries.add(ModItems.TITANIUM_SHOVEL);
                            entries.add(ModItems.TITANIUM_HOE);

                            entries.add(ModItems.RANDOM_ENTITIES_STICK);

                            entries.add(ModItems.IBUPROFEN);
                            entries.add(ModItems.ABOXOFIBUPROFEN);

                            entries.add(ModItems.CONCENTRATEDCOAL);
                        })
                        .build());
    }

    public static void registerModItemGroup(){
        //There is nothing :D
    }
}
