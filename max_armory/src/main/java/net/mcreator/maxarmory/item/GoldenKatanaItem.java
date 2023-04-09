
package net.mcreator.maxarmory.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.maxarmory.init.MaxArmoryModTabs;

public class GoldenKatanaItem extends SwordItem {
	public GoldenKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 28;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.GOLD_INGOT));
			}
		}, 3, -2.5999999999999999f, new Item.Properties().tab(MaxArmoryModTabs.TAB_MAX_ARMORY));
	}
}
