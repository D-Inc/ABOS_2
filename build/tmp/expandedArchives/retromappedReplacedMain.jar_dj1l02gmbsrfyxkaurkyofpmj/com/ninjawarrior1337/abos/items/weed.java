package com.ninjawarrior1337.abos.items;

import net.minecraft.item.ItemFood;

/**
 * Created by troth on 6/19/2016.
 */
public class weed extends ItemFood
{
    public weed(String unlocalizedname, int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        this.func_77655_b(unlocalizedname);
    }
}
