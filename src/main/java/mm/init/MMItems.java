package mm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import mm.common.MMItems.axeLightmetal;
import mm.common.MMItems.ingotDarkmetal;
import mm.common.MMItems.itemLightmetalIngot;
import mm.common.MMItems.pickaxeLightmetal;
import mm.common.MMItems.swordLightmetal;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MMItems {
	
	//Tool Materials
	public static ToolMaterial LIGHTMETAL = EnumHelper.addToolMaterial("LIGHTMETAL", 3, 450, 13.0F, 4.5F, 18);
	
	//Items
	public static Item itemlightmetalingot;
	public static Item pickLightmetal;
	public static Item swordLightmetal;
	public static Item axeLightmetal;
	public static Item ingotDarkmetal;
	
	public static void setup()
	{
		GameRegistry.registerItem(ingotDarkmetal = new ingotDarkmetal(), "itemDarkmetalIngot");
		GameRegistry.registerItem(itemlightmetalingot = new itemLightmetalIngot(), "itemLighmetalIngot");
		GameRegistry.registerItem(pickLightmetal = new pickaxeLightmetal("lightmetal_pickaxe", LIGHTMETAL), "lightmetal_pickaxe");
		GameRegistry.registerItem(swordLightmetal = new swordLightmetal("lightmetal_sword", LIGHTMETAL), "lightmetal_sword");
		GameRegistry.registerItem(axeLightmetal = new axeLightmetal("lightmetal_axe", LIGHTMETAL), "lightmetal_axe");
	}
	
}
