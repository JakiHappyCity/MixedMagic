package mm.common.MMItems;

import mm.core.MMCore;
import mm.init.MMItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class swordLightmetal extends ItemSword {

	public swordLightmetal(String string, ToolMaterial lIGHTMETAL) {
		super(MMItems.LIGHTMETAL);
		this.setUnlocalizedName("swordLightmetal").setTextureName("mixedmagic:swordLightmetal").setCreativeTab(MMCore.tabMM);
	}

}
