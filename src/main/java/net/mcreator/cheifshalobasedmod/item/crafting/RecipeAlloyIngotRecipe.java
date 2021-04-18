
package net.mcreator.cheifshalobasedmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.cheifshalobasedmod.item.ItemMjonirAlloyPowder;
import net.mcreator.cheifshalobasedmod.item.ItemAlloyIngot;
import net.mcreator.cheifshalobasedmod.ElementsCheifsHaloBasedMod;

@ElementsCheifsHaloBasedMod.ModElement.Tag
public class RecipeAlloyIngotRecipe extends ElementsCheifsHaloBasedMod.ModElement {
	public RecipeAlloyIngotRecipe(ElementsCheifsHaloBasedMod instance) {
		super(instance, 26);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemMjonirAlloyPowder.block, (int) (1)), new ItemStack(ItemAlloyIngot.block, (int) (1)), 1F);
	}
}
