package earth.terrarium.cadmus.common.util.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class ModUtilsImpl {
    public static boolean isModLoaded(String modId) {
        return FabricLoader.getInstance().isModLoaded(modId);
    }
}
