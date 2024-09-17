package name.unusualideas.item.special.foods;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.joml.Random;

public class Ibuprofen extends Item {
    private static final int MAX_USE_TIME = 16;

    public Ibuprofen(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof ServerPlayerEntity serverPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }

        if (user instanceof PlayerEntity && !((PlayerEntity)user).getAbilities().creativeMode) {
            stack.decrement(1);
        }

        if (!world.isClient) {
            user.clearStatusEffects();
            Random Random = new Random();
            Random random = new Random();
            int NAUSEA_R = Random.nextInt(2);
            int nausea_r = random.nextInt(100);
            int IND_R = Random.nextInt(2);
            int ind_r = random.nextInt(100);
            float s_r = random.nextFloat();

            //布洛芬吃后有5%到15%的患者出现恶心现象，游戏中也还原了这一点，这很河里（合理）[doge]
            if (NAUSEA_R == 0 && nausea_r < 4){
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1000));
            }
            if (NAUSEA_R == 1 && nausea_r < 14){
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1000));
            }
            //皮肤过敏症状
            if (IND_R == 0 && ind_r == 0 && s_r > 0.15) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 100));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 20));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1000));
            }
            if (IND_R == 1 && ind_r <= 4 && s_r > 0.15) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 100));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 20));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1000));
            }
            //（非常小概率的）短暂休克
            //s_r表示在皮肤过敏可能下的休克可能
            if (IND_R == 0 && ind_r == 0 && s_r <= 0.15) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 58));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 250));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 500));
            }
            if (IND_R == 1 && ind_r <= 4 && s_r <= 0.15) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 58));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 250));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 500));
            }
            //服用药物后无不适症状 (Yeah! :p)
            if (NAUSEA_R == 0 & nausea_r > 4 & IND_R == 0 & ind_r > 0 & s_r > 0.15 || NAUSEA_R == 1 & nausea_r > 14 & IND_R == 1 & ind_r > 4 & s_r > 0.15) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1000));
            }
        }

        return stack.isEmpty() ? new ItemStack(Items.AIR) : stack;
    }
    @Override
    public int getMaxUseTime(ItemStack stack) {
        return MAX_USE_TIME;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

}
