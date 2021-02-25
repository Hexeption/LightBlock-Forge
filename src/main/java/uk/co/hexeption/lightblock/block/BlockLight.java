package uk.co.hexeption.lightblock.block;

import net.minecraft.block.BarrierBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

/**
 * BlockLight
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 25/02/2021 - 08:16 pm
 */
public class BlockLight extends BarrierBlock {

	public static final IntegerProperty lightLevel = IntegerProperty.create("light", 0, 15);

	public BlockLight(Properties properties, int defaultLight) {
		super(properties);
		setDefaultState(getStateContainer().getBaseState().with(lightLevel, defaultLight));
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {

		if (context.hasItem(this.asItem())) {
			return super.getShape(state, worldIn, pos, context);
		} else {
			return VoxelShapes.empty();
		}

	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(lightLevel);
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {

		if (state.get(lightLevel) + 1 == 16) {
			worldIn.setBlockState(pos, state.with(lightLevel, 0));
		} else {
			worldIn.setBlockState(pos, state.with(lightLevel, state.get(lightLevel) + 1));
		}
		return ActionResultType.SUCCESS;

	}
}
