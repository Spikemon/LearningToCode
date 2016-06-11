package com.ispikemon.DemonicEmpowerment.proxy;

import com.ispikemon.DemonicEmpowerment.init.DEBlocks;
import com.ispikemon.DemonicEmpowerment.init.DEitems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent preEvent) {
        register(preEvent);
    }

    public void init(FMLInitializationEvent event) {
        registerRender(event);
    }

    public void register(FMLPreInitializationEvent preEvent) {
        DEBlocks.register(preEvent);
        DEitems.register(preEvent);
    }

    public void postInit(FMLPostInitializationEvent postEvent) {
    }

    public void registerRender(FMLInitializationEvent event) {
    }



}