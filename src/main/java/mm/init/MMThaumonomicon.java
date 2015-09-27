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
		ThaumcraftApi.addWarpToResearch("IDMETAL", 12);
		
		ResearchCategories.registerCategory(catName, icon, back);
        
        ArrayList<CrucibleRecipe> cruc = new ArrayList();
        for (int a = 0; a < 6; a++) {
          cruc.add((CrucibleRecipe)recipes.get("BalancedShard_" + a));
        }
        
        new ResearchItem("LORE", "MIXEDMAGIC", new AspectList(), 0, 0, 0, new ItemStack(ConfigBlocks.blockMetalDevice, 1, 0)).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.LORE.1"), new ResearchPage("tc.research_page.LORE.2")}).setRound().setAutoUnlock().setSecondary().registerResearchItem();
        
        new ResearchItem("ILMETAL", "MIXEDMAGIC",
        new AspectList().add(Aspect.LIGHT, 2).add(Aspect.ORDER, 2), 2, 0, 2,
        new ItemStack(MMItems.itemlightmetalingot))
        .setPages(new ResearchPage(("mm.research_page_ILMETAL.1")),new ResearchPage((CrucibleRecipe)recipes.get("ilmetal")), new ResearchPage((IRecipe)recipes.get("ilmblock")))
        .setParents(new String[]{"LORE"})
        .setStub()
        .registerResearchItem();
        
        new ResearchItem("ILMTOOLS", "MIXEDMAGIC",
        new AspectList().add(Aspect.LIGHT, 1).add(Aspect.ORDER, 1).add(Aspect.MINE, 1).add(Aspect.TOOL, 1), 4, -1, 2,
        new ItemStack(MMItems.swordLightmetal))
        .setPages(new ResearchPage(("mm.research_page_ILMTOOLS.1")),new ResearchPage((InfusionRecipe)recipes.get("sword")),new ResearchPage((InfusionRecipe)recipes.get("pickaxe")),new ResearchPage((InfusionRecipe)recipes.get("axe")))
        .setParents(new String[]{"INFUSION", "ILMETAL"})
        .setStub()
        .registerResearchItem();
        
        new ResearchItem("IDMETAL", "MIXEDMAGIC",
        new AspectList().add(Aspect.DARKNESS, 1).add(Aspect.ENTROPY, 1).add(Aspect.DEATH, 1).add(Aspect.POISON, 1).add(Aspect.VOID, 1), -2, 0, 3,
        new ItemStack(MMItems.ingotDarkmetal))
        .setPages(new ResearchPage(("mm.research_page_IDMETAL.1")),new ResearchPage((CrucibleRecipe)recipes.get("idmetal")))
        .setParents(new String[]{"LORE"})
        .setStub()
        .registerResearchItem();
        
        
	}
	
}
