package mm.common.MMBlocks;

import mm.common.MMTile.TileEntityAsalium;
import mm.core.MMCore;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class blockAsalium extends BlockContainer  {
	
	public blockAsalium() {
		super(Material.rock);
		this.setBlockName("asalium");
		this.setCreativeTab(MMCore.tabMM);
		this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.75F, 0.75F);
		this.setHardness(5.0F);
		this.setHarvestLevel("pickaxe", 1);
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
		return new TileEntityAsalium();
	}
	
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        IInventory inv = (IInventory)world.getTileEntity(x, y, z);
        ItemStack current_is = player.getCurrentEquippedItem();
        if (inv != null && current_is != null) {
            for (int i = 0; i < inv.getSizeInventory(); ++i) {
                if (inv.getStackInSlot(i) == null) {
                    inv.setInventorySlotContents(i, current_is);
                    current_is = null;
                    return true;
                }
            }
        }
        return super.onBlockActivated(world, x, y, z, player, side, hitX, hitY, hitZ);
    }
	
}
