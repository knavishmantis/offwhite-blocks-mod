package quinncaverly.offWhiteBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
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
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(OffWhiteBlocks.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OffWhiteBlocks.MOD_ID, name));
    }

    public static void initialize() {
        OffWhiteBlocks.LOGGER.info("Registering blocks for " + OffWhiteBlocks.MOD_ID);
    }
}
