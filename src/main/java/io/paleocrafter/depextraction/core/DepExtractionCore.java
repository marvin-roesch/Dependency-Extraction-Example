package io.paleocrafter.depextraction.core;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import io.paleocrafter.depextraction.DepExtraction;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.MCVersion;

import javax.annotation.Nullable;
import java.util.Map;

@MCVersion("1.12")
public class DepExtractionCore implements IFMLLoadingPlugin
{
    public static String CORE_REFERENCE = "Coremod can be referenced from normal mod!";

    @Override
    public String getModContainerClass()
    {
        return "io.paleocrafter.depextraction.core.DepExtractionCore$Container";
    }

    @Override
    public String[] getASMTransformerClass()
    {
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass()
    {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data)
    {
    }

    @Override
    public String getAccessTransformerClass()
    {
        return null;
    }

    public static class Container extends DummyModContainer
    {
        public Container()
        {
            super(new ModMetadata());
            ModMetadata meta = getMetadata();
            meta.modId = "depextractioncore";
            meta.name = "DepExtractionCore";
        }

        @Override
        public boolean registerBus(EventBus bus, LoadController controller)
        {
            bus.register(this);
            return true;
        }

        @Subscribe
        public void preInit(FMLPreInitializationEvent event)
        {
            System.out.println(DepExtraction.MOD_REFERENCE);
        }
    }
}
