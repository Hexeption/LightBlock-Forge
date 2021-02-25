package uk.co.hexeption.lightblock.setup;

import java.util.function.Supplier;

import net.minecraftforge.fml.RegistryObject;
import uk.co.hexeption.lightblock.Lightblock;
import uk.co.hexeption.lightblock.block.BlockLight;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

/**
 * ModBlocks
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 25/02/2021 - 08:04 pm
 */
public class ModBlocks {

	public static final RegistryObject<Block> LIGHT_BLOCK_0 = register("light_block_0", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 0));
	public static final RegistryObject<Block> LIGHT_BLOCK_1 = register("light_block_1", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 0));
	public static final RegistryObject<Block> LIGHT_BLOCK_2 = register("light_block_2", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 1));
	public static final RegistryObject<Block> LIGHT_BLOCK_3 = register("light_block_3", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 2));
	public static final RegistryObject<Block> LIGHT_BLOCK_4 = register("light_block_4", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 3));
	public static final RegistryObject<Block> LIGHT_BLOCK_5 = register("light_block_5", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 4));
	public static final RegistryObject<Block> LIGHT_BLOCK_6 = register("light_block_6", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 5));
	public static final RegistryObject<Block> LIGHT_BLOCK_7 = register("light_block_7", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 6));
	public static final RegistryObject<Block> LIGHT_BLOCK_8 = register("light_block_8", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 7));
	public static final RegistryObject<Block> LIGHT_BLOCK_9 = register("light_block_9", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 8));
	public static final RegistryObject<Block> LIGHT_BLOCK_10 = register("light_block_10", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 9));
	public static final RegistryObject<Block> LIGHT_BLOCK_11 = register("light_block_11", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 10));
	public static final RegistryObject<Block> LIGHT_BLOCK_12 = register("light_block_12", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 11));
	public static final RegistryObject<Block> LIGHT_BLOCK_13 = register("light_block_13", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 12));
	public static final RegistryObject<Block> LIGHT_BLOCK_14 = register("light_block_14", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 13));
	public static final RegistryObject<Block> LIGHT_BLOCK_15 = register("light_block_15", () -> new BlockLight(AbstractBlock.Properties.from(Blocks.BARRIER).setLightLevel(value -> value.get(BlockLight.lightLevel)), 14));

	public static void register() {

	}

	public static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
		return Registration.BLOCKS.register(name, block);
	}

	public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
		RegistryObject<T> ret = registerNoItem(name, block);
		Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(Lightblock.TAB)));
		return ret;
	}
}
