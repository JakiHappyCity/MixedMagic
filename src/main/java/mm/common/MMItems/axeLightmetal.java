package mm.common.MMItems;

import mm.core.MMCore;
import mm.init.MMItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class axeLightmetal extends ItemAxe {

	public axeLightmetal(String string, ToolMaterial lIGHTMETAL) {
		super(MMItems.LIGHTMETAL);
		this.setUnlocalizedName("axeLightmetal").setTextureName("mixedmagic:axeLightmetal").setCreativeTab(MMCore.tabMM);
	}

}
