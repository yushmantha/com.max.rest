package com.max.rest.status;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author: Randima
 * @date: Dec 31, 2013
 **/
@Path("/v1/status")
public class V1_Status
{
	private static final String api_var = "00.00.01";

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle()
	{
		return "<p>Java Web Service</p>";
	}

	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion()
	{
		return "<p>Version:" + api_var + "</p>";
	}
}
