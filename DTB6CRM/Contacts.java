package com.company.DTB6CRM;

public class Contacts {
    private String contactID = " ";
    private String companyID = " ";
    private String tel = "";
    private String contactPerson = "";
    private String contacts = "";
    private String country = "";
    private String region = "";
    private String town = "";


    private Contacts( String a, String b, String c, String d, String e, String f, String g, String h){
        contactID = a;
        companyID = b;
        tel = c;
        contactPerson = d;
        contacts = e;
        country = f;
        region = g;
        town = h;

    }

    public void contactsConstructor4(){}

    public Contacts(){}

    public String konstruct2(){return contactPerson + town + tel;}

    public String konstruct3(){return companyID + region + town;}


    public String getContactID() {
        return contactID;
    }

    public void setContactID(String a) {
        contactID = a;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String b) {
        contactID = b;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String c) {
        tel = c;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String d) { contactPerson = d; }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String e) {
        contacts = e;
    }

    public String getCountry() {return country;}

    public void setCountry(String f) {country = f;}

    public String getRegion() {return region;}

    public void setRegion(String g) {region = g;}

    public String getTown() {return town;}

    public void setTown(String h) {town = h;}
}
