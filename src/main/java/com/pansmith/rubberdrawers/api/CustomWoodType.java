package com.pansmith.rubberdrawers.api;


import com.buuz135.functionalstorage.util.IWoodType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;


public enum CustomWoodType implements IWoodType {


    rubber("minecraft", "rubber_log", "rubber_planks");

    private final String modID;
    private final String logName;
    private final String plankName;

    CustomWoodType(String modID, String logName, String plankName) {
        this.modID = modID;
        this.logName = logName;
        this.plankName = plankName;
    }

    @Override
    public Block getWood() {
        return ForgeRegistries.BLOCKS.getValue(new ResourceLocation(this.modID, this.logName));
    }

    @Override
    public Block getPlanks() {
        return ForgeRegistries.BLOCKS.getValue(new ResourceLocation(this.modID, this.plankName));
    }

    @Override
    public String getName() {
        return this.name().toLowerCase();
    }

    public boolean isModLoaded() {
        return ModList.get().isLoaded(this.modID);
    }
}

