package com.company.DBT2_2_LEADS_DM_Contacts;

public class CompanyIndustry {
    private String company = " ";
    private String industry = " ";
    private String companyID = "";

    private CompanyIndustry( String c, String i, String cid){
        company = c;
        industry = i;
        companyID = cid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String c) {
        company = c;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String i) {
        industry = i;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String cid) {
        companyID = cid;
    }
}
