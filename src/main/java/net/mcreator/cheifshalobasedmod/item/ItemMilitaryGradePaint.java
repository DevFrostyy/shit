
package net.mcreator.cheifshalobasedmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.cheifshalobasedmod.creativetab.TabChiefsHaloBasedMod;
import net.mcreator.cheifshalobasedmod.ElementsCheifsHaloBasedMod;

@ElementsCheifsHaloBasedMod.ModElement.Tag
public class ItemMilitaryGradePaint extends ElementsCheifsHaloBasedMod.ModElement {
	@GameRegistry.ObjectHolder("cheifshalobasedmod:militarygradepaint")
	public static final Item block = null;
	public ItemMilitaryGradePaint(ElementsCheifsHaloBasedMod instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("cheifshalobasedmod:militarygradepaint", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setUnlocalizedName("militarygradepaint");
			setRegistryName("militarygradepaint");
			setCreativeTab(TabChiefsHaloBasedMod.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
