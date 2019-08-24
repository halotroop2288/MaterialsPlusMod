package com.github.halotroop2288.materialsplus.items;

import com.github.halotroop2288.materialsplus.MaterialsPlus;
import com.github.halotroop2288.materialsplus.blocks.LayeredBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class QuickItemSet
{
	private static final String ns = MaterialsPlus.namespace;
	private String	name;
	
	private Item	ingot,	nugget;
	private Item	gem,	shard;
	private Item	plate,	dust,	impure_dust, purified_dust;
	private boolean genRaw, genBrokenDown, genPlate, genDust, genPurifiedDust, genImpureDust;
	private Block 	ore, block;
	private boolean	genBlock, genOre;
	
	public QuickItemSet(String name, boolean genBlock, boolean genOre, boolean genRaw, boolean genBrokenDown, boolean genPlate, boolean genDust, boolean genImpureDust, boolean genPurifiedDust)
	{
		this.name = name.toLowerCase();
		this.genBlock = genBlock;
		this.genBrokenDown = genBrokenDown;
		this.genDust = genDust;
		this.genImpureDust = genImpureDust;
		this.genPlate = genPlate;
		this.genPurifiedDust = genPurifiedDust;
		this.genRaw = genRaw;
		this.genOre = genOre;
	}
	
	private void MakeDerivatives()
	{
		plate			=	new QuickMiscItem().setRegistryName(ns + name + "_plate");
		dust			=	new QuickMiscItem().setRegistryName(ns + name + "_dust");
		impure_dust		=	new QuickMiscItem().setRegistryName(ns + "impure_" + name + "_dust");
		purified_dust	=	new QuickMiscItem().setRegistryName(ns + "purified_" + name + "_dust");
	}

	/*
	 * Generates a customize-able set of items for a metal / alloy material.
	 */
	public Item[] QuickMetalSet()
	{
		ingot			=	new QuickMiscItem().setRegistryName(ns + name + "_ingot");
		nugget			=	new QuickMiscItem().setRegistryName(ns + name + "_nugget");
		MakeDerivatives();

		return new Item[]
			{
				this.genRaw ?			(Item) ingot : (Item) null,
				this.genBrokenDown ?	(Item) nugget : (Item) null,
				this.genPlate ? 		(Item) plate : (Item) null,
				this.genDust ? 			(Item) dust : (Item) null,
				this.genImpureDust ? 	(Item) impure_dust : (Item) null,
				this.genPurifiedDust ? 	(Item) purified_dust : null
			};
	}
	
	/*
	 * Generates a customize-able set of items for a gem material.
	 */
	public Item[] QuickGemSet()
	{
		gem				=	new QuickMiscItem().setRegistryName(ns + name + "_gem");
		shard			=	new QuickMiscItem().setRegistryName(ns + name + "_shard");
		
		MakeDerivatives();
		return new Item[]
			{
				this.genRaw ?			(Item) gem : 			(Item) null,
				this.genBrokenDown ?	(Item) shard : 			(Item) null,
				this.genPlate ? 		(Item) plate : 			(Item) null,
				this.genDust ? 			(Item) dust : 			(Item) null,
				this.genImpureDust ? 	(Item) impure_dust : 	(Item) null,
				this.genPurifiedDust ? 	(Item) purified_dust :	(Item) null
			};
	}
	
	/*
	 * Input: Storage block's material, hardness, resistance, and sound type. Light value, and harvest level for both.
	 * If you want it any more fine-tuned than that, you can just do it the ol' fashioned way.
	 * Harvest tool always defaults to pickaxe.
	 */
	public Block[] QuickBlockSet(Material material, float hardness, float resistance, SoundType soundType, int lightValue, int harvestLevel)
	{
		ore				=	new LayeredBlock(Material.ROCK, 2.0F, 3.0F, 0, SoundType.STONE, name + "_ore", harvestLevel, ToolType.PICKAXE).setRegistryName(ns + name + "_ore"); 
		block			=	new Block(Block.Properties.create(material).hardnessAndResistance(hardness, resistance).lightValue(lightValue).sound(soundType).harvestTool(ToolType.PICKAXE)).setRegistryName(ns + name + "_block");

		return new Block[]
			{
				this.genBlock ?	(Block)	block : (Block) null,
				this.genOre ?	(Block)	ore : 	(Block) null
			};
	}
	
	/*
	 * Same as the one that takes inputs, but this one defaults to these values instead
	 * Storage Block Material: Iron
	 * Storage Block Sound Type: Metal
	 * Harvest Level: 1
	 * Hardness: 2
	 * Resistance: 3
	 */
	public Block[] QuickBlockSet()
	{
		ore				=	new LayeredBlock(Material.ROCK, 2.0F, 3.0F, 0, SoundType.STONE, name + "_ore", 1, ToolType.PICKAXE).setRegistryName(ns + name + "_ore");
		block			=	new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).lightValue(0).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(ns + name + "_block");
		
		return new Block[]
			{
				this.genBlock ?	(Block)	block : (Block) null,
				this.genOre ?	(Block)	ore : 	(Block)null
			};
	}
}
