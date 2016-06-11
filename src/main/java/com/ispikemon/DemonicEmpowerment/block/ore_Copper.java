package com.ispikemon.DemonicEmpowerment.block;


import com.ispikemon.DemonicEmpowerment.Reference.Reference;
import com.ispikemon.DemonicEmpowerment.init.DEBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class ore_Copper extends Block {

    public ore_Copper(String name) {
        super(Material.ROCK);
        ResourceLocation location = new ResourceLocation(Reference.MOD_ID + ":" + name);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        addToBlocks(this);
    }

    private void addToBlocks(Block block) {
        DEBlocks.blocks.add(block);
    }
}