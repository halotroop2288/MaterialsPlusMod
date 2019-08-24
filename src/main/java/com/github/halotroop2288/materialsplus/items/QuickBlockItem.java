package com.github.halotroop2288.materialsplus.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class QuickBlockItem extends BlockItem
{
	public QuickBlockItem(Block block)
	{
		super(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	}
}
