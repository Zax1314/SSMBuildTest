package com.zy.ssm.entity;

public class Post {
   private int pid;
   private String pic;
   private String uname;
   private String ptitle;
   private String pcontext;
   private String ptype;
   private String ptime;
   private int pnums;

    public Post(String ptype, int pnums) {
        this.ptype = ptype;
        this.pnums = pnums;
    }

    public int getPnums() {
        return pnums;
    }

    public void setPnums(int pnums) {
        this.pnums = pnums;
    }

    public Post(int pid, String pic, String uname, String ptitle, String pcontext, String ptype, String ptime) {
        this.pid = pid;
        this.pic = pic;
        this.uname = uname;
        this.ptitle = ptitle;
        this.pcontext = pcontext;
        this.ptype = ptype;
        this.ptime = ptime;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPcontext() {
        return pcontext;
    }

    public void setPcontext(String pcontext) {
        this.pcontext = pcontext;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }
}
