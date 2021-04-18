
package net.mcreator.cheifshalobasedmod.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.cheifshalobasedmod.creativetab.TabChiefsHaloBasedMod;
import net.mcreator.cheifshalobasedmod.ElementsCheifsHaloBasedMod;

@ElementsCheifsHaloBasedMod.ModElement.Tag
public class BlockReinforcedGlass extends ElementsCheifsHaloBasedMod.ModElement {
	@GameRegistry.ObjectHolder("cheifshalobasedmod:reinforcedglass")
	public static final Block block = null;
	public BlockReinforcedGlass(ElementsCheifsHaloBasedMod instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("reinforcedglass"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("cheifshalobasedmod:reinforcedglass", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.GLASS);
			setUnlocalizedName("reinforcedglass");
			setSoundType(SoundType.GLASS);
			setHarvestLevel("pickaxe", 1);
			setHardness(10F);
			setResistance(25F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabChiefsHaloBasedMod.tab);
		}
	}
}
