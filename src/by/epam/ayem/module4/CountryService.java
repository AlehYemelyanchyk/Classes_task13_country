package by.epam.ayem.module4;

/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class CountryService {

    private Country country;

    public void addCountry(Country country) {
        this.country = country;
    }

    public void addRegion(Region region) {
        if (!region.isPart()) {
            country.getRegions().add(region);
            region.setPart(true);
        } else {
            System.out.println("The region is exists in the country.");
        }
    }

    public void countArea() {
        double area = 0;

        for (Region region : country.getRegions()) {
            area += region.getArea();
        }
        System.out.printf("The country area = %.2f km2.\n", area);
    }

    public void regionsAmount() {
        System.out.println(country.getRegions().size() + " regions");
    }

    public void showCapital() {
        for (Region region : country.getRegions()) {
            for (District district : region.getDistricts()) {
                City city = district.getCity();
                if (city.isCapital()) {
                    System.out.println("The capital is " + district.getCity().getName());
                }
            }
        }
    }

    public void showRegionalCenters() {
        for (Region region : country.getRegions()) {
            for (District district : region.getDistricts()) {
                City city = district.getCity();
                if (city.isRegionalCenter()) {
                    System.out.println("The city " + district.getCity().getName() + " is the regional center of the " + region.getName());
                }
            }
        }
    }
}
