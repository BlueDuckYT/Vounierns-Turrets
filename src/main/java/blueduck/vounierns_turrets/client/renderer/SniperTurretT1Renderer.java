package blueduck.vounierns_turrets.client.renderer;

import blueduck.vounierns_turrets.VouniernTurrets;
import blueduck.vounierns_turrets.client.model.SeedTurretT1Model;
import blueduck.vounierns_turrets.client.model.SniperTurretT1Model;
import blueduck.vounierns_turrets.entity.SeedTurret;
import blueduck.vounierns_turrets.entity.SniperTurret;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SniperTurretT1Renderer extends GeoEntityRenderer<SniperTurret> {
    public SniperTurretT1Renderer(EntityRendererProvider.Context renderManager, GeoModel<SniperTurret> modelProvider) {
        super(renderManager, modelProvider);
        this.shadowRadius = 0.4f;
    }
    public SniperTurretT1Renderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SniperTurretT1Model());
        this.shadowRadius = 0.4f;
    }

    @Override
    public ResourceLocation getTextureLocation(SniperTurret animatable) {
        return new ResourceLocation(VouniernTurrets.MODID, "textures/entity/sniper_turret_tier_1.png");

    }


}
