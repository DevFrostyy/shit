
package net.mcreator.cheifshalobasedmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.cheifshalobasedmod.creativetab.TabChiefsHaloBasedMod;
import net.mcreator.cheifshalobasedmod.ElementsCheifsHaloBasedMod;

@ElementsCheifsHaloBasedMod.ModElement.Tag
public class ItemChiefsArmor extends ElementsCheifsHaloBasedMod.ModElement {
	@GameRegistry.ObjectHolder("cheifshalobasedmod:chiefsarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("cheifshalobasedmod:chiefsarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("cheifshalobasedmod:chiefsarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("cheifshalobasedmod:chiefsarmorboots")
	public static final Item boots = null;
	public ItemChiefsArmor(ElementsCheifsHaloBasedMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CHIEFSARMOR", "cheifshalobasedmod:chief_", 400, new int[]{300, 300, 300, 300}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.anvil.place")), 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("chiefsarmorhelmet")
				.setRegistryName("chiefsarmorhelmet").setCreativeTab(TabChiefsHaloBasedMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("chiefsarmorbody")
				.setRegistryName("chiefsarmorbody").setCreativeTab(TabChiefsHaloBasedMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("chiefsarmorlegs")
				.setRegistryName("chiefsarmorlegs").setCreativeTab(TabChiefsHaloBasedMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("chiefsarmorboots")
				.setRegistryName("chiefsarmorboots").setCreativeTab(TabChiefsHaloBasedMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("cheifshalobasedmod:chiefsarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("cheifshalobasedmod:chiefsarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("cheifshalobasedmod:chiefsarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("cheifshalobasedmod:chiefsarmorboots", "inventory"));
	}
}
