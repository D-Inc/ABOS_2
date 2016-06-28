package com.ninjawarrior1337.abos.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

/**
 * Created by troth on 6/15/2016.
 */
public class graham_cracker extends ItemFood
{
    public graham_cracker(String unlocalizedname, int amount, float saturation, boolean isWolfFood, PotionEffect... effects)
    {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(unlocalizedname);
    }
}
