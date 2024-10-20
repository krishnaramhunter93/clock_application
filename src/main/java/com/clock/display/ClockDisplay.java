package com.clock.display;

import com.clock.Clock;

// ClockDisplay class responsible for printing the current time and date
public class ClockDisplay implements Runnable {
	private final Clock clock; // Shared Clock object

	// Constructor to accept shared Clock object
	public ClockDisplay(Clock clock) {
		this.clock = clock;
	}

	@Override
	public void run() {
		while (true) {
			// Get the current time from Clock and print it
			System.out.println("Current Time: " + clock.getCurrentTime());

			try {
				// Sleep for 1 second before displaying the next update
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Display thread interrupted: " + e.getMessage());
			}
		}
	}
}
