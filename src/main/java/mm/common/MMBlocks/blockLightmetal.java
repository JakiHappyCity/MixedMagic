package mm.common.MMBlocks;

import mm.core.MMCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockLightmetal extends Block {
	
	public blockLightmetal()
	{
		
		super(Material.iron);
		this.setHardness(15.0F).setBlockTextureName("mixedmagic:blockLightmetal").setBlockName("blockLightmetal").setCreativeTab(MMCore.tabMM).setHarvestLevel("pickaxe", 1);
		
	}
	
}
