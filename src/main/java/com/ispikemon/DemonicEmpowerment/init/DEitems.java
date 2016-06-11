package com.ispikemon.DemonicEmpowerment.init;

import com.ispikemon.DemonicEmpowerment.item.DEitem;
import com.ispikemon.DemonicEmpowerment.item.felSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

public class DEitems extends Items{

    public static List<Item> items = new ArrayList();
    public static Item FelRock = new DEitem("FelRock", 64);

    public static List<Item> itemList() {
        return items;
    }

    public static void register(FMLPreInitializationEvent preEvent) {
        for (Item item : itemList()){
            GameRegistry.register(item);
        }
    }

    public static void registerRender(FMLInitializationEvent event) {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        for (Item item : itemList()){
            renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
        }
    }
}