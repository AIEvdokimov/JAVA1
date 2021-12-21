package com.company.DTB7DVDbase;

public class CityCountry {
    private String city = " ";
    private String cityID = " ";
    private String countryID = "";
    private String lastUpdate = "";
    private String country = "";
    private String region = "";
    private String flag = "";
    private String telCode = "";


    private CityCountry( String a, String b, String c, String d, String e, String f, String g, String h){
        city = a;
        cityID = b;
        countryID = c;
        lastUpdate = d;
        country = e;
        region = f;
        flag = g;
        telCode = h;
    }

    public String flagsDTB(){return countryID + country + flag;}

    public String telcodes(){return city + cityID + region + telCode;}

    public String getCity() {
        return city;
    }

    public void setCity(String a) {
        city = a;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String b) {
        cityID = b;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String c) {
        countryID = c;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String d) {
        lastUpdate = d;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String e) {
        country = e;
    }

    public String getRegion() {return region;}

    public void setRegion(String f) {region = f;}

    public String getFlag() {return flag;}

    public void setFlag(String g) {flag = g;}

    public String getTelCode() {return telCode;}

    public void setTelCode(String h) {telCode = h;}

}
