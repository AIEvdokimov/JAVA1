package com.company.DBT2_LEADS_DM_Contacts;

public class CIO_id {
    private String cioID = " ";
    private Integer number = 0;
    private String title = "";

    private CIO_id( String ci, Integer nr, String tl){
        cioID = ci;
        number = nr;
        title = tl;
    }

    private void cioID (){
    }

    private void number (){
    }

    private void setTitle (){
    }

    private String CIO_id(){
        return number + title + cioID;
    }
}
