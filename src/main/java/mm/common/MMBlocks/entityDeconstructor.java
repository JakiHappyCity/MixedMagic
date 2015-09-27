package mm.common.MMBlocks;

import mm.common.MMTile.TileEntityEntityDeconstructor;
import mm.core.MMCore;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class entityDeconstructor extends BlockContainer{

	 public entityDeconstructor() {
	  super(Material.rock);
	  this.setBlockName("entityDeconstructor");
	  this.setCreativeTab(MMCore.tabMM);
	  this.setBlockBounds(0F, 0F, 0F, 1F, 0.0625F, 1F);
	 }
	 
	//minX, Y, Z; maxX, Y, Z
	 
	 public int getRenderType() {
	  return -1;
	 }
	 
	 public boolean isOpaqueCube() {
	  return false;
	 }
	 
	 public boolean renderAsNormalBlock() 
	    { 
	        return false; 
	    } 
	 @Override
	 public TileEntity createNewTileEntity(World var1, int var2) {
	  return new TileEntityEntityDeconstructor();
	 }
	 
}