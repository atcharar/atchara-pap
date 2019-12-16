package com.atch.pap;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Alien getAlien()
	{
		System.out.println("called");
		Alien a1 = new Alien();
		a1.setName("Atch");
		a1.setPoints(50);
		System.out.println(a1);
		 return a1;
	}
	
}
