package by.epam.ayem.module4.model;

/**
 * @author Aleh Yemelyanchyk on 9/19/2019.
 */
/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class City {

    private String name;
    private District district;

    public City(String name, District district) {
        this.name = name;
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
