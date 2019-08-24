package com.github.halotroop2288.materialsplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.common.ToolType;

public class LayeredBlock extends Block
{
	public LayeredBlock(Material material, float hardness, float resistance, int lightValue, SoundType soundType, String name, int harvestLevel, ToolType harvestTool)
	{
		super(Block.Properties.create(material).hardnessAndResistance(hardness, resistance).lightValue(lightValue).sound(soundType).harvestLevel(harvestLevel).harvestTool(harvestTool));
	}

	@Override
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}
}