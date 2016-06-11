package com.ispikemon.DemonicEmpowerment.item;


import com.ispikemon.DemonicEmpowerment.init.DEitems;
import net.minecraft.item.Item;

public class DEitem extends Item {

    public DEitem(String name, int maxStack) {
        this.setMaxStackSize(maxStack);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        addToItems(this);
    }

    private void addToItems(Item item) {
        DEitems.items.add(item);
    }

}
