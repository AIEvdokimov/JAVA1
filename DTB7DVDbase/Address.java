package com.company.DTB7DVDbase;

public class Address {
    private String addressPost = " ";
    private String address2 = " ";
    private String addressID = "";
    private String cityID = "";
    private String district = "";
    private String lastUpdate = "";
    private String phone = "";
    private String postalCode = "";


    private Address( String a, String b, String c, String d, String e, String f, String g, String h){
        addressPost = a;
        address2 = b;
        addressID = c;
        cityID = d;
        district = e;
        lastUpdate = f;
        phone = g;
        postalCode = h;
    }

    public String codesDTB(){return addressID + addressPost + postalCode;}

    public String getAddressPost() {
        return addressPost;
    }

    public void setAddressPost(String a) {
        addressPost = a;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String b) {
        address2 = b;
    }

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String c) {
        addressID = c;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String d) {
        cityID = d;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String e) {
        district = e;
    }

    public String getLastUpdate() {return lastUpdate;}

    public void setLastUpdate(String f) {lastUpdate = f;}

    public String getPhone() {return phone;}

    public void setPhone(String g) {phone = g;}

    public String getPostalCode() {return postalCode;}

    public void setPostalCode(String h) {postalCode = h;}


}
