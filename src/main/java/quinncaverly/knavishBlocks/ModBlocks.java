package quinncaverly.knavishBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    
    // Register all 20 off-white blocks
    public static final Block ALABASTER_BLOCK = register("alabaster_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block PEARL_BLOCK = register("pearl_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block CREAM_BLOCK = register("cream_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block IVORY_BLOCK = register("ivory_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block VANILLA_BLOCK = register("vanilla_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block EGGSHELL_BLOCK = register("eggshell_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block LINEN_BLOCK = register("linen_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block SEASHELL_BLOCK = register("seashell_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block BONE_BLOCK = register("bone_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.BONE), true);
    
    public static final Block COTTON_BLOCK = register("cotton_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.WOOL), true);
    
    public static final Block PORCELAIN_BLOCK = register("porcelain_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block CHAMPAGNE_BLOCK = register("champagne_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block PARCHMENT_BLOCK = register("parchment_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block COCONUT_BLOCK = register("coconut_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block CANVAS_BLOCK = register("canvas_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.WOOL), true);
    
    public static final Block BISQUE_BLOCK = register("bisque_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block ECRU_BLOCK = register("ecru_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block MAGNOLIA_BLOCK = register("magnolia_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block ALMOND_BLOCK = register("almond_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block GHOST_BLOCK = register("ghost_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), true);
    
    public static final Block MINT_BLOCK = register("mint_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block SAND_BLOCK = register("sand_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    
    public static final Block BLUSH_BLOCK = register("blush_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);

    // Monotone chess — 256 unique sub-pixel blocks per type; light=matte, dark=polished
    public static final Block[] MONO_LIGHT = new Block[256];
    public static final Block[] MONO_DARK  = new Block[256];
    static {
        AbstractBlock.Settings ms = AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE);
        for (int i = 0; i < 256; i++) {
            MONO_LIGHT[i] = register("mono_light_" + i, Block::new, ms, true);
            MONO_DARK[i]  = register("mono_dark_"  + i, Block::new, ms, true);
        }
    }

    // Chroma key / green screen blocks — solid emissive colors for video compositing
    public static final Block GREEN_SCREEN_BLOCK = register("green_screen_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.WOOL).luminance(state -> 15).emissiveLighting((state, world, pos) -> true), true);
    public static final Block BLUE_SCREEN_BLOCK = register("blue_screen_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.WOOL).luminance(state -> 15).emissiveLighting((state, world, pos) -> true), true);
    public static final Block RED_SCREEN_BLOCK = register("red_screen_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.WOOL).luminance(state -> 15).emissiveLighting((state, world, pos) -> true), true);
    public static final Block BLACK_SCREEN_BLOCK = register("black_screen_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.WOOL).luminance(state -> 0).emissiveLighting((state, world, pos) -> true), true);
    public static final Block WHITE_SCREEN_BLOCK = register("white_screen_block",
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.WOOL).luminance(state -> 15).emissiveLighting((state, world, pos) -> true), true);

    // Marble blocks — 8 shades from white base to dark vein (Carrara palette)
    public static final Block MARBLE_1 = register("marble_1",  // #f5f2ed white base
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    public static final Block MARBLE_2 = register("marble_2",  // #e8e0d5 off-white
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    public static final Block MARBLE_3 = register("marble_3",  // #c8c0b5 light grey
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    public static final Block MARBLE_4 = register("marble_4",  // #9a9088 dark grey
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    public static final Block MARBLE_5 = register("marble_5",  // #504840 vein core
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    public static final Block MARBLE_6 = register("marble_6",  // #edeae5 near-white
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    public static final Block MARBLE_7 = register("marble_7",  // #d8d0c5 light warm grey
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);
    public static final Block MARBLE_8 = register("marble_8",  // #b0a89a medium grey
            Block::new, AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE), true);

    // Chess blocks — 256 unique blocks per type, single repeating grain pattern
    public static final Block[] CHESS_LIGHT = new Block[256];
    public static final Block[] CHESS_DARK  = new Block[256];
    static {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.STONE);
        for (int i = 0; i < 256; i++) {
            CHESS_LIGHT[i] = register("chess_light_" + i, Block::new, settings, true);
            CHESS_DARK[i]  = register("chess_dark_"  + i, Block::new, settings, true);
        }
    }

    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        // Create a registry key for the block
        RegistryKey<Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        // Sometimes, you may not want to register an item for the block.
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID can be the same.
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
            Registry.register(Registries.ITEM, itemKey, blockItem);
            
            // Add to building blocks creative tab
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
                entries.add(blockItem);
            });
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(KnavishBlocks.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(KnavishBlocks.MOD_ID, name));
    }

    public static void initialize() {
        KnavishBlocks.LOGGER.info("Registering blocks for " + KnavishBlocks.MOD_ID);
    }
}
