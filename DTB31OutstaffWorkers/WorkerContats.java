package com.company.DTB31OutstaffWorkers;

public class WorkerContats {
    private String workerID = " ";
    private String skype = " ";
    private String zoom = "";

    private WorkerContats( String w, String s, String z){
        workerID = w;
        skype = s;
        zoom = z;
    }

    public String getFname() {
        return workerID;
    }

    public void setFname(String w) {
        workerID = w;
    }

    public String getLname() {
        return skype;
    }

    public void setLname(String s) {
        skype = s;
    }

    public String getTitle() {
        return zoom;
    }

    public void setTitle(String z) {
        zoom = z;
    }
}
