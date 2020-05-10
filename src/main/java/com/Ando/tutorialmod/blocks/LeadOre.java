package com.Ando.tutorialmod.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class LeadOre extends BlockBase
{
	public LeadOre(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
	// if you want your ore to drop an item
	/*@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return //items
	}
	
	public int quantityDropped(Random rand)
	{
		int max = 4 // max amount of the item that can drop from single ore
		int min = 1 // min amount of the item that can drop from a single ore
		
		return rand.nextInt(max) + min;
	}*/
}