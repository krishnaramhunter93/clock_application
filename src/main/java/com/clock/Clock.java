package com.clock;

import java.text.SimpleDateFormat;
import java.util.Date;

// Clock class responsible for holding and updating time
public class Clock {
	private Date currentTime; // Shared resource between threads

	// Synchronized method to update the current time
	public synchronized void updateTime() {
		this.currentTime = new Date(); // Update current time
	}

	// Synchronized method to get the current time (formatted) for display
	public synchronized String getCurrentTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
		return formatter.format(currentTime); // Return formatted current time
	}
}
