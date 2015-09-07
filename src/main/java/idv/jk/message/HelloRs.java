package idv.jk.message;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.google.gson.Gson;

import idv.jk.message.model.Letter;

@Path("/hello")
public class HelloRs
{
	@GET
	public String sayHelloWorld()
	{
		return "Hello World";
	}
	
	@GET
	@Path("/{name}")
	public String sayHello(@PathParam("name") String name)
	{
		return "Hello, " + name;
	}
	
	@GET
	@Path("letter")
	public String getLetter()
	{
		Letter letter = new Letter("in bottle", "How can I live without you?");
		
		return new Gson().toJson(letter);
	}
}
