package net.mcreator.maxarmory.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class StoneHammerhitProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.CRAMMING, (float) (0.12 * (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + 2.82));
	}
}
