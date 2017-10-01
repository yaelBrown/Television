/*
 * File: Television.java
 * Author: Yael Brown
 * Date: October 1, 2017
 * Purpose: Create a simple java class with constructor
 * for Week 6 discussion.
 */

 /**
  * Television Class
  * @author Yael Brown
  */
public class Television {
	// Declare variables to hold values
	boolean isOn = false;
	boolean working = true;
	int currentChannel = 01;
	
	// Constructor
	public Television(int chan, boolean work, boolean on) {
		isOn = on;
		working = work;
		currentChannel = chan;
	}
	
	// Setters
	public void setIsOn(boolean on) {
		on = isOn;
	}
	
	public void setWorking(boolean work) {
		working = work;
	}
	
	public void setCurrentChannel(int chan) {
		currentChannel = chan;
	}
	
	// Getters
	public boolean getIsOn() {
		return this.isOn;
	}
	
	public boolean getWorking() {
		return this.working;
	}
	
	public int getCurrentChannel() {
		return currentChannel;
	}
	
	// toString method
	public String toString() {
		String str = "/nIs TV working? " + getIsOn() + 
				"/n Is TV working? " + getWorking() +
				"/n The current channel is " + getCurrentChannel();
		return str;
	}
	
// Test the class
public static void main(String[] args) {
	// Test case 1
	Television Zenith = new Television(12, true, true);
	
	// See what channel the TV is on.
	System.out.println("The Zenith is on channel " + Zenith.getCurrentChannel());
	
	// Check if the TV is on. 
	if (Zenith.getIsOn()) {
		System.out.println("The Zenith TV is on");
		if (Zenith.getWorking()) {
			System.out.println("The Zenith TV is working");
			} else {
				System.out.println("The Zenith TV is NOT working");
			}
	} else {
			System.out.println("The Zenith TV is not on");
			}
		}
}