package com.ricks;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public class App {
	public static void main(String[] args) throws Exception {
		// define the job and tie it to our MyJob class
		JobDetail job = newJob(MyJob.class).withIdentity("job1", "group1").build();

		// Trigger the job to run now, and then repeat every 40 seconds
		Trigger trigger = newTrigger().withIdentity("trigger1", "group1").startNow()
				.withSchedule(simpleSchedule().withIntervalInSeconds(2).repeatForever()).build();
		// Grab the Scheduler instance from the Factory
		Scheduler scheduler = null;

		scheduler = StdSchedulerFactory.getDefaultScheduler();
		// and start it off
		scheduler.start();

		// Tell quartz to schedule the job using our trigger
		scheduler.scheduleJob(job, trigger);

	}
}
