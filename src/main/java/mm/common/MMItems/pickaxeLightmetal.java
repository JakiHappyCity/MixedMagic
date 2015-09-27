package mm.common.MMItems;

import mm.core.MMCore;
import mm.init.MMItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class pickaxeLightmetal extends ItemPickaxe
{

	public pickaxeLightmetal(String string, ToolMaterial lIGHTMETAL) {
		super(MMItems.LIGHTMETAL);
		this.setUnlocalizedName("pickaxeLightmetal").setTextureName("mixedmagic:pickaxeLightmetal").setCreativeTab(MMCore.tabMM);
	}
	
}
