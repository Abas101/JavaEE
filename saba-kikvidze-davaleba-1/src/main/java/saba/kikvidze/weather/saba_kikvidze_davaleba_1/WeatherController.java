package saba.kikvidze.weather.saba_kikvidze_davaleba_1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
public class WeatherController {

    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getForecasts() {
        return WeatherForeCasts.getWeatherForecasts();
    }

    @GET
    @Path("/weather/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getStudent(@PathParam("city") String city) {
        for (Weather weather : WeatherForeCasts.getWeatherForecasts()) {
            if (weather.getCityName().toLowerCase().equals(city)) {
                return weather;
            }
        }
        return null;
    }

}