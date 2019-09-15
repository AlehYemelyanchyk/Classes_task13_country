package by.epam.ayem.module4.model;

/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class District {

    private String name;
    private Region region;

    public District(String name, Region region) {
        this.name = name;
        this.region = region;
    }
}
