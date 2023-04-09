// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmingguang_leggings_re1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mingguang_leggings_re1"), "main");
	private final ModelPart right;
	private final ModelPart left;

	public Modelmingguang_leggings_re1(ModelPart root) {
		this.right = root.getChild("right");
		this.left = root.getChild("left");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition right = partdefinition.addOrReplaceChild("right", CubeListBuilder.create().texOffs(0, 10).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition bone = right
				.addOrReplaceChild("bone",
						CubeListBuilder.create().texOffs(16, 9).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 4.0F,
								new CubeDeformation(1.0F)),
						PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition left = partdefinition.addOrReplaceChild("left", CubeListBuilder.create().texOffs(0, 0).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition bone2 = left
				.addOrReplaceChild("bone2",
						CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 4.0F,
								new CubeDeformation(1.0F)),
						PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}