package mm.network.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import mm.client.gui.GuiHandler;
import mm.client.render.entity.RenderAsalium;
import mm.client.render.entity.RenderEntityDeconstructor;
import mm.common.MMTile.TileEntityAsalium;
import mm.common.MMTile.TileEntityEntityDeconstructor;
import mm.common.MMTile.TileEntityLPulverizer;
import mm.core.MMCore;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class MMClient extends MMServer {
	
	public void init(FMLInitializationEvent event) {
	    NetworkRegistry.INSTANCE.registerGuiHandler(MMCore.instance, new GuiHandler());
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		return null;
	}
	
	public void registerRenderInformation()
	{
		   TileEntitySpecialRenderer renderEntDecon = new RenderEntityDeconstructor();
		   ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEntityDeconstructor.class, renderEntDecon);
		   TileEntitySpecialRenderer renderAsalium = new RenderAsalium();
		   ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAsalium.class, renderAsalium);
	}
	
}
