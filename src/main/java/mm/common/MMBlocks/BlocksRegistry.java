package mm.common.MMBlocks;

import java.util.Hashtable;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import mm.core.MMCore;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import tv.twitch.Core;

public class BlocksRegistry {
	public static Hashtable<Block,String> blocksList = new Hashtable<Block, String>();
	
	public static void registerBlock(Block b, String name, Class<?> modClass, Class<? extends ItemBlock> blockClass)
	{
		if(blockClass == null)
		{
			GameRegistry.registerBlock(b, name);
		}else
		{
			GameRegistry.registerBlock(b, blockClass, name);
		}
		Side s = FMLCommonHandler.instance().getEffectiveSide();
		if(s == Side.CLIENT)
		{
			b.setCreativeTab(MMCore.tabMM);
			blocksList.put(b, MMCore.tabMM.getTabLabel());
		}
	}
}
