package by.epam.ayem.module4;

/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

import java.util.ArrayList;
import java.util.List;

public class Country {

    private String name;
    private List<Region> regions;

    public Country(String name) {
        this.name = name;
        this.regions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
}
