package com.company;

import com.company.DBT1_Customers_Orders.Customer;
import com.company.DBT1_Customers_Orders.Gender;
import com.company.DBT1_Customers_Orders.Phone;
import com.company.DBT2_2_LEADS_DM_Contacts.LINPageCIO;
import com.company.DTB6CRM.*;
import com.company.newinterface.Weapon;
import com.company.realisation.LaserGun;
import com.company.realisation.PIstol;
import com.company.realisation.PlasmaGun;



public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello!");

       // Room some = new Room(200, 3, 20, "Petr");
  //      some.setWidth(1000);
//        System.out.println(some.calculate());
//        System.out.println(some.getWidth());
        //System.out.println(some.calculate() + some.calculate() + some.calculate());

     //   Room some1 = new Room(201, 302, 202, "Petr");
//        System.out.println(some1.calculate());


 //       Room some2 = new Room(2234, 3234,  "Petr");
//        System.out.println(some2.calculate("friday"));

/*        Room some3 = new Room();

        ThirstClass oneTwoThre = new ThirstClass();

        Box box1 = new Box(100, 50, 20);
        Box box2 = new Box(1, 2, 3);

        System.out.println(box1.square() + " класс 1 box");

        BoxPrice1 bp1 = new BoxPrice1(3.9, "lamba", "Marusha");
        BoxPrice1 bp2 = new BoxPrice1(10 , "Lamba2", "Marusha2");

        System.out.println(bp1.Label() + " класс 2 BoxPrice1");
        System.out.println(bp2.Label() + " класс 2 BoxPrice1");

        CostBox CB1 = new CostBox(100, 21);
        System.out.printf("%d класс3 = Price of box%n", CB1.pricing());
        // не понимаю почему выводит 0, должен выводить 121

        BoxWeight bw01 = new BoxWeight(1000, 5);
        System.out.print(bw01.effective() + " 4th class");

        Customer cr1 = new Customer(001, " Ivan", " Ivanov", " +7 987 654 3322", " email@servermail.com", " male");
        System.out.println(cr1 + " 5th class");

        Gender gr1 = new Gender("male", 003, new Phone("+7 495 8800125", 5));
        gr1.getPhone().createCustomerID();

//        Orders order1 = new Orders(111, "125", "01", "02", 200);
        System.out.println (order1 + " order #1");
*/
 /*       LINPageCIO lpc1 = new LINPageCIO();

        MainActivity ma1 = new MainActivity();

        Klass1 klass11 = new Klass1();
        klass11.hllo();

        Klass2 klass21 = new Klass2();

        Klass2 klass22 = new Klass2();

        Klass3 klass3 = new Klass3();

        Klass4 klass4 = new Klass4();

        String five = "five";

  */


        Boolean isMan = true;
//        String name = "Sasha";
        String name = "Alex";

        if (name.equals("Sasha")) {
            String age = " luboytext";
            if (isMan.equals(true)) {
                System.out.println("hello, Sasha boy!" + age);
                String age1 = " luboytext1";
            } else {
                System.out.println("hello, Sasha girl"+ age);
                String age1 = " luboytext1";
            }

        } else if (name.equals("Genia")) {
            System.out.println("Hello, Genia!");
        } else {
            System.out.println("Hi, dude!");
        }

 //       String [4] name = {"alex", "vova", "mike", "maga" };

/*        String[] errorSoon = new String[100];
        errorSoon[0] = "Hello";
        errorSoon[1] = "World";

        System.out.println(errorSoon[1]);
        System.out.println(errorSoon[0]);
*/
        String[] array1 = new String[5];
        array1[0]="one";
        array1[1] = "two";
        array1[2] = "three";
        array1[3] = "four";
        array1[4] = "five";


        System.out.println(array1[0] + array1[1] + array1[2] + array1[3] + array1[4]);

        String[] array2 = new String[5];

        array2[0]="1";
        array2[1] = "2";
        array2[2] = "3";
        array2[3] = "4";
        array2[4] = "5";
        for (int i = 0; i < 4; i++) {
            System.out.println(array2[i]);
        }

            // System.out.println(array2[0] + array2[1] + array2[2] + array2[3] + array2[4]);


        String[] seasons  = new String[] {"Winter", "Spring", "Summer", "Autumn"};
        for (int k = 0; k < 4; k++) {
            System.out.println(seasons[k]);
        }

//        Klass4 klass4 = new Klass4();
//        System.out.println(klass4);

    }

    String typeOfWeapon = "pistol";

    Weapon weapon = null;
        if(typeOfWeapon.equals("laser")){
        weapon = new LaserGun();
    } else if(typeOfWeapon.equals("plasma")){
        weapon = new PlasmaGun();
    } else if(typeOfWeapon.equals("pistol")){
        weapon = new PIstol();
    }

        weapon.doFire();
}

    public void andrew(){
        System.out.println("Hello!");
        Boolean girl=true;
        String nation="corean";

        if(nation.equals("corean")){
            System.out.println("good girl!");
        }else {
            System.out.println("next girl!");
        }

        String[] girls = new String[] {"Ivetta", "Rozetta", "Lizetta", "Zanette", "Zorgetta"};
        for(int i=0;i<4;i++)
            System.out.println(girls[i]);
    }
}

}
