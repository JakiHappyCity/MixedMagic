package mm.network.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class MMClient extends MMServer {
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		return null;
	}
	
	public void registerRenderInformation()
	{
		
	}
	
}
