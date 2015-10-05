package mm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.common.config.ConfigAspects;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;

public class MMRecipes
{
	public MMRecipes()
	{
		
	}
	
	public static void setup()
	{
		/**
		 * @param CrucibleRecipe
		 */
		MMThaumonomicon.recipes.put("crystalPower", ThaumcraftApi.addCrucibleRecipe("CRYSTALPOWER", new ItemStack(MMItems.crystalPower, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 5), (new AspectList()).merge(Aspect.ENERGY, 8).merge(Aspect.AURA, 8).merge(Aspect.CRYSTAL, 8)));	
		MMThaumonomicon.recipes.put("wisperPlant", ThaumcraftApi.addCrucibleRecipe("WISPERSEEDS", new ItemStack(MMBlocks.wisperPlant,  1,  0), new ItemStack(Blocks.deadbush, 1, OreDictionary.WILDCARD_VALUE), (new AspectList()).merge(Aspect.CROP, 4).merge(Aspect.PLANT, 4).merge(Aspect.CLOTH, 4)));
		/**
		 * @param IArcaneRecipe
		 */
		MMThaumonomicon.recipes.put("aurilium", ThaumcraftApi.addArcaneCraftingRecipe("AURILIUM", new ItemStack(Items.apple), new AspectList().add(Aspect.AIR,  1).add(Aspect.EARTH, 1), new Object[] { "SSS", "SSS", "SSS", Character.valueOf('S'), new ItemStack(ConfigItems.itemShard, 1, 1) }));
	}
}
