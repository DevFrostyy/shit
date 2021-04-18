
package net.mcreator.cheifshalobasedmod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.cheifshalobasedmod.item.ItemChiefsArmor;
import net.mcreator.cheifshalobasedmod.ElementsCheifsHaloBasedMod;

@ElementsCheifsHaloBasedMod.ModElement.Tag
public class TabChiefsHaloBasedMod extends ElementsCheifsHaloBasedMod.ModElement {
	public TabChiefsHaloBasedMod(ElementsCheifsHaloBasedMod instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabchiefshalobasedmod") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemChiefsArmor.helmet, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
