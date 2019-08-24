package com.github.halotroop2288.materialsplus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.halotroop2288.materialsplus.init.MaterialList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("materialsplus")
public class MaterialsPlus
{
	/*	List of duplicate minerals - Rename these in your language file, be that in your mod or your resource pack, but not in the code.
	 *	Adamantite = Adamantium
	 * 	Bauxite = Aluminum = Aluminium
	 * 	Nikkolite = Niccolite = Nickel
	 * 	Galena = Lead
	 * 	Chrome = Chromite = Chromium
	 */
	
	public static MaterialsPlus instance;
	public static final String modID = "materialsplus";
	public static final String namespace = modID + ":";
	private static final Logger logger = LogManager.getLogger(modID);
	
	public MaterialsPlus()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		logger.debug("Setup method registered.");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event)
	{
		// Put registry events above
		logger.debug("clientRegistries method registered.");
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegsitryEvents
	{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event)
		{
			event.getRegistry().registerAll
			(
				MaterialList.allItems()
			);
			
			logger.debug("MaterialsPlus items registered");
		}

		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event)
		{
			event.getRegistry().registerAll
			(
				MaterialList.allBlocks()
			);
			
			logger.debug("MaterialsPlus items registered");
		}
	}
}