package com.company.DTB6CRM;

public class Car {
    int method(){
        return 1;
    }

    class Lada extends Car{
        @Override
        int method(){
            return 2;
        }

        public class OverrideExample{

        }

    }

}
