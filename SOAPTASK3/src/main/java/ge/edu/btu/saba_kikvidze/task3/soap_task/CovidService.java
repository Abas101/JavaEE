package ge.edu.btu.saba_kikvidze.task3.soap_task;

import ge.edu.btu.saba_kikvidze.task3.soap_task.model.Country;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class CovidService {

    @WebMethod
    public List <Country> getStatistic() {
        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country(420, "US", 432, 324 ));
        countryList.add(new Country(420, "Italy", 432, 324 ));
        countryList.add(new Country(420, "Spain", 432, 324 ));
        return countryList;
    }

    @WebMethod
    public int getTotalConfirmed() {
        List<Country> stats = new ArrayList<>(getStatistic());
        int totalConfirmed = 0;
        for (Country stat : stats) {
            int confirmed = stat.getConfirmed();
            totalConfirmed += confirmed;
        }
        return totalConfirmed;
    }

    @WebMethod
    public int getTotalDeaths() {
        List<Country> stats = new ArrayList<>(getStatistic());
        int totalDeaths = 0;
        for (Country stat : stats) {
            int deaths = stat.getDeaths();
            totalDeaths += deaths;
        }
        return totalDeaths;
    }

    @WebMethod
    public int getTotalRecovered() {
        List<Country> stats = new ArrayList<>(getStatistic());
        int totalRecovered = 0;
        for (Country stat : stats) {
            int recovered = stat.getRecovered();
            totalRecovered += recovered;
        }
        return totalRecovered;
    }

    @WebMethod
    public Country getCountryStatistic(String country) {
        Country returnedCountry = new Country();
        List<Country> stats = new ArrayList<>(getStatistic());
        for (Country stat: stats) {
            if (stat.getCountry().equals(country)) {
                returnedCountry = stat;
            }
        }
        return returnedCountry;
    }
}
