package com.newer.pojo;

import java.util.Date;

public class Student {
    private int stuId;
    private String stuName;
    private char stuSex;
    private String stuCard;
    private Date stuJoinTime;
    private String stuAddress;
    private int sclassid;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName){
        this.stuName = stuName;
    }
    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }


    public char getStuSex() {
        return stuSex;
    }

    public void setStuSex(char stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuCard() {
        return stuCard;
    }

    public void setStuCard(String stuCard) {
        this.stuCard = stuCard;
    }

    public Date getStuJoinTime() {
        return stuJoinTime;
    }

    public void setStuJoinTime(Date stuJoinTime) {
        this.stuJoinTime = stuJoinTime;
    }

    public int getSclassid() {
        return sclassid;
    }

    public void setSclassid(int sclassid) {
        this.sclassid = sclassid;
    }
}
