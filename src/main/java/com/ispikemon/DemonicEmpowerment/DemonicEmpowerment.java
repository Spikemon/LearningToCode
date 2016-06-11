package com.ispikemon.DemonicEmpowerment;

import com.ispikemon.DemonicEmpowerment.Reference.Reference;
import com.ispikemon.DemonicEmpowerment.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DemonicEmpowerment.modId, name = Reference.name, version = Reference.VERSION, acceptedMinecraftVersions = "[1.9.4]")
public class DemonicEmpowerment {

    public static final String modId = "DemonicEmpowerment";
    public static final String name = "Demonic Empowerment";
    public static final String version = "1.0.0";


    @Mod.Instance(modId)
    public static DemonicEmpowerment instance;

    @SidedProxy(serverSide = "com.ispikemon.DemonicEmpowerment.proxy.CommonProxy", clientSide = "com.ispikemon.DemonicEmpowerment.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent) {
        proxy.preInit(preEvent);



    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent) {
        proxy.postInit(postEvent);


    }

}

