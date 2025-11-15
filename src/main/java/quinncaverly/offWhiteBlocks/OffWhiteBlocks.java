package quinncaverly.offWhiteBlocks;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OffWhiteBlocks implements ModInitializer {
    public static final String MOD_ID = "off-white-blocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Off-White Blocks");
        ModBlocks.initialize();
    }
}
