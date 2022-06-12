package com.chainsys.springproject.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chainsys.springproject.beans.Car;

public class TestCar {
	public static void firsttest() {
		ApplicationContext apcontext = new ClassPathXmlApplicationContext("Car2.xml");
		Car car=apcontext.getBean("jaguvar",Car.class);
		// before creating object for Car it will create object for Engine and Wheel
		// because in car2.xml file we are using depends-on ="id of Engine class,id of Wheel class"
		// here Car object depends-on Engine,wheel
		car.start();
		car.move();
	}
}
