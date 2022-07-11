package com.chainsys.springproject.beans;
// multiple factory methods in one class
// Calender factory is also called as initiating bean 
//because method in this bean instantiates objects for other beans
public class CalenderFactory {
	// the static method not static method
	public Calender createCalender() {
		// the Calender constructor is default access modifier so, can be create here
		return new Calender();
	}
	public Appointment createAppointments() {
		return new Appointment();
	}
}
