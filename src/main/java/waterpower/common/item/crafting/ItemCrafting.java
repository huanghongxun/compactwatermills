/**
 * Copyright (c) Huang Yuhui, 2014
 * 
 * "WaterCraft" is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */

package waterpower.common.item.crafting;

import java.awt.Color;
import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import waterpower.client.render.IIconContainer;
import waterpower.client.render.RecolorableTextures;
import waterpower.common.item.ItemRecolorable;

public class ItemCrafting extends ItemRecolorable {

    public static ItemCrafting instance;

    public ItemCrafting() {
        super("crafting");
        setHasSubtypes(true);
        //
        instance = this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getTextureFolder() {
        return "crafting";
    }

    @Override
    public String getItemStackDisplayName(ItemStack par1ItemStack) {
        int meta = par1ItemStack.getItemDamage();
        int craftingType = meta / CraftingTypes.space;
        int levelType = meta % CraftingTypes.space;
        String temp = "cptwtrml.crafting." + LevelTypes.values()[levelType].name() + CraftingTypes.values()[craftingType].name();
        String temp2 = I18n.format(temp);
        if (temp2.equals(temp))
            return LevelTypes.values()[levelType].getShowedName() + " " + CraftingTypes.values()[craftingType].getShowedName();
        else
            return temp2;
    }

    @Override
    public boolean stopScanning(ItemStack stack) {
        return false;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        try {
            int meta = itemstack.getItemDamage();
            int craftingType = meta / CraftingTypes.space;
            int levelType = meta % CraftingTypes.space;
            return "item." + "watermill." + CraftingTypes.values()[craftingType].name() + "." + LevelTypes.values()[levelType].name();
        } catch (Exception e) {
            return null;
        }
    }

    public static ItemStack get(CraftingTypes craftingTypes, LevelTypes levelTypes) {
        return new ItemStack(instance, 1, craftingTypes.ind() + levelTypes.ordinal());
    }

	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemstack(ItemStack stack, int tintIndex) {
        int meta = stack.getItemDamage();
        int levelType = meta % CraftingTypes.space;
        LevelTypes type = LevelTypes.values()[levelType];
        return new Color(type.R, type.G, type.B, type.A).getRGB();
	}

    @Override
    public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
        for (CraftingTypes c : CraftingTypes.values())
            for (LevelTypes l : LevelTypes.values())
                par3List.add(get(c, l));
    }

	@SideOnly(Side.CLIENT)
    public IIconContainer getIconContainer(int meta, LevelTypes type) {
        return getIconContainers()[meta / CraftingTypes.space];
    }

    @Override
	@SideOnly(Side.CLIENT)
    public IIconContainer getIconContainer(ItemStack stk) {
    	int meta = stk.getItemDamage();
        return getIconContainer(meta, LevelTypes.values()[meta % CraftingTypes.space]);
    }

    @Override
	@SideOnly(Side.CLIENT)
    public IIconContainer[] getIconContainers() {
        return RecolorableTextures.CRAFTING;
    }

    public void registerOre() {
        OreDictionary.registerOre("circuitBasic", get(CraftingTypes.circuit, LevelTypes.MK1));
        OreDictionary.registerOre("circuitAdvanced", get(CraftingTypes.circuit, LevelTypes.MK3));
        OreDictionary.registerOre("circuitElite", get(CraftingTypes.circuit, LevelTypes.MK5));
        OreDictionary.registerOre("circuitUltimate", get(CraftingTypes.circuit, LevelTypes.MK7));
    }

}