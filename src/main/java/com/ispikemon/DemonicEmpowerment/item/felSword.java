package com.ispikemon.DemonicEmpowerment.item;

import com.ispikemon.DemonicEmpowerment.init.DEitems;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class felSword extends ItemSword{

    public static ToolMaterial FELROCK = EnumHelper.addToolMaterial("FELROCK", 3, 30, 6.0F, 3.0F, 30);

    private final float attackDamage;
    private final ToolMaterial material;

    public felSword(String name, ToolMaterial material) {
        super(material);
        this.material = material;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setMaxDamage(material.getMaxUses());
        this.attackDamage = 3.0F + this.material.getDamageVsEntity();
        addToItems(this);
    }

    private void addToItems(Item item) {
        DEitems.items.add(item);
    }



}