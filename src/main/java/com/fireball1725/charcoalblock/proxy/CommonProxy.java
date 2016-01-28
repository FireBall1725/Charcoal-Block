package com.fireball1725.charcoalblock.proxy;


import com.fireball1725.charcoalblock.block.Blocks;
import com.fireball1725.charcoalblock.util.FuelHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class CommonProxy implements IProxy {
    @Override
    public void registerBlocks() {
        Blocks.registerAll();
    }

    @Override
    public void registerRecipes() {
        GameRegistry.addRecipe(new ItemStack(Blocks.BLOCK_CHARCOAL.block),
                "xxx",
                "xxx",
                "xxx",
                'x', new ItemStack(Items.coal, 1, 1)
                );
    }

    @Override
    public void registerFuels() {
        GameRegistry.registerFuelHandler(new FuelHandler());
    }
}
