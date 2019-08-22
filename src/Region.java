/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class Region {

    private String name;
    private District [] districts;
    private double area;

    public Region(String name, double square, District ... district) {
        this.name = name;
        this.area = square;
        this.districts = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public District [] getDistricts() {
        return districts;
    }

    public void setDistricts(District [] districts) {
        this.districts = districts;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
