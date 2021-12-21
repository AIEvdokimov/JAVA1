package com.company.DBT2_2_LEADS_DM_Contacts;

public class SegmentType {
    private String type = " ";
    private String description = " ";
    private Integer number = 0;

    private SegmentType( String t, String d, Integer n){
        type = t;
        description = d;
        number = n;
    }

    public String getType() {
        return type;
    }

    public void setType(String t) {
        type = t;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String d) {
        description = d;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer n) {
        number = n;
    }
}
