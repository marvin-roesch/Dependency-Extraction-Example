package io.paleocrafter.depextraction;

import com.flowpowered.math.GenericMath;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "depextraction_libembedding")
public class DepExtractionLibEmbedding
{
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("ROUNDING: " + GenericMath.round(10.023523, 3));
    }
}
