package name.unusualideas.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class DamnationEnchantment extends Enchantment {
    public DamnationEnchantment(Rarity rarity, EnchantmentTarget target, EquipmentSlot[] slotTypes) {
        super(rarity, target, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return super.getMinPower(7);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        ServerWorld serverworld = (ServerWorld) user.getWorld();
        BlockPos blockPos = target.getBlockPos();

        if (target instanceof LivingEntity) {
            for (int i = 0; i < 5; i++){
                EntityType.LIGHTNING_BOLT.spawn(serverworld, blockPos, SpawnReason.TRIGGERED);
            }
        }

        super.onTargetDamaged(user, target, level);
    }
}
