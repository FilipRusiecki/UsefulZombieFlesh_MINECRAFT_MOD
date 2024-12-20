
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.usefulzombieflesh.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.usefulzombieflesh.item.SaltItem;
import net.mcreator.usefulzombieflesh.UsefulzombiefleshMod;

public class UsefulzombiefleshModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UsefulzombiefleshMod.MODID);
	public static final RegistryObject<Item> SALT = REGISTRY.register("salt", () -> new SaltItem());
	// Start of user code block custom items
	// End of user code block custom items
}
