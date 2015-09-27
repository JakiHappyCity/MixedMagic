package mm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import mm.common.MMBlocks.LightPulverizerIdle;
import mm.common.MMBlocks.blockAsalium;
import mm.common.MMBlocks.blockLightmetal;
import mm.common.MMBlocks.entityDeconstructor;
import mm.core.MMCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MMBlocks {
	
	public static Block blockLightmetal;
	public static Block entityDeconstructor;
	public static Block blockAsalium;
	public static Block LightPulverizerIdle;
	public static Block LightPulverizerActive;
	
	public static void setup()
	{
		
		//Blocks
		GameRegistry.registerBlock(blockLightmetal = new blockLightmetal(), "blockLightmetal");
		
		//Block Containers
		GameRegistry.registerBlock(entityDeconstructor = new entityDeconstructor(), "entityDeconstructor");
		GameRegistry.registerBlock(blockAsalium = new blockAsalium(), "blockAsalium");
		
		//Machines
		LightPulverizerIdle = new LightPulverizerIdle(false).setBlockName("LPulverizerIdle").setCreativeTab(MMCore.tabMM);
		LightPulverizerActive = new LightPulverizerIdle(true).setBlockName("LPulverizerActive").setLightLevel(0.625F);
		
		GameRegistry.registerBlock(LightPulverizerIdle, "LPulverizerIdle");
		GameRegistry.registerBlock(LightPulverizerActive, "LPulverizerActive");
		
	}
	
}
