package quinncaverly.knavishBlocks.worldgen;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import quinncaverly.knavishBlocks.KnavishBlocks;

public class ModWorldGeneration {

    public static void initialize() {
        Registry.register(
            Registries.CHUNK_GENERATOR,
            Identifier.of(KnavishBlocks.MOD_ID, "offwhite_flat"),
            OffWhiteFlatChunkGenerator.CODEC
        );
    }
}
