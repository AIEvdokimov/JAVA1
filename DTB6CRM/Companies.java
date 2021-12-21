package com.company.DTB6CRM;

public class Companies {
    private String companyID = " ";
    private String companyName = " ";
    private String contactID = "";
    private String manager = "";
    private String segment = "";
    private String stage = "";
    private String segmentID = "";
    private String segmentName = "";

    public Companies(){

    }

    public Companies( String a, String b, String c, String d, String e, String f, String g, String h){
        companyID = a;
        companyName = b;
        contactID = c;
        manager = d;
        segment = e;
        stage = f;
        segmentID = g;
        segmentName = h;
    }

    public void companyConstructor4(){}

    public String konsruct1(){return companyID + companyName + segment;}

    public String konstruct2(){return contactID + companyName + manager;}

    public String konstruct3(){return companyName + stage + segmentName;}


    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String a) {
        companyID = a;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String b) {
        companyName = b;
    }

    public String getContactID() {
        return contactID;
    }

    public void setContactID(String c) {
        contactID = c;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String d) { manager = d; }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String e) {
        segment = e;
    }

    public String getStage() {return stage;}

    public void setStage(String f) {stage = f;}

    public String getSegmentID() {return segmentID;}

    public void setSegmentID(String g) {segmentID = g;}

    public String getSegmentName() {return segmentName;}

    public void setSegmentName(String h) {segmentName = h;}
}
