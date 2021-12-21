package com.company.DBT2_2_LEADS_DM_Contacts;

public class Name {
    private String fname = " ";
    private String lname = " ";
    private String title = "";

        private Name( String f, String l, String t){
            fname = f;
            lname = l;
            title = t;
        }

        public String getFname() {
            return fname;
        }

        public void setFname(String f) {
            fname = f;
        }

        public String getLname() {
        return lname;
    }

        public void setLname(String l) {
        lname = l;
    }

        public String getTitle() {
        return title;
    }

        public void setTitle(String t) {
        title = t;
    }

        private String Name(){
            return " f" + " l" + " t";
        }
    }
