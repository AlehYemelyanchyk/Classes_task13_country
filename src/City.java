/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class City {

    private String name;
    private boolean regionalCenter;
    private boolean capital;

    public City(String name, boolean regionalCenter, boolean capital) {
        this.name = name;
        this.regionalCenter = regionalCenter;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(boolean regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }
}
