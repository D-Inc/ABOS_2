package com.ninjawarrior1337.abos;

import com.ninjawarrior1337.abos.crafting.ModCrafting;
import com.ninjawarrior1337.abos.items.ABOSItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent e)
    {
        ABOSItems.createItems();
        ABOSItems.setCreativeTab();
    }
    public void init(FMLInitializationEvent e)
    {
        ModCrafting.initCrafting();
    }
    public void postInit(FMLPostInitializationEvent e)
    {

    }
}
