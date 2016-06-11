package com.ispikemon.DemonicEmpowerment.item;

import com.ispikemon.DemonicEmpowerment.init.DEitems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class FelRock extends Item {

    public FelRock(String name) {
        setRegistryName("FelRock");
        setUnlocalizedName("FelRock");
        GameRegistry.register(this);
        this.setCreativeTab(CreativeTabs.MATERIALS);
        addToItems(this);
    }

    public static void setItemName(Item item, String itemName) {
        item.setRegistryName(itemName);
        item.setUnlocalizedName(item.getRegistryName().toString());
    }

    public void addToItems(Item item) {
        DEitems.items.add(item);
    }

}