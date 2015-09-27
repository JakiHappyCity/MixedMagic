package mm.network.proxy;

import cpw.mods.fml.common.network.IGuiHandler;
import mm.common.MMBlocks.ContainerLPulverizer;
import mm.common.MMTile.TileEntityLPulverizer;
import mm.core.MMCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class MMServer implements IGuiHandler {
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	public void registerRenderInformation() {
		
	}
	
}
