package com.company.DTB31OutstaffWorkers;

public class WorkerAgreement {
    private String workerID = " ";
    private String nda = " ";
    private String agrementNum = "";

    private WorkerAgreement( String w, String n, String a){
        workerID = w;
        nda = n;
        agrementNum = a;
    }

    public String getFname() {
        return workerID;
    }

    public void setFname(String w) {
        workerID = w;
    }

    public String getLname() {
        return nda;
    }

    public void setLname(String n) {
        nda = n;
    }

    public String getTitle() {
        return agrementNum;
    }

    public void setTitle(String a) {
        agrementNum = a;
    }
}
