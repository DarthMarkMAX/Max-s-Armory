
package net.mcreator.maxarmory.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.maxarmory.procedures.Longrange_setrangeProcedure;
import net.mcreator.maxarmory.init.MaxArmoryModTabs;

import java.util.List;

public class NethritePikeItem extends SwordItem {
	public NethritePikeItem() {
		super(new Tier() {
			public int getUses() {
				return 2048;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT));
			}
		}, 3, -2.5999999999999999f, new Item.Properties().tab(MaxArmoryModTabs.TAB_MAX_ARMORY).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Attack Range +2"));
		list.add(Component.literal("Two-hand"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			Longrange_setrangeProcedure.execute(entity);
	}
}
