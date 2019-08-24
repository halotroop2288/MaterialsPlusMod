package com.github.halotroop2288.materialsplus.init;

import org.apache.commons.lang3.ArrayUtils;

import com.github.halotroop2288.materialsplus.items.QuickItemSet;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Generics
{
	/*
	 * Inputs: List of material names
	 * Outputs: Ingot, Nugget, Plate, Dust, Impure Dust, Purified Dust for all given materials
	 * If you want anything less than that, use QuickItemSet::QuickMetalSet(materialName, booleans...)
	 */
	public static Item[] allMetalsGeneric(String... materials)
	{
		Item[] all = new Item[] {};
		for (String material : materials)
		{
			QuickItemSet q = new QuickItemSet(material, true, true, true, true, true, true, true, true);
			all = ArrayUtils.addAll(all, q.QuickMetalSet());
		}
		return all;
	}

	/*
	 * Inputs: List of material names
	 * Outputs: Gem, Shard, Plate, Dust, Impure Dust, Purified Dust for all given materials
	 * If you want anything less than that, use QuickItemSet::QuickGemSet(materialName, booleans...)
	 */
	public static Item[] allGemsGeneric(String... materials)
	{
		Item[] all = new Item[] {};
		for (String material : materials)
		{
			QuickItemSet q = new QuickItemSet(material, true, true, true, true, true, true, true, true);
			all = ArrayUtils.addAll(all, q.QuickGemSet());
		}
		return all;
	}

	/*
	 * Inputs: List of material names
	 * Outputs: Ore and Block for all given materials
	 * If you want only one or the other, use QuickItemSet::QuickBlockSet(materialName, booleans...)
	 */
	public static Block[] allBlocksGeneric(String... materials)
	{
		Block[] all = new Block[] {};
		for (String material : materials)
		{
			QuickItemSet q = new QuickItemSet(material, true, true, true, true, true, true, true, true);
			all = ArrayUtils.addAll(all, q.QuickBlockSet());
		}
		return all;
	}
}