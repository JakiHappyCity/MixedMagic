package mm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ConfigItems;

public class MMRecipes
{
	
	public MMRecipes() {  }
	
	public static void setup()
	{
		
		//Crucible Recipes
		MMThaumonomicon.recipes.put("ilmetal", ThaumcraftApi.addCrucibleRecipe("ILMETAL", new ItemStack(MMItems.itemlightmetalingot, 1, 0), new ItemStack(Items.iron_ingot), (new AspectList()).merge(Aspect.ORDER, 4).merge(Aspect.LIGHT, 4)));
	    MMThaumonomicon.recipes.put("idmetal", ThaumcraftApi.addCrucibleRecipe("IDMETAL", new ItemStack(MMItems.ingotDarkmetal, 1, 0), new ItemStack(Items.iron_ingot), (new AspectList()).merge(Aspect.DARKNESS, 8).merge(Aspect.ENTROPY, 16)));
		
		//Infusion Recipes
	    MMThaumonomicon.recipes.put("pickaxe", ThaumcraftApi.addInfusionCraftingRecipe("ILMTOOLS", new ItemStack(MMItems.pickLightmetal), 1, (new AspectList()).add(Aspect.ORDER, 32).add(Aspect.TOOL, 4).add(Aspect.LIGHT, 64), new ItemStack(ConfigItems.itemPickThaumium), new ItemStack[]{new ItemStack(MMItems.itemlightmetalingot), new ItemStack(MMItems.itemlightmetalingot), new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 0)}));
	    MMThaumonomicon.recipes.put("sword", ThaumcraftApi.addInfusionCraftingRecipe("ILMTOOLS", new ItemStack(MMItems.swordLightmetal), 1, (new AspectList()).add(Aspect.ORDER, 32).add(Aspect.WEAPON, 8).add(Aspect.LIGHT, 64), new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack[]{new ItemStack(MMItems.itemlightmetalingot), new ItemStack(MMItems.itemlightmetalingot), new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 0)}));
	    MMThaumonomicon.recipes.put("axe", ThaumcraftApi.addInfusionCraftingRecipe("ILMTOOLS", new ItemStack(MMItems.axeLightmetal), 1, (new AspectList()).add(Aspect.ORDER, 32).add(Aspect.TREE, 32).add(Aspect.LIGHT, 64), new ItemStack(ConfigItems.itemAxeThaumium), new ItemStack[]{new ItemStack(MMItems.itemlightmetalingot), new ItemStack(MMItems.itemlightmetalingot), new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 0)}));
	    //MMThaumonomicon.recipes.put("ilmhead", ThaumcraftApi.addInfusionCraftingRecipe("ILMARMOR", new ItemStack(MMItems.pickLightmetal), 1, (new AspectList()).add(Aspect.ORDER, 32).add(Aspect.TOOL, 4).add(Aspect.LIGHT, 64), new ItemStack(ConfigItems.itemPickThaumium), new ItemStack[]{new ItemStack(MMItems.itemlightmetalingot), new ItemStack(MMItems.itemlightmetalingot), new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 0)}));
	    //MMThaumonomicon.recipes.put("ilmchest", ThaumcraftApi.addInfusionCraftingRecipe("ILMARMOR", new ItemStack(MMItems.pickLightmetal), 1, (new AspectList()).add(Aspect.ORDER, 32).add(Aspect.TOOL, 4).add(Aspect.LIGHT, 64), new ItemStack(ConfigItems.itemPickThaumium), new ItemStack[]{new ItemStack(MMItems.itemlightmetalingot), new ItemStack(MMItems.itemlightmetalingot), new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 0)}));
	    //MMThaumonomicon.recipes.put("ilmleg", ThaumcraftApi.addInfusionCraftingRecipe("ILMARMOR", new ItemStack(MMItems.pickLightmetal), 1, (new AspectList()).add(Aspect.ORDER, 32).add(Aspect.TOOL, 4).add(Aspect.LIGHT, 64), new ItemStack(ConfigItems.itemPickThaumium), new ItemStack[]{new ItemStack(MMItems.itemlightmetalingot), new ItemStack(MMItems.itemlightmetalingot), new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 0)}));
	    //MMThaumonomicon.recipes.put("ilmboots", ThaumcraftApi.addInfusionCraftingRecipe("ILMARMOR", new ItemStack(MMItems.pickLightmetal), 1, (new AspectList()).add(Aspect.ORDER, 32).add(Aspect.TOOL, 4).add(Aspect.LIGHT, 64), new ItemStack(ConfigItems.itemPickThaumium), new ItemStack[]{new ItemStack(MMItems.itemlightmetalingot), new ItemStack(MMItems.itemlightmetalingot), new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 0)}));
	    
	    //Recipes
	    
	    
	    //Research Page Recipes
	    MMThaumonomicon.recipes.put("ilmblock", GameRegistry.addShapedRecipe(new ItemStack(MMBlocks.blockLightmetal, 1), new Object[]{"LLL", "LLL", "LLL", Character.valueOf('L'), MMItems.itemlightmetalingot}));
	    
	}
	
}
