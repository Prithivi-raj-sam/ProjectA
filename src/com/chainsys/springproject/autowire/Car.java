package com.chainsys.springproject.autowire;

//import javax.annotation.Resource; // 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
public class Car {
	@Autowired
	private Engine petrolEngine;
	@Autowired(required=true)
	private Wheel alloy;
	
	
	
	public Car() {
		System.out.println("1 Car Object created "+ hashCode());
	}
	public Car(Engine petrolEngine,Wheel alloy) {
		System.out.println("2 Car Object created "+ hashCode());
		this.petrolEngine=petrolEngine;
		this.alloy=alloy;
	}
	public void begin() {
		System.out.println("Strat AnnotationLc...");
	}
	public void stop() {
		System.out.println("Stoped AnnotationLc...");
	}
	public void starts() {
		petrolEngine.start();
	}
	public void move() {
		alloy.rotate();
	}
}
@Component("sportsCar")
class SportsCar extends Car {
	public SportsCar() {
		System.out.println("SportsCar");
	}
}
@Component("MUVCar")
class MUVCar extends Car {
	public MUVCar() {
		System.out.println("MUVCar");
	}
}
