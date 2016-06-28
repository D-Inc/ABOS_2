package com.ninjawarrior1337.abos.crafting;

import com.ninjawarrior1337.abos.items.ABOSItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting
{
    public static void initCrafting()
    {
        GameRegistry.addRecipe(new ItemStack(ABOSItems.blue_lightsaber), new Object[] {"SHS", "SHS", "DID", 'S', new ItemStack(Blocks.STAINED_GLASS, 1, 3), 'H', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3), 'I', new ItemStack(Blocks.IRON_BARS, 1), 'D', new ItemStack(Items.DIAMOND, 1)});
        GameRegistry.addRecipe(new ItemStack(ABOSItems.green_lightsaber), new Object[] {"SHS", "SHS", "DID", 'S', new ItemStack(Blocks.STAINED_GLASS, 1, 5), 'H', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5), 'I', new ItemStack(Blocks.IRON_BARS, 1), 'D', new ItemStack(Items.DIAMOND, 1)});
        GameRegistry.addRecipe(new ItemStack(ABOSItems.red_lightsaber), new Object[] {"SHS", "SHS", "DID", 'S', new ItemStack(Blocks.STAINED_GLASS, 1, 14), 'H', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14), 'I', new ItemStack(Blocks.IRON_BARS, 1), 'D', new ItemStack(Items.DIAMOND, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ABOSItems.corn_syrup), new Object[] {new ItemStack(Items.POTIONITEM, 1, 0), new ItemStack(Items.SUGAR, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(ABOSItems.graham_cracker), new Object[]{"   ", " W ", "WSW", 'W', new ItemStack(Items.WHEAT, 1, 0), 'S', new ItemStack(Items.SUGAR, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(ABOSItems.chocholate), new Object[]{" C ", " C ", " C ", 'C', new ItemStack(Items.DYE, 1, 3)});
        GameRegistry.addSmelting(Items.WHEAT_SEEDS, new ItemStack(ABOSItems.weed, 1, 0), 1000.0F);
    }

}
