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
        GameRegistry.addRecipe(new ItemStack(ABOSItems.blue_lightsaber), new Object[] {"SHS", "SHS", "DID", 'S', new ItemStack(Blocks.field_150399_cn, 1, 3), 'H', new ItemStack(Blocks.field_150406_ce, 1, 3), 'I', new ItemStack(Blocks.field_150411_aY, 1), 'D', new ItemStack(Items.field_151045_i, 1)});
        GameRegistry.addRecipe(new ItemStack(ABOSItems.green_lightsaber), new Object[] {"SHS", "SHS", "DID", 'S', new ItemStack(Blocks.field_150399_cn, 1, 5), 'H', new ItemStack(Blocks.field_150406_ce, 1, 5), 'I', new ItemStack(Blocks.field_150411_aY, 1), 'D', new ItemStack(Items.field_151045_i, 1)});
        GameRegistry.addRecipe(new ItemStack(ABOSItems.red_lightsaber), new Object[] {"SHS", "SHS", "DID", 'S', new ItemStack(Blocks.field_150399_cn, 1, 14), 'H', new ItemStack(Blocks.field_150406_ce, 1, 14), 'I', new ItemStack(Blocks.field_150411_aY, 1), 'D', new ItemStack(Items.field_151045_i, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ABOSItems.corn_syrup), new Object[] {new ItemStack(Items.field_151068_bn, 1, 0), new ItemStack(Items.field_151102_aT, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(ABOSItems.graham_cracker), new Object[]{"   ", " W ", "WSW", 'W', new ItemStack(Items.field_151015_O, 1, 0), 'S', new ItemStack(Items.field_151102_aT, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(ABOSItems.chocholate), new Object[]{" C ", " C ", " C ", 'C', new ItemStack(Items.field_151100_aR, 1, 3)});
        GameRegistry.addSmelting(Items.field_151014_N, new ItemStack(ABOSItems.weed, 1, 0), 100.0F);
    }

}
