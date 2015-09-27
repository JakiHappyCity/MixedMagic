package mm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import mm.common.MMTile.TileEntityAsalium;
import mm.common.MMTile.TileEntityEntityDeconstructor;
import mm.common.MMTile.TileEntityLPulverizer;

public class MMTileEntity {
		
	public static void setup()
	{
		
		GameRegistry.registerTileEntity(TileEntityEntityDeconstructor.class, "tileentity_entitydeconstructor");
		GameRegistry.registerTileEntity(TileEntityAsalium.class, "tileentity_asalium");
		GameRegistry.registerTileEntity(TileEntityLPulverizer.class, "tileentity_lpulver");
		
	}
	
}
