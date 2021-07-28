package com.zy.ssm.entity;

public class User {
    private int uid;
    private String uname;
    private String upwd;
    private String mail;

    public User(String uname, String upwd, String mail) {
        this.uname = uname;
        this.upwd = upwd;
        this.mail = mail;
    }

    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
