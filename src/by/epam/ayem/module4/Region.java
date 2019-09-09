package by.epam.ayem.module4;

/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

import java.util.ArrayList;
import java.util.List;

public class Region {

    private String name;
    private List<District> districts;
    private double area;
    private boolean part = false;

    public Region() {
    }

    public Region(String name, double square) {
        this.name = name;
        this.area = square;
        this.districts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isPart() {
        return part;
    }

    public void setPart(boolean part) {
        this.part = part;
    }
}
