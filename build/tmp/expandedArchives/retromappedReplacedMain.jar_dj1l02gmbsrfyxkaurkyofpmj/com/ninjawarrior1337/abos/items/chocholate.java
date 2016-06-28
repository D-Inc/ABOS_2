package com.ninjawarrior1337.abos.items;

import net.minecraft.item.ItemFood;

/**
 * Created by troth on 6/15/2016.
 */
public class chocholate extends ItemFood
{
    public chocholate(String unlocalizedname, int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        this.func_77655_b(unlocalizedname);
    }
}
