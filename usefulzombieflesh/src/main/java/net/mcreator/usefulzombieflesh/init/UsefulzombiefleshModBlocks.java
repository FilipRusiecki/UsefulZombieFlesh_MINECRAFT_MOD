
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.usefulzombieflesh.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.usefulzombieflesh.block.SaltOreBlock;
import net.mcreator.usefulzombieflesh.UsefulzombiefleshMod;

public class UsefulzombiefleshModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UsefulzombiefleshMod.MODID);
	public static final RegistryObject<Block> SALT_ORE = REGISTRY.register("salt_ore", () -> new SaltOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
