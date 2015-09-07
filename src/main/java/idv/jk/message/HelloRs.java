package idv.jk.message;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

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
}
