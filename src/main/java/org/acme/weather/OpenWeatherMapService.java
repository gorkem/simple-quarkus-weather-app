package org.acme.weather;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
@Path("/2.5")
@RegisterRestClient
public interface OpenWeatherMapService {

 @GET
 @Path("/weather")
 @Produces("application/json")
 Weather getByCityName( @QueryParam("q") String city,
                         @QueryParam("units") String units,
                         @QueryParam("appid") String apiKey);


}
