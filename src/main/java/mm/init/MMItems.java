package mm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import mm.common.MMItems.SimpleItem;
import mm.core.MMCore;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MMItems {
	
	public static Item crystalPower;
	public static Item shardKnowledge;
	
	public static void setup()
	{
		//Items
		crystalPower = new SimpleItem().setUnlocalizedName("crystalPower").setTextureName("mixedmagic:crystalPower.png").setCreativeTab(MMCore.tabMM);
		shardKnowledge = new SimpleItem().setUnlocalizedName("shardKnowledge").setTextureName("mixedmagic:shardKnowledge.png").setCreativeTab(MMCore.tabMM);
		
		//Items with GUI
		GameRegistry.registerItem(crystalPower, "crystalPower");
		GameRegistry.registerItem(shardKnowledge, "shardKnowledge");
	}
	
}
