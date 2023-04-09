
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxarmory.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MaxArmoryModTabs {
	public static CreativeModeTab TAB_MAX_ARMORY;

	public static void load() {
		TAB_MAX_ARMORY = new CreativeModeTab("tabmax_armory") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MaxArmoryModItems.IRON_HENGDAO.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
