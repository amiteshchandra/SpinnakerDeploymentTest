package com.amitesh.find;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/search")
public class CitySearch 
{
	
	  // This method is called if TEXT_PLAIN is request
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello() {
	    return "Hello Jersey";
	  }

	  @Path("/city/{name}")
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String findCity(@PathParam("name")String cityName)
	  {
		
		  return findCityLocation(cityName);
		  
	  }

	private String findCityLocation(String cityName) 
	{
		if(cityName.equalsIgnoreCase("newyork") || cityName.equalsIgnoreCase("new york"))
		{
			return "Country:US State:NY";
		}
		
		return cityName + " not found";
	}
}
