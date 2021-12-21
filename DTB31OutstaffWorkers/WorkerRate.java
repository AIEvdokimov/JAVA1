package com.company.DTB31OutstaffWorkers;

public class WorkerRate {
    private String workerID = " ";
    private String buyingRate = " ";
    private String sellingRate = "";

    private WorkerRate( String w, String b, String s){
        workerID = w;
        buyingRate = b;
        sellingRate = s;
    }

    public String getFname() {
        return workerID;
    }

    public void setFname(String w) {
        workerID = w;
    }

    public String getLname() {
        return buyingRate;
    }

    public void setLname(String b) {
        buyingRate = b;
    }

    public String getTitle() {
        return sellingRate;
    }

    public void setTitle(String s) {
        sellingRate = s;
    }
}
