package com.company.DBT2_2_LEADS_DM_Contacts;

public class CompanySegment {
    private String companyID = " ";
    private String segment = " ";
    private Integer number = 0;

    private CompanySegment( String cid, String s, Integer n){
        companyID = cid;
        segment = s;
        number = n;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String cid) {
        companyID = cid;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String s) {
        segment = s;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer n) {
        number = n;
    }
}
