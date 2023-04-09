
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxarmory.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.maxarmory.client.model.Modelmingguang_leggings_re1;
import net.mcreator.maxarmory.client.model.Modellamellar_body;
import net.mcreator.maxarmory.client.model.Modellamellar_armor;
import net.mcreator.maxarmory.client.model.Modelknightchest;
import net.mcreator.maxarmory.client.model.Modelhelmet_re1;
import net.mcreator.maxarmory.client.model.Modelcustom_model;
import net.mcreator.maxarmory.client.model.Modelcloud_boots_model;
import net.mcreator.maxarmory.client.model.Modelarmhelm;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MaxArmoryModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelhelmet_re1.LAYER_LOCATION, Modelhelmet_re1::createBodyLayer);
		event.registerLayerDefinition(Modelknightchest.LAYER_LOCATION, Modelknightchest::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modellamellar_armor.LAYER_LOCATION, Modellamellar_armor::createBodyLayer);
		event.registerLayerDefinition(Modelcloud_boots_model.LAYER_LOCATION, Modelcloud_boots_model::createBodyLayer);
		event.registerLayerDefinition(Modellamellar_body.LAYER_LOCATION, Modellamellar_body::createBodyLayer);
		event.registerLayerDefinition(Modelmingguang_leggings_re1.LAYER_LOCATION, Modelmingguang_leggings_re1::createBodyLayer);
		event.registerLayerDefinition(Modelarmhelm.LAYER_LOCATION, Modelarmhelm::createBodyLayer);
	}
}
