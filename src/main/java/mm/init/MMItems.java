package mm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import mm.common.MMItems.SimpleItem;
import mm.core.MMCore;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MMItems {
	
	public static Item crystalPower;
	
	public static void setup()
	{
		//Items
		crystalPower = new SimpleItem().setUnlocalizedName("crystalPower").setTextureName("mixedmagic:crystalPower.png").setCreativeTab(MMCore.tabMM);
		
		//GameRegistry
		GameRegistry.registerItem(crystalPower, "crystalPower");
		
		//Ore Dictionary
		OreDictionary.registerOre("crystalPower", new ItemStack(crystalPower));
	}
	
}
