package com.ninjawarrior1337.abos.client.render.items;

import com.ninjawarrior1337.abos.Reference;
import com.ninjawarrior1337.abos.items.ABOSItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister
{

    public static void registerItemRenderer()
    {
        reg(ABOSItems.blue_lightsaber);
        reg(ABOSItems.green_lightsaber);
        reg(ABOSItems.red_lightsaber);
        reg(ABOSItems.peppe);
        reg(ABOSItems.corn_syrup);
        reg(ABOSItems.graham_cracker);
        reg(ABOSItems.chocholate);
        reg(ABOSItems.weed);
    }

    public static String modid = Reference.MODID;

    public static void reg(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
