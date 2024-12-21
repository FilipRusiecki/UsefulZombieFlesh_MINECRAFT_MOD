
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.usefulzombieflesh.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.usefulzombieflesh.item.WaterBowlItem;
import net.mcreator.usefulzombieflesh.item.SaltItem;
import net.mcreator.usefulzombieflesh.item.FryingPanItem;
import net.mcreator.usefulzombieflesh.UsefulzombiefleshMod;

public class UsefulzombiefleshModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UsefulzombiefleshMod.MODID);
	public static final RegistryObject<Item> SALT = REGISTRY.register("salt", () -> new SaltItem());
	public static final RegistryObject<Item> FRYING_PAN = REGISTRY.register("frying_pan", () -> new FryingPanItem());
	public static final RegistryObject<Item> WATER_BOWL = REGISTRY.register("water_bowl", () -> new WaterBowlItem());
	public static final RegistryObject<Item> SALT_ORE = block(UsefulzombiefleshModBlocks.SALT_ORE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
