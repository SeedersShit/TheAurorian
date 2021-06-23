package com.elseytd.theaurorian.Items;

import com.elseytd.theaurorian.TAItems;
import com.elseytd.theaurorian.TAMod;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Enchantments;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class TAItem_Armor_Spiked extends ItemArmor {

	public TAItem_Armor_Spiked(EntityEquipmentSlot equipmentSlotIn, String name) {
		super(TAItems.Materials.SPIKED_ARMOR, 0, equipmentSlotIn);
		this.setRegistryName(name);
		this.setUnlocalizedName(TAMod.MODID + "." + name);
		this.setCreativeTab(TAMod.CREATIVE_TAB);
		this.setMaxStackSize(1);
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entityIn, EntityEquipmentSlot slot, String layer) {
		return TAMod.MODID + ":textures/armor/spikedchestplate.png";
	}

	@Override
	public net.minecraftforge.common.IRarity getForgeRarity(ItemStack stack) {
		return EnumRarity.EPIC;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (!GuiScreen.isShiftKeyDown()) {
			tooltip.add(TextFormatting.ITALIC + I18n.format("string.theaurorian.tooltip.shiftinfo") + TextFormatting.RESET);
		} else {
			tooltip.add(I18n.format("string.theaurorian.tooltip.spikedchestplate"));
		}
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (entityIn.isSneaking() && entityIn instanceof EntityLivingBase) {
			for (ItemStack s : entityIn.getArmorInventoryList()) {
				if (s.getItem() instanceof TAItem_Armor_Spiked) {
					EntityLivingBase ent = (EntityLivingBase) entityIn;
					ent.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 10));
					stack.addEnchantment(Enchantments.THORNS, 3);
					return;
				}
			}
		} else if (entityIn instanceof EntityLivingBase) {
			Map<Enchantment, Integer> ench = EnchantmentHelper.getEnchantments(stack);
			ench.remove(Enchantments.THORNS);
			EnchantmentHelper.setEnchantments(ench, stack);
		}
	}
}
