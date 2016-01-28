package com.fireball1725.charcoalblock.block;

import net.minecraft.block.material.Material;

public class BlockCharcoalBlock extends BlockBase {

    public BlockCharcoalBlock() {
        super(Material.rock);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypePiston);
    }
}
