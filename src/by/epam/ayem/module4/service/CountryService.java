package by.epam.ayem.module4.service;

/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

import by.epam.ayem.module4.model.City;
import by.epam.ayem.module4.model.Country;
import by.epam.ayem.module4.model.District;
import by.epam.ayem.module4.model.Region;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountryService {

    private Set<Country> countries;
    private Set<Region> regions;
    private Set<District> districts;
    private List<City> cities;

    public CountryService() {
        this.countries = new HashSet<>();
        this.regions = new HashSet<>();
        this.districts = new HashSet<>();
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public void addDistrict(District district) {
        districts.add(district);
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public void countArea(Country country) {
        double area = 0;

        for (Region region : regions) {
            if (region.getCountry().getName().equalsIgnoreCase(country.getName())) ;
            area += region.getArea();
        }
        System.out.printf("The country area = %.2f km2.\n", area);
    }

    public void regionsAmount(Country country) {
        int count = 0;

        for (Region region : regions) {
            if (region.getCountry().getName().equalsIgnoreCase(country.getName())) ;
            count++;
        }
        System.out.println(country.getName() + " has " + count + " regions");
    }

    public void showCapital(Country country) {
        if (country.getCapital() == null) {
            System.out.println("No capital yet");
        } else {
            System.out.println("The capital of " + country + " is " + country.getCapital().getName());
        }
    }

    public void showRegionalCenters(Country country) {
        for (Region region : regions) {
            if (region.getCountry().getName().equalsIgnoreCase(country.getName())) {
                if (region.getRegionalCenter() == null) {
                    System.out.println("No regional center yet for " + region.getName());
                } else {
                    System.out.println("The city " + region.getRegionalCenter().getName()
                            + " is the regional center of the " + region.getName());
                }
            }
        }
    }
}