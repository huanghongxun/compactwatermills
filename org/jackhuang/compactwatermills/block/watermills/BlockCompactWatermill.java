/*******************************************************************************
 * Copyright (c) 2013 Aroma1997.
 * All rights reserved. This program and other files related to this program are
 * licensed with a extended GNU General Public License v. 3
 * License informations are at:
 * https://github.com/Aroma1997/CompactWindmills/blob/master/license.txt
 ******************************************************************************/

package org.jackhuang.compactwatermills.block.watermills;

import java.util.logging.Level;

import org.jackhuang.compactwatermills.InternalName;
import org.jackhuang.compactwatermills.block.BlockMultiID;
import org.jackhuang.compactwatermills.helpers.LogHelper;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.Configuration;

/**
 * 
 * @author Aroma1997
 * 
 */
public class BlockCompactWatermill extends BlockMultiID {
	
	public BlockCompactWatermill(Configuration config, InternalName name) {
		super(config, name, Material.iron, ItemCompactWaterMill.class);		
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}
	
	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return WaterType.makeTileEntity(metadata);
	}
	
	@Override
	protected String getTextureFolder(int index) {
		return "watermill";
	}
	
	public int getFacing(IBlockAccess iBlockAccess, int x, int y, int z) {
		TileEntity tileEntity = iBlockAccess.getBlockTileEntity(x, y, z);
		
		if (tileEntity instanceof TileEntityWatermill) {
			return ((TileEntityWatermill) tileEntity).getFacing();
		}
		
		LogHelper.log(Level.WARNING, "Failed to get Facing at: x=" + x + "; y=" + y + "; z=" + z
			+ ";");
		
		return 4;
	}
}
