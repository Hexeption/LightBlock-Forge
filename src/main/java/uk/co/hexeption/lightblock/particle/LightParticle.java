package uk.co.hexeption.lightblock.particle;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.SpriteTexturedParticle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.Item;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.IItemProvider;

/**
 * LightParticle
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 25/02/2021 - 08:35 pm
 */
public class LightParticle extends SpriteTexturedParticle {


	protected LightParticle(ClientWorld world, double x, double y, double z, IItemProvider itemProvider) {
		super(world, x, y, z);
		this.setSprite(Minecraft.getInstance().getItemRenderer().getItemModelMesher().getParticleIcon(itemProvider));
		this.particleGravity = 0.0F;
		this.maxAge = 40;
		this.canCollide = false;
	}

	@Override
	public IParticleRenderType getRenderType() {
		return IParticleRenderType.TERRAIN_SHEET;
	}

	@Override
	public float getScale(float scaleFactor) {
		return 0.5F;
	}

	@OnlyIn(Dist.CLIENT)
	public static class Factory implements IParticleFactory<BasicParticleType> {

		private Item theItem;

		public Factory(Item theItem) {
			this.theItem = theItem;
		}

		public Particle makeParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new LightParticle(worldIn, x, y, z, theItem);
		}
	}

}
