package uk.co.hexeption.lightblock.setup;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import uk.co.hexeption.lightblock.particle.LightParticle;

import net.minecraft.client.Minecraft;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;

/**
 * ModParticles
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 25/02/2021 - 08:49 pm
 */
public class ModParticles {

	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_0 = Registration.PARTICLES.register("light_block_0", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_1 = Registration.PARTICLES.register("light_block_1", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_2 = Registration.PARTICLES.register("light_block_2", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_3 = Registration.PARTICLES.register("light_block_3", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_4 = Registration.PARTICLES.register("light_block_4", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_5 = Registration.PARTICLES.register("light_block_5", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_6 = Registration.PARTICLES.register("light_block_6", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_7 = Registration.PARTICLES.register("light_block_7", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_8 = Registration.PARTICLES.register("light_block_8", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_9 = Registration.PARTICLES.register("light_block_9", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_10 = Registration.PARTICLES.register("light_block_10", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_11 = Registration.PARTICLES.register("light_block_11", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_12 = Registration.PARTICLES.register("light_block_12", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_13 = Registration.PARTICLES.register("light_block_13", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_14 = Registration.PARTICLES.register("light_block_14", () -> new BasicParticleType(false));
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE_15 = Registration.PARTICLES.register("light_block_15", () -> new BasicParticleType(false));

	public static void register() {

	}

	@OnlyIn(Dist.CLIENT)
	public static void registerClient() {
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_0.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_0.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_1.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_1.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_2.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_2.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_3.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_3.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_4.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_4.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_5.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_5.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_6.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_6.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_7.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_7.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_8.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_8.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_9.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_9.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_10.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_10.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_11.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_11.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_12.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_12.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_13.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_13.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_14.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_14.get().asItem()));
		Minecraft.getInstance().particles.registerFactory((BasicParticleType) ModParticles.LIGHT_PARTICLE_15.get(), new LightParticle.Factory(ModBlocks.LIGHT_BLOCK_15.get().asItem()));

	}


}
