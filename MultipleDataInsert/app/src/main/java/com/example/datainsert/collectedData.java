package com.example.datainsert;

public class collectedData {

    String name, dept, sid, mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public collectedData(String name, String dept, String sid, String mobile) {
        this.name = name;
        this.dept = dept;
        this.sid = sid;
        this.mobile = mobile;


    }
}
