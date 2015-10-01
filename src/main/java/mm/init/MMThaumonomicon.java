package mm.init;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cpw.mods.fml.common.Loader;
import mm.core.MMCore;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.IArcaneRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.api.research.ResearchPage.PageType;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.config.ConfigResearch;
import thaumcraft.api.crafting.CrucibleRecipe;

public class MMThaumonomicon {
	public static HashMap recipes = new HashMap();
	
	public static final ResourceLocation icon = new ResourceLocation(MMCore.modid, "textures/thaumonomicon/magic.png");
	public static final ResourceLocation back = new ResourceLocation(MMCore.modid, "textures/thaumonomicon/background.png");
	public static final String catName = "MIXEDMAGIC";
	
	public static void setup()
	{
		ResearchCategories.registerCategory(catName, icon, back);
		
        ArrayList<CrucibleRecipe> cruc = new ArrayList();
        for (int a = 0; a < 6; a++) {
        	cruc.add((CrucibleRecipe)recipes.get("BalancedShard_" + a));
        }
        
        /*new ResearchItem("CRYSTALPOWER", catName,
        new AspectList().add(Aspect.LIGHT, 2).add(Aspect.ORDER, 2), 2, 0, 2,
        new ItemStack(MMItems.powerCrystal))
        .setPages(new ResearchPage(("mm.research_page_ILMETAL.1")),new ResearchPage((CrucibleRecipe)recipes.get("ilmetal")))
        .setConcealed()
        .registerResearchItem();
		*/
	}
	
	public static final Aspect ARCHEOLOGY = new Aspect("archeology",0x460c00, new Aspect[] {Aspect.ENTROPY, Aspect.EARTH});
	
}
