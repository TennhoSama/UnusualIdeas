package name.unusualideas;

import name.unusualideas.block.ModBlocks;
import name.unusualideas.enchantment.ModEnchantments;
import name.unusualideas.item.ModItemGroup;
import name.unusualideas.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnusualIdeas implements ModInitializer {
	//模组ID
	public static final String MOD_ID = "unusual-ideas";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//初始化
	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItem();
		ModItemGroup.registerModItemGroup();
		ModEnchantments.registerModEnchantment();
		ModBlocks.registerModBlocks();

		//燃料注册
		FuelRegistry.INSTANCE.add(ModItems.CONCENTRATEDCOAL, 1750);
	}
}
