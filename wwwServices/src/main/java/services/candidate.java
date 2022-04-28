package services;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
@Path ("/hello")
//In the program, functionality needed is for admin to add, edit and remove candidates. upload image
public class candidate {
	@GET
	@Path("/greeting")
	@Produces(MediaType.TEXT_HTML)
	public String SayHello(){
		String  test = "test stuff";
		return test;
	}
	
}
