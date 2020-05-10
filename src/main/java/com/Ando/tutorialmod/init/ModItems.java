package com.Ando.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.Ando.tutorialmod.Items.ItemBase;
import com.Ando.tutorialmod.Items.tools.ToolAxe;
import com.Ando.tutorialmod.Items.tools.ToolHoe;
import com.Ando.tutorialmod.Items.tools.ToolPickaxe;
import com.Ando.tutorialmod.Items.tools.ToolSpade;
import com.Ando.tutorialmod.Items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Materials
	public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 2, 200, 5.0F, 1.5F, 10);
	
	// Items
	public static final Item COPPER = new ItemBase("copper");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	
	// Copper Tools
	public static final ItemSword COPPER_SWORD = new ToolSword("copper_sword", MATERIAL_COPPER);
	public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
	public static final ItemSpade COPPER_SHOVEL = new ToolSpade("copper_shovel", MATERIAL_COPPER);
	public static final ItemAxe COPPER_AXE = new ToolAxe("copper_axe", MATERIAL_COPPER);
	public static final ItemHoe COPPER_HOE = new ToolHoe("copper_hoe", MATERIAL_COPPER);
}
