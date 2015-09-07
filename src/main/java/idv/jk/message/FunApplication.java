package idv.jk.message;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class FunApplication extends ResourceConfig
{
	public FunApplication()
	{
		packages("idv.jk.message");
	}
}
