package com.company.DTB31OutstaffWorkers;

public class WorkerID {
    private String workerID = "";
    private String cv = "";
    private String name = "";

    private WorkerID(String w, String c, String n){
        workerID = w;
        cv = c;
        name = n;
    }

    public String getWorkerID(){
            return workerID;
    }

    public void setWorkerID(String w){
        workerID = w;
    }

    public String getCv(){
        return cv;
    }

    public void setCv(String c){
        cv = c;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

}
