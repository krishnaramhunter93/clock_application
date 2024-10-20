package com;

import com.clock.Clock;
import com.clock.display.ClockDisplay;
import com.clock.update.ClockUpdater;

// Main class to run the clock application
public class ClockAppMain {
	public static void main(String[] args) {
		// Create a shared Clock object that will be used by both threads
		Clock clock = new Clock();

		// Create threads for time updating and displaying
		Thread updateThread = new Thread(new ClockUpdater(clock));
		Thread displayThread = new Thread(new ClockDisplay(clock));

		// Set priorities: Display thread has higher priority for better time precision
		updateThread.setPriority(Thread.MIN_PRIORITY); // Lower priority for the update thread
		displayThread.setPriority(Thread.MAX_PRIORITY); // Higher priority for the display thread

		// Start both threads
		updateThread.start();
		displayThread.start();
	}
}
