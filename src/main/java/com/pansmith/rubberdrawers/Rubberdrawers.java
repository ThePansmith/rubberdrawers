package com.pansmith.rubberdrawers;

import com.buuz135.functionalstorage.FunctionalStorage;
import com.hrznstudio.titanium.module.ModuleController;
import com.pansmith.rubberdrawers.api.CustomWoodType;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
@Mod(Rubberdrawers.MOD_ID)
public class Rubberdrawers extends ModuleController {

    public static final String MOD_ID = "rubberdrawers";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    protected void initModules() {
        Arrays.stream(CustomWoodType.values()).filter(CustomWoodType::isModLoaded).forEach(FunctionalStorage.WOOD_TYPES::add);
    }
}
