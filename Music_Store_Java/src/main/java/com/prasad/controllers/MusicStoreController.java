package com.prasad.controllers;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.prasad.services.SongsList;

@Path("musicstore")
public class MusicStoreController {
	
	@GET
	 @Produces(MediaType.TEXT_PLAIN)
	public String getMessage(){
		return "Hello Baby";
	}

}
