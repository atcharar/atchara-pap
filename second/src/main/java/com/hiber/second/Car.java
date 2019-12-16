package com.hiber.second;

import org.springframework.stereotype.Component;

@Component
public class Car implements Motors
{
	
	public void drive()
	{
		System.out.println("The car is Jaguar");
	}

}
