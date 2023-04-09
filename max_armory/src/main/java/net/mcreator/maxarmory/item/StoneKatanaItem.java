
package net.mcreator.maxarmory.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.maxarmory.init.MaxArmoryModTabs;

public class StoneKatanaItem extends SwordItem {
	public StoneKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 120;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 1.6f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 4;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.COBBLESTONE));
			}
		}, 3, -2.6f, new Item.Properties().tab(MaxArmoryModTabs.TAB_MAX_ARMORY));
	}
}
