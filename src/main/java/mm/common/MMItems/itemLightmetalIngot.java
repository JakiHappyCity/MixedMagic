package mm.common.MMItems;

import mm.core.MMCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemLightmetalIngot extends Item {
	
	public itemLightmetalIngot()
	{
		super();
		{
			this.setUnlocalizedName("itemLightmetalIngot");
			this.setTextureName("mixedmagic:itemLightmetalIngot");
			this.setCreativeTab(MMCore.tabMM);
		}
	}
	
}


