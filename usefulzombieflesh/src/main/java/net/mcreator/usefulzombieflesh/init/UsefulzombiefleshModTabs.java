
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.usefulzombieflesh.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.usefulzombieflesh.UsefulzombiefleshMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UsefulzombiefleshModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UsefulzombiefleshMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(UsefulzombiefleshModItems.SALT.get());
			tabData.accept(UsefulzombiefleshModItems.FRYING_PAN.get());
			tabData.accept(UsefulzombiefleshModItems.WATER_BOWL.get());
			tabData.accept(UsefulzombiefleshModItems.DRIED_FLESH.get());
			tabData.accept(UsefulzombiefleshModItems.BAKED_FLESH.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(UsefulzombiefleshModBlocks.SALT_ORE.get().asItem());
		}
	}
}
