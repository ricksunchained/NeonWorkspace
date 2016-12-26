package com.ricks;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements org.quartz.Job {

    public MyJob() {
    }

    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("the code to delete the 10min later records will go in this block");
    	System.out.println("I execute every 2secs");
    }
}