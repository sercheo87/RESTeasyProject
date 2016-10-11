package com.buraktas.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorld {

	@GET
	public Response getHelloWorld() {
		String value = "Hello World ";
		return Response.status(200).entity(value).build();
	}

	@POST
	@Path("/{username}")
	public Response getHelloWorldName(@PathParam("username") String userName) {
		String value = "Hello World ..." + userName;
		return Response.status(200).entity(value).build();
	}
}