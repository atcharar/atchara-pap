package com.hiber.second;

import org.springframework.stereotype.Component;

@Component
public class Motorcycle implements Motors{

	public void drive() {
		System.out.println("The bike is HD");
	}
}
