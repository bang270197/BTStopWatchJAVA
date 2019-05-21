package com.company;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;
    // ham khong tam so khoi tao startTime=thoi gian hien tai
    public StopWatch() {
        startTime = new Date();
    }
    //tra ve thoi gian gien tai
    public Date getStartTime() {
        return startTime;
    }
    //tra ve thoi gian ket thuc
    public Date getEndTime() {
        return endTime;
    }
    //tra ve thoi gian bat dau bang thoi gian hien tai
    public void setStartTime(){
        startTime=new Date();
    }
    // tra ve thoi gian ket thuc bang thoi gian hien tai
    public void setEndTime(){
        endTime=new Date();
    }
    //lay thoi gian ket thuc - thoi gian bat dau
    public long getEclapsedTime(){
        return endTime.getTime()-startTime.getTime();
    }
}

