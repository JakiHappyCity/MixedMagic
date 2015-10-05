package mm.init;

import mm.common.MMBlocks.BlockCrystalBlock;
import mm.common.MMBlocks.BlockWisperPlant;
import mm.common.MMBlocks.BlocksRegistry;
import mm.common.MMItemBlocks.ItemBlockCrystal;
import mm.core.MMCore;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MMBlocks {
	public static Block crystalBlock = (new BlockCrystalBlock()).setBlockName("crystalBlock").setBlockTextureName("thaumicbases:crystal/mixed");
	public static Block wisperPlant = new BlockWisperPlant(4,4,true).setBlockName("wisperPlant").setBlockTextureName("mixedmagic:wisperPlant/");
	public static final Class<MMCore> core =MMCore.class;
	
	public static void setup()
	{
		/**
		 * @param GameRegistry
		 */
		BlocksRegistry.registerBlock(wisperPlant, "wisperPlant",core,ItemBlock.class);
		BlocksRegistry.registerBlock(crystalBlock, "crystalBlock", core, ItemBlockCrystal.class);
		OreDictionary.registerOre("blockCrystalClust", new ItemStack(crystalBlock, 1, 32767));
	}
}
