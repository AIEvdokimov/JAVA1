package com.company.DBT2_2_LEADS_DM_Contacts;

public class Segmentation {
    private String segment = " ";
    private String industry = " ";
    private String tag = "";

    private Segmentation( String s, String i, String t){
        segment = s;
        industry = i;
        tag = t;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String f) {
        segment = "s";
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String l) {
        industry = "i";
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String t) {
        tag = t;
    }
}
