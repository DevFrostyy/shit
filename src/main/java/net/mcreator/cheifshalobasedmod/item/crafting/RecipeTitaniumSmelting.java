
package net.mcreator.cheifshalobasedmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.cheifshalobasedmod.item.ItemTitaniumIngot;
import net.mcreator.cheifshalobasedmod.block.BlockTitaniumOre;
import net.mcreator.cheifshalobasedmod.ElementsCheifsHaloBasedMod;

@ElementsCheifsHaloBasedMod.ModElement.Tag
public class RecipeTitaniumSmelting extends ElementsCheifsHaloBasedMod.ModElement {
	public RecipeTitaniumSmelting(ElementsCheifsHaloBasedMod instance) {
		super(instance, 28);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTitaniumOre.block, (int) (1)), new ItemStack(ItemTitaniumIngot.block, (int) (1)), 1F);
	}
}
