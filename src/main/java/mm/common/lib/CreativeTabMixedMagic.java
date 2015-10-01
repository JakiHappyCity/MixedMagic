package mm.common.lib;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mm.core.MMCore;
import mm.init.MMItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import thaumcraft.common.config.ConfigItems;

public class CreativeTabMixedMagic extends CreativeTabs {

	public CreativeTabMixedMagic(int par1, String par2str) {
		super(par1, par2str);
	}
	
	public boolean hasSearchBar()
    {
        return getTabIndex() == MMCore.tabMM.getTabIndex();
    }
	
    public int getSearchbarWidth()
    {
        return 89;
    }
    
    
    
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return ConfigItems.itemAmuletRunic;
	}

}
