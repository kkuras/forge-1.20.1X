package net.krtm.tutorialmod.util;

import net.krtm.tutorialmod.TutorialMod;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType PINE = WoodType.register(new WoodType(TutorialMod.MOD_ID + ":pine", BlockSetType.OAK));
}
