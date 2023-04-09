package net.mcreator.maxarmory.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class HammerEntityHitedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.CRAMMING, (float) (0.08 * (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + 1.92));
	}
}
