package com.jomlua.proxy;

import com.jomlua.testmod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

import static com.jomlua.testmod.germanium_ingot;

public class ClientProxy extends ServerProxy {

    @Override
    public void registerRenderers(){
        ModelLoader.setCustomModelResourceLocation(testmod.fluegel, 0, new ModelResourceLocation(new ResourceLocation("testmod:fluegel"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(testmod.germanium_ore), 0, new ModelResourceLocation(new ResourceLocation("testmod:germanium_ore"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(testmod.germanium_ingot, 0, new ModelResourceLocation(new ResourceLocation("testmod:germanium_ingot"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(testmod.xpscherben, 0, new ModelResourceLocation(new ResourceLocation("testmod:xpscherben"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(testmod.xpflash, 0, new ModelResourceLocation(new ResourceLocation("testmod:xpflash"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(testmod.flycore_ore), 0, new ModelResourceLocation(new ResourceLocation("testmod:flycore_ore"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(testmod.remix_core, 0, new ModelResourceLocation(new ResourceLocation("testmod:remix_core"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(testmod.steel_ingot, 0, new ModelResourceLocation(new ResourceLocation("testmod:steel_ingot"), "inventory"));
    }
}
