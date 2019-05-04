package org.acme.weather;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/w")
public class WeatherResource {

  @Inject
  @RestClient
  OpenWeatherMapService service;
  
  @Inject
  @ConfigProperty(name="API_KEY")
  String apikey;

  @GET
  @Path("/{city}")
  @Produces(MediaType.APPLICATION_JSON)
  public Weather weather(@PathParam("city") String city) {
    Weather w = service.getByCityName(city, "imperial", apikey);
    return w;
  }
}
