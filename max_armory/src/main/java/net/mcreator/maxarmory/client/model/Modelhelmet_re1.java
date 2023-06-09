package net.mcreator.maxarmory.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhelmet_re1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("max_armory", "modelhelmet_re_1"), "main");
	public final ModelPart body;

	public Modelhelmet_re1(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)).texOffs(0, 20)
				.addBox(-4.0F, -2.0F, -1.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(1.5F)).texOffs(33, 1).addBox(0.0F, -13.0F, -1.0F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leftwing = body.addOrReplaceChild("leftwing", CubeListBuilder.create(), PartPose.offset(4.0F, -2.0F, -1.0F));
		PartDefinition cube_r1 = leftwing.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 14).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, -2.0F, 0.2618F, 0.2618F, 0.0F));
		PartDefinition rightwing = body.addOrReplaceChild("rightwing", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r2 = rightwing.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(35, 14).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.5F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, -27.0F, -3.0F, 0.2618F, -0.2618F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
