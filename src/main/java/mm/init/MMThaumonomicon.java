package mm.init;

import java.util.ArrayList;
import java.util.HashMap;

import mm.core.MMCore;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.IArcaneRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.common.config.ConfigBlocks;

/**
 * @author fankar
 */



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
        
        new ResearchItem("CRYSTALPOWER", "MIXEDMAGIC",
        new AspectList(), 0, 0, 0,
        new ItemStack(MMItems.crystalPower))
        .setPages(new ResearchPage(("mm.research_page_CRYSTALPOWER.1")),new ResearchPage((CrucibleRecipe)recipes.get("crystalPower")))
        .setRound()
        .setAutoUnlock()
        .registerResearchItem();
        
        CrucibleRecipe[] cBlocks = new CrucibleRecipe[7];
		
		for(int i = 0; i < 7; ++i)
			if(i < 6)
				cBlocks[i] = new CrucibleRecipe("TB.CrystalBlocks",new ItemStack(MMBlocks.crystalBlock,1,i),new ItemStack(ConfigBlocks.blockCrystal,1,i),new AspectList().add(primals(1)).add(Aspect.EARTH, 2).add(getPrimalForLoop(i), 2));
			else
				cBlocks[i] = new CrucibleRecipe("TB.CrystalBlocks",new ItemStack(MMBlocks.crystalBlock,1,i),new ItemStack(ConfigBlocks.blockCrystal,1,i),new AspectList().add(primals(1)).add(Aspect.EARTH, 2).add(primals(1)));
		

		CrucibleRecipe[] cTaintedBlocks = new CrucibleRecipe[7];
		
		for(int i = 0; i < 7; ++i)
			if(i < 6)
				cTaintedBlocks[i] = new CrucibleRecipe("TB.CrystalBlocks",new ItemStack(MMBlocks.crystalBlock,1,7),new ItemStack(ConfigBlocks.blockCrystal,1,i),new AspectList().add(primals(1)).add(Aspect.EARTH, 2).add(getPrimalForLoop(i), 2).add(Aspect.TAINT, 2));
			else
				cTaintedBlocks[i] = new CrucibleRecipe("TB.CrystalBlocks",new ItemStack(MMBlocks.crystalBlock,1,7),new ItemStack(ConfigBlocks.blockCrystal,1,i),new AspectList().add(primals(1)).add(Aspect.EARTH, 2).add(primals(1)).add(Aspect.TAINT, 2));
		
		new ResearchItem(
		"WISPERSEEDS", catName,
		new AspectList().add(Aspect.PLANT, 4).add(Aspect.CROP, 4).add(Aspect.CLOTH, 4), 0, -4, 3,
		new ItemStack(MMBlocks.wisperPlant)
		)
		.setParents("AURILIUM")
		.setPages(new ResearchPage("mm.research_page_WISPERSEEDS"), new ResearchPage((CrucibleRecipe)recipes.get("wisperPlant")))
		.registerResearchItem();
		
		new ResearchItem("AURILIUM",catName,
		new AspectList().add(primals(8)), -1, -3, 3,
		new ItemStack(MMBlocks.crystalBlock,1,OreDictionary.WILDCARD_VALUE))
		.setParents("CRYSTALPOWER")
		.setPages(new ResearchPage("mm.research_page_AURILIUM.1"),new ResearchPage(cBlocks),new ResearchPage(cTaintedBlocks))
		.registerResearchItem();
	}
	
	public static Aspect getPrimalForLoop(int loopInt)
	{
		switch(loopInt)
		{
			case 0:
				return Aspect.AIR;
			case 1:
				return Aspect.FIRE;
			case 2:
				return Aspect.WATER;
			case 3:
				return Aspect.EARTH;
			case 4:
				return Aspect.ORDER;
			case 5:
				return Aspect.ENTROPY;
			default:
				return Aspect.AIR;
		}
	}
	
	public static AspectList primals(int amount)
	{
		return new AspectList().add(Aspect.AIR, amount).add(Aspect.WATER, amount).add(Aspect.EARTH, amount).add(Aspect.FIRE, amount).add(Aspect.ORDER, amount).add(Aspect.ENTROPY, amount);
	}
}

/**
 * @author azanor
 * ConfigBlocks
 * ConfigAspects
 * ConfigResearch
 * ConfigItems
 * **/