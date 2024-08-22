package name.unusualideas.item.special;

import net.minecraft.entity.*;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.*;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.entity.projectile.thrown.ExperienceBottleEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.entity.vehicle.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class RandomEntitiesStick extends Item {

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        if (world.isClient){
            return TypedActionResult.pass(user.getStackInHand(hand));
        }
        BlockPos InFrontOfPlayer = user.getBlockPos().offset(user.getHorizontalFacing(), 1);

        Random random = new Random();
        int RNum = random.nextInt(107);
        if (RNum == 0){
            Entity entity = new AllayEntity(EntityType.ALLAY, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 1){
            Entity entity = new ArmorStandEntity(EntityType.ARMOR_STAND, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 2){
            Entity entity = new ArrowEntity(EntityType.ARROW, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 3){
            Entity entity = new AxolotlEntity(EntityType.AXOLOTL, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 4){
            Entity entity = new BatEntity(EntityType.BAT, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 5){
            Entity entity = new BeeEntity(EntityType.BEE, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 6){
            Entity entity = new BlazeEntity(EntityType.BLAZE, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 7){
            Entity entity = new BoatEntity(EntityType.BOAT, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 8){
            Entity entity = new CamelEntity(EntityType.CAMEL, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 9){
            Entity entity = new CatEntity(EntityType.CAT, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 10){
            Entity entity = new CaveSpiderEntity(EntityType.CAVE_SPIDER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 11){
            Entity entity = new ChestMinecartEntity(EntityType.CHEST_MINECART, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 12){
            Entity entity = new ChickenEntity(EntityType.CHICKEN, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 13){
            Entity entity = new CodEntity(EntityType.COD, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 14){
            Entity entity = new CommandBlockMinecartEntity(EntityType.COMMAND_BLOCK_MINECART, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 15){
            Entity entity = new ChestBoatEntity(EntityType.CHEST_BOAT, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 16){
            Entity entity = new CowEntity(EntityType.COW, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 17){
            Entity entity = new CreeperEntity(EntityType.CREEPER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 18){
            Entity entity = new DolphinEntity(EntityType.DOLPHIN, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 19){
            Entity entity = new DonkeyEntity(EntityType.DONKEY, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 20){
            Entity entity = new DragonFireballEntity(EntityType.DRAGON_FIREBALL, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 21){
            Entity entity = new EggEntity(EntityType.EGG, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 22){
            Entity entity = new ElderGuardianEntity(EntityType.ELDER_GUARDIAN, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 23){
            Entity entity = new EndCrystalEntity(EntityType.END_CRYSTAL, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 24){
            Entity entity = new EnderDragonEntity(EntityType.ENDER_DRAGON, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 25){
            Entity entity = new EnderPearlEntity(EntityType.ENDER_PEARL, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 26){
            Entity entity = new EndermanEntity(EntityType.ENDERMAN, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 27){
            Entity entity = new EndermiteEntity(EntityType.ENDERMITE, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 28){
            Entity entity = new EvokerEntity(EntityType.EVOKER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 29){
            Entity entity = new EvokerFangsEntity(EntityType.EVOKER_FANGS, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 30){
            Entity entity = new ExperienceBottleEntity(EntityType.EXPERIENCE_BOTTLE, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 31){
            Entity entity = new ExperienceOrbEntity(EntityType.EXPERIENCE_ORB, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 32){
            Entity entity = new EyeOfEnderEntity(EntityType.EYE_OF_ENDER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 33){
            Entity entity = new FireworkRocketEntity(EntityType.FIREWORK_ROCKET, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 34){
            Entity entity = new FoxEntity(EntityType.FOX, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 35){
            Entity entity = new FrogEntity(EntityType.FROG, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 36){
            Entity entity = new FurnaceMinecartEntity(EntityType.FURNACE_MINECART, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 37){
            Entity entity = new GhastEntity(EntityType.GHAST, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 38){
            Entity entity = new GiantEntity(EntityType.GIANT, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 39){
            Entity entity = new GlowSquidEntity(EntityType.GLOW_SQUID, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 40){
            Entity entity = new GoatEntity(EntityType.GOAT, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 41){
            Entity entity = new GuardianEntity(EntityType.GUARDIAN, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 42){
            Entity entity = new HoglinEntity(EntityType.HOGLIN, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 43){
            Entity entity = new HopperMinecartEntity(EntityType.HOPPER_MINECART, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 44){
            Entity entity = new HorseEntity(EntityType.HORSE, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 45){
            Entity entity = new HuskEntity(EntityType.HUSK, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 46){
            Entity entity = new IllusionerEntity(EntityType.ILLUSIONER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 47){
            Entity entity = new IronGolemEntity(EntityType.IRON_GOLEM, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 48){
            Entity entity = new FireballEntity(EntityType.FIREBALL, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 49){
            Entity entity = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 50){
            Entity entity = new LlamaEntity(EntityType.LLAMA, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 51){
            Entity entity = new LlamaSpitEntity(EntityType.LLAMA_SPIT, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 52){
            Entity entity = new MinecartEntity(EntityType.MINECART, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 53){
            Entity entity = new MooshroomEntity(EntityType.MOOSHROOM, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 54){
            Entity entity = new MuleEntity(EntityType.MULE, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 55){
            Entity entity = new OcelotEntity(EntityType.OCELOT, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 56){
            Entity entity = new PandaEntity(EntityType.PANDA, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 57){
            Entity entity = new ParrotEntity(EntityType.PARROT, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 58){
            Entity entity = new PhantomEntity(EntityType.PHANTOM, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 59){
            Entity entity = new PigEntity(EntityType.PIG, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 60){
            Entity entity = new PiglinEntity(EntityType.PIGLIN, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 61){
            Entity entity = new PiglinBruteEntity(EntityType.PIGLIN_BRUTE, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 62){
            Entity entity = new PillagerEntity(EntityType.PILLAGER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 63){
            Entity entity = new PolarBearEntity(EntityType.POLAR_BEAR, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 64){
            Entity entity = new PufferfishEntity(EntityType.PUFFERFISH, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 65){
            Entity entity = new RabbitEntity(EntityType.RABBIT, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 66){
            Entity entity = new RavagerEntity(EntityType.RAVAGER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 67){
            Entity entity = new SalmonEntity(EntityType.SALMON, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 68){
            Entity entity = new SheepEntity(EntityType.SHEEP, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 69){
            Entity entity = new ShulkerEntity(EntityType.SHULKER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 70){
            Entity entity = new ShulkerBulletEntity(EntityType.SHULKER_BULLET, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 71){
            Entity entity = new SilverfishEntity(EntityType.SILVERFISH, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 72){
            Entity entity = new SkeletonEntity(EntityType.SKELETON, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 73){
            Entity entity = new SkeletonHorseEntity(EntityType.SKELETON_HORSE, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 74){
            Entity entity = new SlimeEntity(EntityType.SLIME, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 75){
            Entity entity = new SmallFireballEntity(EntityType.SMALL_FIREBALL, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 76){
            Entity entity = new SnifferEntity(EntityType.SNIFFER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 77){
            Entity entity = new SnowGolemEntity(EntityType.SNOW_GOLEM, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 78){
            Entity entity = new SnowballEntity(EntityType.SNOWBALL, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 79){
            Entity entity = new SpawnerMinecartEntity(EntityType.SPAWNER_MINECART, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 80){
            Entity entity = new SpectralArrowEntity(EntityType.SPECTRAL_ARROW, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 81){
            Entity entity = new SpiderEntity(EntityType.SPIDER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 82){
            Entity entity = new SquidEntity(EntityType.SQUID, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 83){
            Entity entity = new StrayEntity(EntityType.STRAY, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 84){
            Entity entity = new StriderEntity(EntityType.STRIDER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 85){
            Entity entity = new TadpoleEntity(EntityType.TADPOLE, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 86){
            Entity entity = new TntEntity(EntityType.TNT, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 87){
            Entity entity = new TntMinecartEntity(EntityType.TNT_MINECART, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 88){
            Entity entity = new TraderLlamaEntity(EntityType.TRADER_LLAMA, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 89){
            Entity entity = new TridentEntity(EntityType.TRIDENT, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 90){
            Entity entity = new TropicalFishEntity(EntityType.TROPICAL_FISH, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 91){
            Entity entity = new TurtleEntity(EntityType.TURTLE, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 92){
            Entity entity = new VexEntity(EntityType.VEX, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 93){
            Entity entity = new VillagerEntity(EntityType.VILLAGER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 94){
            Entity entity = new VindicatorEntity(EntityType.VINDICATOR, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 95){
            Entity entity = new WanderingTraderEntity(EntityType.WANDERING_TRADER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 96){
            Entity entity = new WardenEntity(EntityType.WARDEN, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 97){
            Entity entity = new WitchEntity(EntityType.WITCH, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 98){
            Entity entity = new WitherEntity(EntityType.WITHER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 99){
            Entity entity = new WitherSkeletonEntity(EntityType.WITHER_SKELETON, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 100){
            Entity entity = new WitherSkullEntity(EntityType.WITHER_SKULL, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 101){
            Entity entity = new WolfEntity(EntityType.WOLF, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 102){
            Entity entity = new ZoglinEntity(EntityType.ZOGLIN, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 103){
            Entity entity = new ZombieEntity(EntityType.ZOMBIE, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 104){
            Entity entity = new ZombieHorseEntity(EntityType.ZOMBIE_HORSE, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 105){
            Entity entity = new ZombieVillagerEntity(EntityType.ZOMBIE_VILLAGER, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }   else if (RNum == 106){
            Entity entity = new ZombifiedPiglinEntity(EntityType.ZOMBIFIED_PIGLIN, world);
            entity.setPosition(InFrontOfPlayer.toCenterPos());
            world.spawnEntity(entity);
        }

        return TypedActionResult.success(user.getStackInHand(hand));
    }

    public RandomEntitiesStick(Settings settings) {
        super(settings);
    }
}
