package com.company.DTB31OutstaffWorkers;

public class WorkerStatus {
    private String workerID = " ";
    private String status = " ";
    private String dateOfEnd = "";

    private WorkerStatus( String w, String s, String d){
        workerID = w;
        status = s;
        dateOfEnd = d;
    }

    public String getFname() {
        return workerID;
    }

    public void setFname(String w) {
        workerID = w;
    }

    public String getLname() {
        return status;
    }

    public void setLname(String s) {
        status = s;
    }

    public String getTitle() {
        return dateOfEnd;
    }

    public void setTitle(String d) {
        dateOfEnd = d;
    }
}
