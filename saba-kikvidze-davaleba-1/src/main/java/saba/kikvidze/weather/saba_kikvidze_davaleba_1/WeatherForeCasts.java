package saba.kikvidze.weather.saba_kikvidze_davaleba_1;

import java.util.ArrayList;
import java.util.List;

public class WeatherForeCasts {
    public static List<Weather> getWeatherForecasts() {
        List<Weather> forecasts = new ArrayList<>();

        forecasts.add(new Weather(DirectionType.EAST, 20, "Tbilisi", 70, 20, 20));
        forecasts.add(new Weather(DirectionType.WEST, 20, "Batumi", 72, 25, 11));
        forecasts.add(new Weather(DirectionType.EAST, 20, "Kutaisi", 71, 22, 12));

        return forecasts;
    }

    ;
}
