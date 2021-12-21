package com.company.DBT2_2_LEADS_DM_Contacts;

public class LINPageCIO {
    public LINPageCIO(){
        method2();
    }


    private LINPageCIO( String n, String w, String p){
        name = n;
        webaddress = w;
        position = p;
    }
    private String name = method5();
    private String webaddress = " ";
    private String position = method3();

    {
        name = "chtougodno1";
        method1();
    }

    public void method1(){
        System.out.println("method 1");
    }

    public void method2(){
        System.out.println("method 2");
    }

    public String method3(){
        System.out.println("method 3");
        return null;
    }

    public String method4(){
        System.out.println("method 4");
        return "hello 100";
    }

    public String method5(){
        System.out.println("method 5");
        return "hello 555";
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
    public String getWebaddress() {
        return webaddress;
    }

    public void setWebaddress(String w) {
        webaddress = w;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String p) {
        position = p;
    }

    private String printLINPageCIO(){
        return " n" + " w" + " p";
    }



}

