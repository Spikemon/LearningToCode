package com.ispikemon.DemonicEmpowerment.proxy;

import com.ispikemon.DemonicEmpowerment.init.DEBlocks;
import com.ispikemon.DemonicEmpowerment.init.DEitems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

    public void preInit(FMLPreInitializationEvent preEvent) {
        super.preInit(preEvent);
    }

    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    public void postInit(FMLPostInitializationEvent postEvent) {
        super.postInit(postEvent);
    }

    @Override
    public void registerRender(FMLInitializationEvent event) {
        DEBlocks.registerRender(event);
    }

}