package com.company.DBT2_LEADS_DM_Contacts;

public class TD_id {
    private String tdID = " ";
    private Integer number = 0;
    private String title = "";

    private TD_id ( String ti, Integer nr, String tl){
        tdID= ti;
        number = nr;
        title = tl;
    }

    private void tdID (){
    }

    private void number (){
    }

    private void setTitle (){
    }

    private String TD_id (){
        return number + title + tdID;
    }
}
