
package net.mcreator.maxarmory.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.maxarmory.init.MaxArmoryModTabs;

public class WoodenMacheteItem extends AxeItem {
	public WoodenMacheteItem() {
		super(new Tier() {
			public int getUses() {
				return 59;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 2.9f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.STICK));
			}
		}, 1, -2.7f, new Item.Properties().tab(MaxArmoryModTabs.TAB_MAX_ARMORY));
	}
}
