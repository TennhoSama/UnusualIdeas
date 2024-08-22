package name.unusualideas.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

    ZIRCONIUM(MiningLevels.IRON, 523, 6.0f, 6.0f, 14,
            () -> Ingredient.ofItems(ModItems.ZIRCONIUM)),

    TITANIUM(MiningLevels.DIAMOND, 1523, 7.5f, 2.5f, 12,
            () ->Ingredient.ofItems(ModItems.TITANIUM));

    private final int miningLevel;

    private final int itemDurability;

    private final float miningSpeed;

    private final float attackDamage;

    private final int enchantability;

    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
