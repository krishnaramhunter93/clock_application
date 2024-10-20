package com.clock.update;

import com.clock.Clock;

// ClockUpdater class responsible for updating the time in the background
public class ClockUpdater implements Runnable {
	private final Clock clock; // Shared Clock object

	// Constructor to accept shared Clock object
	public ClockUpdater(Clock clock) {
		this.clock = clock;
	}

	@Override
	public void run() {
		while (true) {
			// Update the current time in the Clock object
			clock.updateTime();

			try {
				// Simulate background work by sleeping for 1 second
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Update thread interrupted: " + e.getMessage());
			}
		}
	}
}
