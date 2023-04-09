
package net.mcreator.maxarmory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class LamellarArmourPieceItem extends Item {
	public LamellarArmourPieceItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
