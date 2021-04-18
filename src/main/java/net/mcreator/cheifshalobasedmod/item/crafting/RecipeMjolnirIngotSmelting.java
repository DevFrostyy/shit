
package net.mcreator.cheifshalobasedmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.cheifshalobasedmod.item.ItemMjolnirIngot;
import net.mcreator.cheifshalobasedmod.block.BlockMjonirOre;
import net.mcreator.cheifshalobasedmod.ElementsCheifsHaloBasedMod;

@ElementsCheifsHaloBasedMod.ModElement.Tag
public class RecipeMjolnirIngotSmelting extends ElementsCheifsHaloBasedMod.ModElement {
	public RecipeMjolnirIngotSmelting(ElementsCheifsHaloBasedMod instance) {
		super(instance, 27);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMjonirOre.block, (int) (1)), new ItemStack(ItemMjolnirIngot.block, (int) (1)), 1F);
	}
}
