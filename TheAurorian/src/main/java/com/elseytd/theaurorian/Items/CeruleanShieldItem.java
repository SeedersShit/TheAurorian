package com.elseytd.theaurorian.Items;

import com.elseytd.theaurorian.Registry.ItemRegistry;
import com.elseytd.theaurorian.AurorianMod;
import net.minecraft.item.ItemStack;

public class CeruleanShieldItem extends ShieldItem {

	public static final String ITEMNAME = "ceruleanshield";

	public CeruleanShieldItem() {
		super();
		this.setCreativeTab(AurorianMod.CREATIVE_TAB);
		this.setRegistryName(ITEMNAME);
		this.setUnlocalizedName(AurorianMod.MODID + "." + ITEMNAME);
		this.setMaxDamage(512);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == ItemRegistry.Registry.INGOTCERULEAN.getItem() || super.getIsRepairable(toRepair, repair);
	}

}
