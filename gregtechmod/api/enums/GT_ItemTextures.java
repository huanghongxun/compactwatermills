package gregtechmod.api.enums;

import gregtechmod.api.GregTech_API;
import gregtechmod.api.interfaces.IIconContainer;
import gregtechmod.api.util.GT_Config;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class GT_ItemTextures implements Runnable {
	public GT_ItemTextures() {
		GregTech_API.sGTItemIconload.add(this);
	}
	
	@Override
	public void run() {
		for (MetaIcons tIcon : MetaIcons.values()) {
			tIcon.mIcon		= ((IconRegister)GregTech_API.sItemIcons).registerIcon(GregTech_API.TEXTURE_PATH_ITEM + (GT_Config.system?"troll":"iconsets/" + tIcon));
			tIcon.mOverlay	= ((IconRegister)GregTech_API.sItemIcons).registerIcon(GregTech_API.TEXTURE_PATH_ITEM + (GT_Config.system?"troll":"iconsets/" + tIcon + "_OVERLAY"));
		}
	}
	
	public enum MetaIcons implements IIconContainer {
		  INGOT_METALLIC, INGOT_SHINY, INGOT_DULL, INGOT_LEAF
		, INGOT_HOT
		, INGOT_DOUBLE_METALLIC, INGOT_DOUBLE_SHINY, INGOT_DOUBLE_DULL, INGOT_DOUBLE_LEAF
		, INGOT_TRIPLE_METALLIC, INGOT_TRIPLE_SHINY, INGOT_TRIPLE_DULL, INGOT_TRIPLE_LEAF
		, INGOT_QUADRUPLE_METALLIC, INGOT_QUADRUPLE_SHINY, INGOT_QUADRUPLE_DULL, INGOT_QUADRUPLE_LEAF
		, INGOT_QUINTUPLE_METALLIC, INGOT_QUINTUPLE_SHINY, INGOT_QUINTUPLE_DULL, INGOT_QUINTUPLE_LEAF
		, PLATE_METALLIC, PLATE_SHINY, PLATE_DULL, PLATE_LEAF, PLATE_LAPIS, PLATE_WOOD, PLATE_PAPER
		, PLATE_DOUBLE_METALLIC, PLATE_DOUBLE_SHINY, PLATE_DOUBLE_DULL, PLATE_DOUBLE_LEAF, PLATE_DOUBLE_LAPIS, PLATE_DOUBLE_WOOD, PLATE_DOUBLE_PAPER
		, PLATE_TRIPLE_METALLIC, PLATE_TRIPLE_SHINY, PLATE_TRIPLE_DULL, PLATE_TRIPLE_LEAF, PLATE_TRIPLE_LAPIS, PLATE_TRIPLE_WOOD, PLATE_TRIPLE_PAPER
		, PLATE_QUADRUPLE_METALLIC, PLATE_QUADRUPLE_SHINY, PLATE_QUADRUPLE_DULL, PLATE_QUADRUPLE_LEAF, PLATE_QUADRUPLE_LAPIS, PLATE_QUADRUPLE_WOOD, PLATE_QUADRUPLE_PAPER
		, PLATE_QUINTUPLE_METALLIC, PLATE_QUINTUPLE_SHINY, PLATE_QUINTUPLE_DULL, PLATE_QUINTUPLE_LEAF, PLATE_QUINTUPLE_LAPIS, PLATE_QUINTUPLE_WOOD, PLATE_QUINTUPLE_PAPER
		, PLATE_DENSE_METALLIC, PLATE_DENSE_SHINY, PLATE_DENSE_DULL, PLATE_DENSE_LEAF, PLATE_DENSE_LAPIS, PLATE_DENSE_WOOD, PLATE_DENSE_PAPER
		, ROD_METALLIC, ROD_SHINY, ROD_DULL
		, NUGGET_METALLIC, NUGGET_SHINY, NUGGET_DULL, NUGGET_LEAF
		, GEM_METALLIC, GEM_OPAL, GEM_FLINT, GEM_RUBY, GEM_SMALL, GEM_ROUND, GEM_SQUARE, GEM_OCTAGON, GEM_QUARTZ, GEM_LAPIS, GEM_NETHERSTAR, GEM_DIAMOND, GEM_EMERALD, GEM_RECTANGLE_VERTICAL, GEM_RECTANGLE_HORIZONTAL
		, DUST_METALLIC, DUST_SHINY, DUST_ROUGH, DUST_FINE, DUST_DULL, DUST_POWDER
		, DUST_IMPURE_METALLIC, DUST_IMPURE_SHINY, DUST_IMPURE_ROUGH, DUST_IMPURE_FINE, DUST_IMPURE_DULL, DUST_IMPURE_POWDER
		, DUST_PURE_METALLIC, DUST_PURE_SHINY, DUST_PURE_ROUGH, DUST_PURE_FINE, DUST_PURE_DULL, DUST_PURE_POWDER
		, DUST_SMALL_METALLIC, DUST_SMALL_SHINY, DUST_SMALL_ROUGH, DUST_SMALL_FINE, DUST_SMALL_DULL, DUST_SMALL_POWDER
		, DUST_TINY_METALLIC, DUST_TINY_SHINY, DUST_TINY_ROUGH, DUST_TINY_FINE, DUST_TINY_DULL, DUST_TINY_POWDER
		, CRUSHED
		, PURIFIED
		, CENTRIFUGED
		, LENS
		, ROUND
		, BOLT
		, SCREW
		, RING
		, CELL, CELL_EMPTY, CELL_PLASMA
		, TOOLHEAD_SWORD
		, TOOLHEAD_PICKAXE
		, TOOLHEAD_SHOVEL
		, TOOLHEAD_AXE
		, TOOLHEAD_HOE
		, TOOLHEAD_HAMMER
		, TOOLHEAD_FILE
		, TOOLHEAD_SAW
		;
		
		protected Icon mIcon, mOverlay;
		
		@Override public Icon getIcon() {return mIcon;}
		@Override public Icon getOverlayIcon() {return mOverlay;}
		@Override public int getOverlayX() {return 0;}
		@Override public int getOverlayY() {return 0;}
		@Override public int getOverlayWidth() {return 16;}
		@Override public int getOverlayHeight() {return 16;}
	}
	
	public static final IIconContainer[] SET_LAPIS = new IIconContainer[] {
		MetaIcons.DUST_TINY_FINE,
		MetaIcons.DUST_SMALL_FINE,
		MetaIcons.DUST_FINE,
		MetaIcons.DUST_IMPURE_FINE,
		MetaIcons.DUST_PURE_FINE,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_LAPIS,
		MetaIcons.NUGGET_DULL,
		null,
		MetaIcons.INGOT_DULL,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_DULL,
		MetaIcons.INGOT_TRIPLE_DULL,
		MetaIcons.INGOT_QUADRUPLE_DULL,
		MetaIcons.INGOT_QUINTUPLE_DULL,
		MetaIcons.PLATE_LAPIS,
		MetaIcons.PLATE_DOUBLE_LAPIS,
		MetaIcons.PLATE_TRIPLE_LAPIS,
		MetaIcons.PLATE_QUADRUPLE_LAPIS,
		MetaIcons.PLATE_QUINTUPLE_LAPIS,
		MetaIcons.PLATE_DENSE_LAPIS,
		MetaIcons.ROD_DULL,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_QUARTZ = new IIconContainer[] {
		MetaIcons.DUST_TINY_FINE,
		MetaIcons.DUST_SMALL_FINE,
		MetaIcons.DUST_FINE,
		MetaIcons.DUST_IMPURE_FINE,
		MetaIcons.DUST_PURE_FINE,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_QUARTZ,
		MetaIcons.NUGGET_DULL,
		null,
		MetaIcons.INGOT_DULL,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_DULL,
		MetaIcons.INGOT_TRIPLE_DULL,
		MetaIcons.INGOT_QUADRUPLE_DULL,
		MetaIcons.INGOT_QUINTUPLE_DULL,
		MetaIcons.PLATE_LAPIS,
		MetaIcons.PLATE_DOUBLE_LAPIS,
		MetaIcons.PLATE_TRIPLE_LAPIS,
		MetaIcons.PLATE_QUADRUPLE_LAPIS,
		MetaIcons.PLATE_QUINTUPLE_LAPIS,
		MetaIcons.PLATE_DENSE_LAPIS,
		MetaIcons.ROD_DULL,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_POWDER = new IIconContainer[] {
		MetaIcons.DUST_TINY_POWDER,
		MetaIcons.DUST_SMALL_POWDER,
		MetaIcons.DUST_POWDER,
		MetaIcons.DUST_IMPURE_POWDER,
		MetaIcons.DUST_PURE_POWDER,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_METALLIC,
		MetaIcons.NUGGET_DULL,
		null,
		MetaIcons.INGOT_DULL,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_DULL,
		MetaIcons.INGOT_TRIPLE_DULL,
		MetaIcons.INGOT_QUADRUPLE_DULL,
		MetaIcons.INGOT_QUINTUPLE_DULL,
		MetaIcons.PLATE_LAPIS,
		MetaIcons.PLATE_DOUBLE_LAPIS,
		MetaIcons.PLATE_TRIPLE_LAPIS,
		MetaIcons.PLATE_QUADRUPLE_LAPIS,
		MetaIcons.PLATE_QUINTUPLE_LAPIS,
		MetaIcons.PLATE_DENSE_LAPIS,
		MetaIcons.ROD_DULL,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_FINE = new IIconContainer[] {
		MetaIcons.DUST_TINY_FINE,
		MetaIcons.DUST_SMALL_FINE,
		MetaIcons.DUST_FINE,
		MetaIcons.DUST_IMPURE_FINE,
		MetaIcons.DUST_PURE_FINE,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_METALLIC,
		MetaIcons.NUGGET_DULL,
		null,
		MetaIcons.INGOT_DULL,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_DULL,
		MetaIcons.INGOT_TRIPLE_DULL,
		MetaIcons.INGOT_QUADRUPLE_DULL,
		MetaIcons.INGOT_QUINTUPLE_DULL,
		MetaIcons.PLATE_LAPIS,
		MetaIcons.PLATE_DOUBLE_LAPIS,
		MetaIcons.PLATE_TRIPLE_LAPIS,
		MetaIcons.PLATE_QUADRUPLE_LAPIS,
		MetaIcons.PLATE_QUINTUPLE_LAPIS,
		MetaIcons.PLATE_DENSE_LAPIS,
		MetaIcons.ROD_DULL,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_ROUGH = new IIconContainer[] {
		MetaIcons.DUST_TINY_ROUGH,
		MetaIcons.DUST_SMALL_ROUGH,
		MetaIcons.DUST_ROUGH,
		MetaIcons.DUST_IMPURE_ROUGH,
		MetaIcons.DUST_PURE_ROUGH,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_METALLIC,
		MetaIcons.NUGGET_DULL,
		null,
		MetaIcons.INGOT_DULL,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_DULL,
		MetaIcons.INGOT_TRIPLE_DULL,
		MetaIcons.INGOT_QUADRUPLE_DULL,
		MetaIcons.INGOT_QUINTUPLE_DULL,
		MetaIcons.PLATE_LAPIS,
		MetaIcons.PLATE_DOUBLE_LAPIS,
		MetaIcons.PLATE_TRIPLE_LAPIS,
		MetaIcons.PLATE_QUADRUPLE_LAPIS,
		MetaIcons.PLATE_QUINTUPLE_LAPIS,
		MetaIcons.PLATE_DENSE_LAPIS,
		MetaIcons.ROD_DULL,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_METALLIC = new IIconContainer[] {
		MetaIcons.DUST_TINY_METALLIC,
		MetaIcons.DUST_SMALL_METALLIC,
		MetaIcons.DUST_METALLIC,
		MetaIcons.DUST_IMPURE_METALLIC,
		MetaIcons.DUST_PURE_METALLIC,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_METALLIC,
		MetaIcons.NUGGET_METALLIC,
		null,
		MetaIcons.INGOT_METALLIC,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_METALLIC,
		MetaIcons.INGOT_TRIPLE_METALLIC,
		MetaIcons.INGOT_QUADRUPLE_METALLIC,
		MetaIcons.INGOT_QUINTUPLE_METALLIC,
		MetaIcons.PLATE_METALLIC,
		MetaIcons.PLATE_DOUBLE_METALLIC,
		MetaIcons.PLATE_TRIPLE_METALLIC,
		MetaIcons.PLATE_QUADRUPLE_METALLIC,
		MetaIcons.PLATE_QUINTUPLE_METALLIC,
		MetaIcons.PLATE_DENSE_METALLIC,
		MetaIcons.ROD_METALLIC,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_FLINT = new IIconContainer[] {
		MetaIcons.DUST_TINY_ROUGH,
		MetaIcons.DUST_SMALL_ROUGH,
		MetaIcons.DUST_ROUGH,
		MetaIcons.DUST_IMPURE_ROUGH,
		MetaIcons.DUST_PURE_ROUGH,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_FLINT,
		MetaIcons.NUGGET_DULL,
		null,
		MetaIcons.INGOT_DULL,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_DULL,
		MetaIcons.INGOT_TRIPLE_DULL,
		MetaIcons.INGOT_QUADRUPLE_DULL,
		MetaIcons.INGOT_QUINTUPLE_DULL,
		MetaIcons.PLATE_DULL,
		MetaIcons.PLATE_DOUBLE_DULL,
		MetaIcons.PLATE_TRIPLE_DULL,
		MetaIcons.PLATE_QUADRUPLE_DULL,
		MetaIcons.PLATE_QUINTUPLE_DULL,
		MetaIcons.PLATE_DENSE_DULL,
		MetaIcons.ROD_DULL,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_DIAMOND = new IIconContainer[] {
		MetaIcons.DUST_TINY_SHINY,
		MetaIcons.DUST_SMALL_SHINY,
		MetaIcons.DUST_SHINY,
		MetaIcons.DUST_IMPURE_SHINY,
		MetaIcons.DUST_PURE_SHINY,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_DIAMOND,
		MetaIcons.NUGGET_SHINY,
		null,
		MetaIcons.INGOT_SHINY,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_SHINY,
		MetaIcons.INGOT_TRIPLE_SHINY,
		MetaIcons.INGOT_QUADRUPLE_SHINY,
		MetaIcons.INGOT_QUINTUPLE_SHINY,
		MetaIcons.PLATE_SHINY,
		MetaIcons.PLATE_DOUBLE_SHINY,
		MetaIcons.PLATE_TRIPLE_SHINY,
		MetaIcons.PLATE_QUADRUPLE_SHINY,
		MetaIcons.PLATE_QUINTUPLE_SHINY,
		MetaIcons.PLATE_DENSE_SHINY,
		MetaIcons.ROD_SHINY,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_OPAL = new IIconContainer[] {
		MetaIcons.DUST_TINY_SHINY,
		MetaIcons.DUST_SMALL_SHINY,
		MetaIcons.DUST_SHINY,
		MetaIcons.DUST_IMPURE_SHINY,
		MetaIcons.DUST_PURE_SHINY,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_OPAL,
		MetaIcons.NUGGET_SHINY,
		null,
		MetaIcons.INGOT_SHINY,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_SHINY,
		MetaIcons.INGOT_TRIPLE_SHINY,
		MetaIcons.INGOT_QUADRUPLE_SHINY,
		MetaIcons.INGOT_QUINTUPLE_SHINY,
		MetaIcons.PLATE_SHINY,
		MetaIcons.PLATE_DOUBLE_SHINY,
		MetaIcons.PLATE_TRIPLE_SHINY,
		MetaIcons.PLATE_QUADRUPLE_SHINY,
		MetaIcons.PLATE_QUINTUPLE_SHINY,
		MetaIcons.PLATE_DENSE_SHINY,
		MetaIcons.ROD_SHINY,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_RUBY = new IIconContainer[] {
		MetaIcons.DUST_TINY_SHINY,
		MetaIcons.DUST_SMALL_SHINY,
		MetaIcons.DUST_SHINY,
		MetaIcons.DUST_IMPURE_SHINY,
		MetaIcons.DUST_PURE_SHINY,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_RUBY,
		MetaIcons.NUGGET_SHINY,
		null,
		MetaIcons.INGOT_SHINY,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_SHINY,
		MetaIcons.INGOT_TRIPLE_SHINY,
		MetaIcons.INGOT_QUADRUPLE_SHINY,
		MetaIcons.INGOT_QUINTUPLE_SHINY,
		MetaIcons.PLATE_SHINY,
		MetaIcons.PLATE_DOUBLE_SHINY,
		MetaIcons.PLATE_TRIPLE_SHINY,
		MetaIcons.PLATE_QUADRUPLE_SHINY,
		MetaIcons.PLATE_QUINTUPLE_SHINY,
		MetaIcons.PLATE_DENSE_SHINY,
		MetaIcons.ROD_SHINY,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_GEM_HORIZONTAL = new IIconContainer[] {
		MetaIcons.DUST_TINY_SHINY,
		MetaIcons.DUST_SMALL_SHINY,
		MetaIcons.DUST_SHINY,
		MetaIcons.DUST_IMPURE_SHINY,
		MetaIcons.DUST_PURE_SHINY,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_RECTANGLE_HORIZONTAL,
		MetaIcons.NUGGET_SHINY,
		null,
		MetaIcons.INGOT_SHINY,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_SHINY,
		MetaIcons.INGOT_TRIPLE_SHINY,
		MetaIcons.INGOT_QUADRUPLE_SHINY,
		MetaIcons.INGOT_QUINTUPLE_SHINY,
		MetaIcons.PLATE_SHINY,
		MetaIcons.PLATE_DOUBLE_SHINY,
		MetaIcons.PLATE_TRIPLE_SHINY,
		MetaIcons.PLATE_QUADRUPLE_SHINY,
		MetaIcons.PLATE_QUINTUPLE_SHINY,
		MetaIcons.PLATE_DENSE_SHINY,
		MetaIcons.ROD_SHINY,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_GEM_VERTICAL = new IIconContainer[] {
		MetaIcons.DUST_TINY_SHINY,
		MetaIcons.DUST_SMALL_SHINY,
		MetaIcons.DUST_SHINY,
		MetaIcons.DUST_IMPURE_SHINY,
		MetaIcons.DUST_PURE_SHINY,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_RECTANGLE_VERTICAL,
		MetaIcons.NUGGET_SHINY,
		null,
		MetaIcons.INGOT_SHINY,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_SHINY,
		MetaIcons.INGOT_TRIPLE_SHINY,
		MetaIcons.INGOT_QUADRUPLE_SHINY,
		MetaIcons.INGOT_QUINTUPLE_SHINY,
		MetaIcons.PLATE_SHINY,
		MetaIcons.PLATE_DOUBLE_SHINY,
		MetaIcons.PLATE_TRIPLE_SHINY,
		MetaIcons.PLATE_QUADRUPLE_SHINY,
		MetaIcons.PLATE_QUINTUPLE_SHINY,
		MetaIcons.PLATE_DENSE_SHINY,
		MetaIcons.ROD_SHINY,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_NETHERSTAR = new IIconContainer[] {
		MetaIcons.DUST_TINY_SHINY,
		MetaIcons.DUST_SMALL_SHINY,
		MetaIcons.DUST_SHINY,
		MetaIcons.DUST_IMPURE_SHINY,
		MetaIcons.DUST_PURE_SHINY,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_NETHERSTAR,
		MetaIcons.NUGGET_SHINY,
		null,
		MetaIcons.INGOT_SHINY,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_SHINY,
		MetaIcons.INGOT_TRIPLE_SHINY,
		MetaIcons.INGOT_QUADRUPLE_SHINY,
		MetaIcons.INGOT_QUINTUPLE_SHINY,
		MetaIcons.PLATE_SHINY,
		MetaIcons.PLATE_DOUBLE_SHINY,
		MetaIcons.PLATE_TRIPLE_SHINY,
		MetaIcons.PLATE_QUADRUPLE_SHINY,
		MetaIcons.PLATE_QUINTUPLE_SHINY,
		MetaIcons.PLATE_DENSE_SHINY,
		MetaIcons.ROD_SHINY,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_EMERALD = new IIconContainer[] {
		MetaIcons.DUST_TINY_SHINY,
		MetaIcons.DUST_SMALL_SHINY,
		MetaIcons.DUST_SHINY,
		MetaIcons.DUST_IMPURE_SHINY,
		MetaIcons.DUST_PURE_SHINY,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_EMERALD,
		MetaIcons.NUGGET_SHINY,
		null,
		MetaIcons.INGOT_SHINY,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_SHINY,
		MetaIcons.INGOT_TRIPLE_SHINY,
		MetaIcons.INGOT_QUADRUPLE_SHINY,
		MetaIcons.INGOT_QUINTUPLE_SHINY,
		MetaIcons.PLATE_SHINY,
		MetaIcons.PLATE_DOUBLE_SHINY,
		MetaIcons.PLATE_TRIPLE_SHINY,
		MetaIcons.PLATE_QUADRUPLE_SHINY,
		MetaIcons.PLATE_QUINTUPLE_SHINY,
		MetaIcons.PLATE_DENSE_SHINY,
		MetaIcons.ROD_SHINY,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_SHINY = new IIconContainer[] {
		MetaIcons.DUST_TINY_SHINY,
		MetaIcons.DUST_SMALL_SHINY,
		MetaIcons.DUST_SHINY,
		MetaIcons.DUST_IMPURE_SHINY,
		MetaIcons.DUST_PURE_SHINY,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_METALLIC,
		MetaIcons.NUGGET_SHINY,
		null,
		MetaIcons.INGOT_SHINY,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_SHINY,
		MetaIcons.INGOT_TRIPLE_SHINY,
		MetaIcons.INGOT_QUADRUPLE_SHINY,
		MetaIcons.INGOT_QUINTUPLE_SHINY,
		MetaIcons.PLATE_SHINY,
		MetaIcons.PLATE_DOUBLE_SHINY,
		MetaIcons.PLATE_TRIPLE_SHINY,
		MetaIcons.PLATE_QUADRUPLE_SHINY,
		MetaIcons.PLATE_QUINTUPLE_SHINY,
		MetaIcons.PLATE_DENSE_SHINY,
		MetaIcons.ROD_SHINY,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_DULL = new IIconContainer[] {
		MetaIcons.DUST_TINY_DULL,
		MetaIcons.DUST_SMALL_DULL,
		MetaIcons.DUST_DULL,
		MetaIcons.DUST_IMPURE_DULL,
		MetaIcons.DUST_PURE_DULL,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_METALLIC,
		MetaIcons.NUGGET_DULL,
		null,
		MetaIcons.INGOT_DULL,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_DULL,
		MetaIcons.INGOT_TRIPLE_DULL,
		MetaIcons.INGOT_QUADRUPLE_DULL,
		MetaIcons.INGOT_QUINTUPLE_DULL,
		MetaIcons.PLATE_DULL,
		MetaIcons.PLATE_DOUBLE_DULL,
		MetaIcons.PLATE_TRIPLE_DULL,
		MetaIcons.PLATE_QUADRUPLE_DULL,
		MetaIcons.PLATE_QUINTUPLE_DULL,
		MetaIcons.PLATE_DENSE_DULL,
		MetaIcons.ROD_DULL,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_PAPER = new IIconContainer[] {
		MetaIcons.DUST_TINY_FINE,
		MetaIcons.DUST_SMALL_FINE,
		MetaIcons.DUST_FINE,
		MetaIcons.DUST_IMPURE_FINE,
		MetaIcons.DUST_PURE_FINE,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_METALLIC,
		MetaIcons.NUGGET_LEAF,
		null,
		MetaIcons.INGOT_DULL,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_DULL,
		MetaIcons.INGOT_TRIPLE_DULL,
		MetaIcons.INGOT_QUADRUPLE_DULL,
		MetaIcons.INGOT_QUINTUPLE_DULL,
		MetaIcons.PLATE_PAPER,
		MetaIcons.PLATE_DOUBLE_PAPER,
		MetaIcons.PLATE_TRIPLE_PAPER,
		MetaIcons.PLATE_QUADRUPLE_PAPER,
		MetaIcons.PLATE_QUINTUPLE_PAPER,
		MetaIcons.PLATE_DENSE_PAPER,
		MetaIcons.ROD_DULL,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_WOOD = new IIconContainer[] {
		MetaIcons.DUST_TINY_FINE,
		MetaIcons.DUST_SMALL_FINE,
		MetaIcons.DUST_FINE,
		MetaIcons.DUST_IMPURE_FINE,
		MetaIcons.DUST_PURE_FINE,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_METALLIC,
		MetaIcons.NUGGET_LEAF,
		null,
		MetaIcons.INGOT_DULL,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_DULL,
		MetaIcons.INGOT_TRIPLE_DULL,
		MetaIcons.INGOT_QUADRUPLE_DULL,
		MetaIcons.INGOT_QUINTUPLE_DULL,
		MetaIcons.PLATE_WOOD,
		MetaIcons.PLATE_DOUBLE_WOOD,
		MetaIcons.PLATE_TRIPLE_WOOD,
		MetaIcons.PLATE_QUADRUPLE_WOOD,
		MetaIcons.PLATE_QUINTUPLE_WOOD,
		MetaIcons.PLATE_DENSE_WOOD,
		MetaIcons.ROD_DULL,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_LEAF = new IIconContainer[] {
		MetaIcons.DUST_TINY_FINE,
		MetaIcons.DUST_SMALL_FINE,
		MetaIcons.DUST_FINE,
		MetaIcons.DUST_IMPURE_FINE,
		MetaIcons.DUST_PURE_FINE,
		MetaIcons.CRUSHED,
		MetaIcons.PURIFIED,
		MetaIcons.CENTRIFUGED,
		MetaIcons.GEM_METALLIC,
		MetaIcons.NUGGET_LEAF,
		null,
		MetaIcons.INGOT_LEAF,
		MetaIcons.INGOT_HOT,
		MetaIcons.INGOT_DOUBLE_LEAF,
		MetaIcons.INGOT_TRIPLE_LEAF,
		MetaIcons.INGOT_QUADRUPLE_LEAF,
		MetaIcons.INGOT_QUINTUPLE_LEAF,
		MetaIcons.PLATE_LEAF,
		MetaIcons.PLATE_DOUBLE_LEAF,
		MetaIcons.PLATE_TRIPLE_LEAF,
		MetaIcons.PLATE_QUADRUPLE_LEAF,
		MetaIcons.PLATE_QUINTUPLE_LEAF,
		MetaIcons.PLATE_DENSE_LEAF,
		MetaIcons.ROD_DULL,
		MetaIcons.LENS,
		MetaIcons.ROUND,
		MetaIcons.BOLT,
		MetaIcons.SCREW,
		MetaIcons.RING,
		null,
		MetaIcons.CELL,
		MetaIcons.CELL_PLASMA,
		MetaIcons.TOOLHEAD_SWORD,
		MetaIcons.TOOLHEAD_PICKAXE,
		MetaIcons.TOOLHEAD_SHOVEL,
		MetaIcons.TOOLHEAD_AXE,
		MetaIcons.TOOLHEAD_HOE,
		MetaIcons.TOOLHEAD_HAMMER,
		MetaIcons.TOOLHEAD_FILE,
		MetaIcons.TOOLHEAD_SAW,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_EMPTY = new IIconContainer[] {
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		MetaIcons.CELL_EMPTY,
		MetaIcons.CELL_EMPTY,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	
	public static final IIconContainer[] SET_NONE = SET_DULL;
	public static final IIconContainer[] SET_FLUID = SET_DULL;
}