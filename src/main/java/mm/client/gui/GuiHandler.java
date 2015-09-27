package mm.client.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import mm.common.MMBlocks.ContainerLPulverizer;
import mm.common.MMTile.TileEntityLPulverizer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {
	
    public static final int guiIDLPulverizer = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case guiIDLPulverizer:
				if (entity instanceof TileEntityLPulverizer) {
					return new GuiLPulverizer(player.inventory, (TileEntityLPulverizer) entity);
				}
    	return null;
			}
		}
		return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case guiIDLPulverizer:
				if (entity instanceof TileEntityLPulverizer) {
					return new GuiLPulverizer(player.inventory, (TileEntityLPulverizer) entity);
				}
    	return null;
			}
		}
		return null;
    }
    
}