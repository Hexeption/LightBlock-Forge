package uk.co.hexeption.lightblock.mixins;

import java.util.Random;
import java.util.function.Supplier;

import net.minecraftforge.fml.RegistryObject;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import uk.co.hexeption.lightblock.block.BlockLight;
import uk.co.hexeption.lightblock.setup.ModParticles;
import uk.co.hexeption.lightblock.setup.Registration;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.IParticleData;
import net.minecraft.profiler.IProfiler;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.storage.ISpawnWorldInfo;

/**
 * MixinClientWorld
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 25/02/2021 - 09:16 pm
 */
@Mixin(ClientWorld.class)
public abstract class MixinClientWorld extends World {

	@Shadow
	@Final
	private Minecraft mc;

	protected MixinClientWorld(ISpawnWorldInfo worldInfo, RegistryKey<World> dimension, DimensionType dimensionType, Supplier<IProfiler> profiler, boolean isRemote, boolean isDebug, long seed) {
		super(worldInfo, dimension, dimensionType, profiler, isRemote, isDebug, seed);
	}

	@Inject(method = "animateTick(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$Mutable;)V", at = @At("RETURN"))
	private void animateTick(int x, int y, int z, int offset, Random random, boolean holdingBarrier, BlockPos.Mutable pos, CallbackInfo ci) {
		int i = x + this.rand.nextInt(offset) - this.rand.nextInt(offset);
		int j = y + this.rand.nextInt(offset) - this.rand.nextInt(offset);
		int k = z + this.rand.nextInt(offset) - this.rand.nextInt(offset);
		pos.setPos(i, j, k);
		BlockState blockstate = this.getBlockState(pos);
		assert this.mc.player != null;
		for (ItemStack itemStack : this.mc.player.getHeldEquipment()) {
			for (RegistryObject<Block> blockRegistryObject : Registration.BLOCKS.getEntries()) {
				if (itemStack.getItem() == blockRegistryObject.get().asItem()) {
					if (blockstate.getBlock() == blockRegistryObject.get()) {
						switch (blockstate.get(BlockLight.lightLevel)) {
						case 0:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_0.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 1:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_1.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 2:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_2.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 3:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_3.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 4:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_4.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 5:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_5.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 6:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_6.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 7:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_7.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 8:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_8.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 9:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_9.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 10:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_10.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 11:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_11.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 12:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_12.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 13:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_13.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 14:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_14.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						case 15:
							this.addParticle((IParticleData) ModParticles.LIGHT_PARTICLE_15.get(), (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, 0.0D, 0.0D, 0.0D);
							break;
						}
					}
				}
			}

		}
	}

}
