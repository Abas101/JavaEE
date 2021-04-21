package ge.edu.btu.saba_kikvidze.task3.soap_task.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Country {
    private int confirmed;
    private String country;
    private int deaths;
    private int recovered;

    public Country() {

    }

    public Country(int confirmed, String country, int deaths, int recovered) {
        this.confirmed = confirmed;
        this.country = country;
        this.deaths= deaths;
        this.recovered = recovered;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    @Override
    public String toString() {
        return "Country{" +
                "confirmed=" + confirmed +
                ", country='" + country + '\'' +
                ", deaths=" + deaths + '\'' +
                ", recovered" + recovered + '\'' +
                '}';
    }
}
