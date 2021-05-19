package saba.kikvidze.weather.saba_kikvidze_davaleba_1;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Weather {

    private DirectionType direction;
    private int windSpeed;
    private String cityName;
    private int pressure;
    private int temperature;
    private int humidity;


    public Weather() {
    }

    public Weather(DirectionType direction, int windSpeed, String cityName, int pressure, int temperature, int humidity) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.direction = direction;
        this.windSpeed = windSpeed;
    }

    public int getSpeed() {
        return windSpeed;
    }

    public void setSpeed(int speed) {
        this.windSpeed = speed;
    }

    public DirectionType getDirection() {
        return direction;
    }

    public void setDirection(DirectionType direction) {
        this.direction = direction;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
