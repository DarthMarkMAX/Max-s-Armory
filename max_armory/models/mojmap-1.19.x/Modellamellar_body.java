// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modellamellar_body<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "lamellar_body"), "main");
	private final ModelPart body;
	private final ModelPart L;
	private final ModelPart R;

	public Modellamellar_body(ModelPart root) {
		this.body = root.getChild("body");
		this.L = root.getChild("L");
		this.R = root.getChild("R");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 4)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(40, 1)
						.addBox(-2.0F, 14.0F, -2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone2 = body
				.addOrReplaceChild("bone2",
						CubeListBuilder.create().texOffs(22, 42).addBox(-0.3235F, -2.2074F, -3.0F, 5.0F, 2.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 42).addBox(-5.0F, -1.0F, -3.0F, 5.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -25.25F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition L = partdefinition.addOrReplaceChild("L", CubeListBuilder.create().texOffs(16, 20).addBox(-1.0F,
				-2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition R = partdefinition.addOrReplaceChild("R", CubeListBuilder.create().texOffs(0, 20).addBox(-3.0F,
				-2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		L.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		R.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}