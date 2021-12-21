package com.company.realisation;

import com.company.newinterface.Weapon;

public class PlasmaGun implements Weapon {
    @Override
    public void doFire() {
        System.out.println("Do plasma shoot!");
    }
}