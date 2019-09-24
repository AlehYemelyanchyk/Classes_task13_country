package by.epam.ayem.module4.model;

/**
 * @author Aleh Yemelyanchyk on 9/19/2019.
 */
/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class Region {

    private String name;
    private double area;
    private Country country;
    private City regionalCenter;

    public Region(String name, double square, Country country) {
        this.name = name;
        this.area = square;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }
}
