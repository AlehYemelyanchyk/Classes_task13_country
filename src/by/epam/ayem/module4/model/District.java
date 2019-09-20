package by.epam.ayem.module4.model;


/**
 * @author Aleh Yemelyanchyk on 9/19/2019.
 */
/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class District {

    private String name;
    private Region region;

    public District(String name, Region region) {
        this.name = name;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
