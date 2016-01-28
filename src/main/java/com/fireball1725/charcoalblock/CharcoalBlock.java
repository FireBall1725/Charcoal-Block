package com.fireball1725.charcoalblock;

import com.fireball1725.charcoalblock.block.Blocks;
import com.fireball1725.charcoalblock.proxy.IProxy;
import com.fireball1725.charcoalblock.reference.ModInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, certificateFingerprint = ModInfo.FINGERPRINT, dependencies = ModInfo.DEPENDENCIES, version = ModInfo.VERSION_BUILD)
public class CharcoalBlock {
    @Mod.Instance(ModInfo.MOD_ID)
    public static CharcoalBlock instance;

    @SidedProxy(clientSide = ModInfo.CLIENT_PROXY_CLASS, serverSide = ModInfo.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Register Blocks
        proxy.registerBlocks();

        // Register Recipes
        proxy.registerRecipes();

        // Register Fuel Registry
        proxy.registerFuels();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Register Block Renderers
        proxy.registerBlocks();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
