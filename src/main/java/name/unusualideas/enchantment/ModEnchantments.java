package name.unusualideas.enchantment;

import name.unusualideas.UnusualIdeas;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static final Enchantment Frost_Enchantment;  //因为不想看到未调用的灰色，于是选择了拆分... XXXD
    static {
        Frost_Enchantment = ModEnchantments.registerEnchantments("frost_enchantment", new FrostEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
    }

    public static final Enchantment Damnation_Enchantment;
    static {
        Damnation_Enchantment = ModEnchantments.registerEnchantments("damnation_enchantment", new DamnationEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
    }

    public static Enchantment registerEnchantments(String name, Enchantment enchantment){
        return Registry.register(Registries.ENCHANTMENT, new Identifier(UnusualIdeas.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantment(){
        //There is nothing too :p
    }

}
