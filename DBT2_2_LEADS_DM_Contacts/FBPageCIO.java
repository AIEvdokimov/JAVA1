package com.company.DBT2_2_LEADS_DM_Contacts;

import java.lang.constant.Constable;

public class FBPageCIO {
    private String name = " ";
    private String webaddress = " ";
    private String position = "";

    private FBPageCIO( String n, String w, String p){
        name = n;
        webaddress = w;
        position = p;
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
    public String getPosition;

    Constable LINPageCIO() {
        return position;
    }
// я хотел взять должнсть из ранее созданного поля в классе LINPageCIO но что-то пошло не так

    public void setPosition(String p) {
        position = p;
    }

    private String printFBPageCIO(){
        return " n" + " w";
    }
}
