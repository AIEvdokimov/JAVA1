package com.company.DBT2_2_LEADS_DM_Contacts;

public class SegmentID {
    private String segmentation = " ";
    private String description = " ";
    private Integer id = 0;

    private SegmentID( String s, String d, Integer i){
        segmentation = s;
        description = d;
        id = i;
    }

    public String getSegmentation() {
        return segmentation;
    }

    public void setSegmentation(String s) {
        segmentation = s;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String d) {description = d;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer i) {
        id = i;
    }
}
