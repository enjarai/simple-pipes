package nl.enjarai.simplepipes.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import nl.enjarai.simplepipes.SimplePipes;

public class SimplePipesBlocks {
    public static final Block COBBLESTONE_PIPE_BLOCK = new BlockPipeCobblestone();

    public static final BlockEntityType<BlockEntityPipeCobblestone> COBBLESTONE_PIPE_BLOCK_ENTITY =
            FabricBlockEntityTypeBuilder.create(BlockEntityPipeCobblestone::new, COBBLESTONE_PIPE_BLOCK).build(null);

    public static void register() {
        registerBlock("cobblestone_pipe", COBBLESTONE_PIPE_BLOCK);

        registerBlockEntity("cobblestone_pipe", COBBLESTONE_PIPE_BLOCK_ENTITY);
    }

    private static void registerBlock(String path, Block block) {
        Registry.register(Registry.BLOCK, SimplePipes.id(path), block);
    }

    private static <T extends BlockEntity> void registerBlockEntity(String path, BlockEntityType<T> blockEntityType) {
        Registry.register(Registry.BLOCK_ENTITY_TYPE, SimplePipes.id(path), blockEntityType);
    }
}