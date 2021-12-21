package com.company.DTB31OutstaffWorkers;

public class WorkerCV {
    private String workerID = " ";
    private String stack = " ";
    private String grade = "";

    private WorkerCV( String w, String s, String g){
        workerID = w;
        stack = s;
        grade = g;
    }

    public String getFname() {
        return workerID;
    }

    public void setFname(String w) {
        workerID = w;
    }

    public String getLname() {
        return stack;
    }

    public void setLname(String s) {
        stack = s;
    }

    public String getTitle() {
        return grade;
    }

    public void setTitle(String g) {
        grade = g;
    }
}
