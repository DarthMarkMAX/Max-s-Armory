// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelknightchest<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "knightchest"), "main");
	private final ModelPart body;
	private final ModelPart L;
	private final ModelPart R;

	public Modelknightchest(ModelPart root) {
		this.body = root.getChild("body");
		this.L = root.getChild("L");
		this.R = root.getChild("R");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(
				-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 5).addBox(-3.0F, 1.0F, -3.0F, 3.0F, 4.0F, 6.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(5.0F, 10.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(18, 5).addBox(0.0F, 1.0F, -3.0F, 3.0F, 4.0F, 6.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-5.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition L = partdefinition.addOrReplaceChild("L", CubeListBuilder.create().texOffs(40, 16).addBox(-1.0F,
				-2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition R = partdefinition.addOrReplaceChild("R", CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F,
				-2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		L.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		R.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}