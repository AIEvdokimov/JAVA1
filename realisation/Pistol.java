package com.company.realisation;

import com.company.newinterface.Weapon;

public class PIstol implements Weapon {
    @Override
    public void doFire() {
        System.out.println("Do pistol shoot!");
    }
}
