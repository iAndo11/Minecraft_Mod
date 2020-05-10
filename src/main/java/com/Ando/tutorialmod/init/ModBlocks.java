package com.Ando.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.Ando.tutorialmod.blocks.BlockBase;
import com.Ando.tutorialmod.blocks.CopperOre;
import com.Ando.tutorialmod.blocks.LeadOre;
import com.Ando.tutorialmod.blocks.TinOre;
import com.Ando.tutorialmod.blocks.TitaniumOre;
import com.Ando.tutorialmod.blocks.ZincOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);
	public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK);
	public static final Block LEAD_ORE = new LeadOre("lead_ore", Material.ROCK);
	public static final Block TIN_ORE = new TinOre("tin_ore", Material.ROCK);
	public static final Block TITANIUM_ORE = new TitaniumOre("titanium_ore", Material.ROCK);
	public static final Block ZINC_ORE = new ZincOre("zinc_ore", Material.ROCK);
}
