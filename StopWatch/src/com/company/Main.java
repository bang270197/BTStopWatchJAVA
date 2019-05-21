package com.company;

public class Main {

    public static void main(String[] args) {
	StopWatch stopWatch=new StopWatch();
	//thiet lap thoi gian bat dau
	stopWatch.setStartTime();
	int sum=0;
	for (int i=0;i<100000;i++){
	    sum+=i;
    }
	stopWatch.setEndTime();
	long time=stopWatch.getEclapsedTime();
        System.out.println("the time "+time);
    }
}
