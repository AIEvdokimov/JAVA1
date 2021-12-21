package com.company.realisation;

import com.company.newinterface.Weapon;

    public class LaserGun implements Weapon {
        @Override
        public void doFire() {
            System.out.println("Do laser shoot!");
        }
    }

