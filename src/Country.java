/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class Country {

    private String name;
    private Region[] regions;

    public Country(String name, Region... region) {
        this.name = name;
        this.regions = region;
    }

    public void countArea() {
        double area = 0;

        for (Region region : regions) {
            area += region.getArea();
        }
        System.out.println("The country area = " + area + "km2");
    }

    public void regionsAmount() {
        System.out.println(regions.length + " regions");
    }

    public void showRegionalCenters() {
        for (Region region : regions) {
            for (District district : region.getDistricts()) {
                City city = district.getCity();
                if (city.isRegionalCenter()) {
                    System.out.println("The city " + district.getCity().getName() + " is the regional center of the " + region.getName());
                }
            }
        }
    }

    public void showCapital() {
        for (Region region : regions) {
            for (District district : region.getDistricts()) {
                City city = district.getCity();
                if (city.isCapital()) {
                    System.out.println("The capital is " + district.getCity().getName());
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }
}
