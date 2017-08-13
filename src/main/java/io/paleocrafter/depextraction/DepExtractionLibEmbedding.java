package io.paleocrafter.depextraction;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.commons.math3.random.RandomVectorGenerator;
import org.apache.commons.math3.random.SobolSequenceGenerator;

import java.util.Arrays;

@Mod(modid = "depextraction_libembedding")
public class DepExtractionLibEmbedding
{
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Random (hehe) example taken from the Apache Commons Math docs
        RandomVectorGenerator generator = new SobolSequenceGenerator(2);
        // We want interesting results, first one would always be [0, 0] xD
        generator.nextVector();
        System.out.println("RANDOM VECTOR:" + Arrays.toString(generator.nextVector()));
    }
}
