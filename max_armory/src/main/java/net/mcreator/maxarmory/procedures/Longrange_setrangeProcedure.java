package net.mcreator.maxarmory.procedures;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class Longrange_setrangeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((LivingEntity) entity).getAttribute(ForgeMod.ATTACK_RANGE.get()).getBaseValue() != 5) {
			((LivingEntity) entity).getAttribute(ForgeMod.ATTACK_RANGE.get()).setBaseValue(5);
		}
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == (ItemStack.EMPTY).getItem())) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 1, 1, (false), (false)));
		}
	}
}
