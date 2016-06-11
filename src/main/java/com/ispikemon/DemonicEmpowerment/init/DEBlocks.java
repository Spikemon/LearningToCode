package com.ispikemon.DemonicEmpowerment.init;

import java.util.ArrayList;
import java.util.List;


import com.ispikemon.DemonicEmpowerment.block.ore_Copper;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DEBlocks extends Blocks{

    public static final List<Item> items = new ArrayList();

    public static List<Block> blocks = new ArrayList();

    public static Block ore_Copper = new ore_Copper("ore_Copper");

    public static List<Block> blockList(){
        return blocks;
    }
    public static List<Item> itemList(){
        return items;
    }


    public static void register(FMLPreInitializationEvent preEvent){
        for (Block block : blockList()){
            ItemBlock iBlock = new ItemBlock(block);
            if (block.getRegistryName().toString().endsWith("_crop")){
                iBlock.setMaxStackSize(1);
            }
            GameRegistry.register(block);
            GameRegistry.register(iBlock, block.getRegistryName());
        }
    }

    public static void registerRender(FMLInitializationEvent event){
        for (Block block : blockList()){
            Item item = new Item().getItemFromBlock(block);
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(block.getRegistryName().toString(), "inventory"));
        }
    }
}
