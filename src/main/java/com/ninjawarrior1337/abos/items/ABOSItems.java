package com.ninjawarrior1337.abos.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ABOSItems
{
    public static Item.ToolMaterial LIGHTSABER = EnumHelper.addToolMaterial("LIGHTSABER", 0, 32767, -1.0F, 11.0F, 18);

    public static Item blue_lightsaber;
    public static Item green_lightsaber;
    public static Item red_lightsaber;
    public static Item peppe;
    public static Item corn_syrup;
    public static Item graham_cracker;
    public static Item chocholate;
    public static Item weed;

    public static final CreativeTabs tabABOS = new CreativeTabs("ABOS")
    {
        @Override
        public Item getTabIconItem()
        {
            return ABOSItems.peppe;
        }
    };


    public static void createItems()
    {
        GameRegistry.registerItem(blue_lightsaber = new blue_lightsaber("blue_lightsaber", LIGHTSABER), "blue_lightsaber");
        GameRegistry.registerItem(green_lightsaber = new green_lightsaber("green_lightsaber", LIGHTSABER), "green_lightsaber");
        GameRegistry.registerItem(red_lightsaber = new red_lightsaber("red_lightsaber", LIGHTSABER), "red_lightsaber");
        GameRegistry.registerItem(peppe = new peppe("peppe"), "peppe");
        GameRegistry.registerItem(corn_syrup = new corn_syrup("corn_syrup"), "corn_syrup");
        GameRegistry.registerItem(graham_cracker = new graham_cracker("graham_cracker", 2, 0.3F, false).setAlwaysEdible(), "graham_cracker");
        GameRegistry.registerItem(chocholate = new chocholate("chocholate", 3, 0.2F, true).setAlwaysEdible(), "chocholate");
        GameRegistry.registerItem(weed = new weed("weed", 1, 0.0F, true).setAlwaysEdible(), "weed");
    }

    public static void setCreativeTab()
    {
        blue_lightsaber.setCreativeTab(ABOSItems.tabABOS);
        green_lightsaber.setCreativeTab(ABOSItems.tabABOS);
        red_lightsaber.setCreativeTab(ABOSItems.tabABOS);
        corn_syrup.setCreativeTab(ABOSItems.tabABOS);
        graham_cracker.setCreativeTab(ABOSItems.tabABOS);
        chocholate.setCreativeTab(ABOSItems.tabABOS);
        weed.setCreativeTab(ABOSItems.tabABOS);
    }
}
