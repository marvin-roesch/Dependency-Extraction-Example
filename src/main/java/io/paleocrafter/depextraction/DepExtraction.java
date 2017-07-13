package io.paleocrafter.depextraction;

import io.paleocrafter.depextraction.core.DepExtractionCore;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "depextraction")
public class DepExtraction
{
    public static String MOD_REFERENCE = "Normal mod can be referenced from coremod!";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println(DepExtractionCore.CORE_REFERENCE);
    }
}
