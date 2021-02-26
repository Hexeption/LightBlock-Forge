package uk.co.hexeption.lightblock;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uk.co.hexeption.lightblock.setup.ModBlocks;
import uk.co.hexeption.lightblock.setup.ModParticles;
import uk.co.hexeption.lightblock.setup.Registration;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

@Mod("lightblock")
public class Lightblock {

	private static final Logger LOGGER = LogManager.getLogger();

	// Mod ID
	public static final String ID = "lightblock";

	// Item Group
	public static ItemGroup TAB = new ItemGroup(ID) {

		@Override
		public ItemStack createIcon() {
			return new ItemStack(ModBlocks.LIGHT_BLOCK_15.get().asItem());
		}
	};

	public Lightblock() {

		Registration.register();

		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::onFMLLoadComplete);
	}

	@SubscribeEvent
	public void onFMLLoadComplete(FMLLoadCompleteEvent event) {
		DistExecutor.runWhenOn(Dist.CLIENT, () -> ModParticles::registerClient);
	}
}
