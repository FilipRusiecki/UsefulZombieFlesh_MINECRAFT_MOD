
package net.mcreator.usefulzombieflesh.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class DriedFleshItem extends Item {
	public DriedFleshItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0f).alwaysEat().meat().build()));
	}
}
