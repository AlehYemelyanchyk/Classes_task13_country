package by.epam.ayem.module4;

/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class District {

    private String name;
    private City city;
    private boolean exist = false;

    public District(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        if (!city.isExist()) {
            this.city = city;
            city.setExist(true);
        } else {
            System.out.println("The city " + city.getName() + " already exists is another district.");
        }
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    @Override
    public String toString() {
        return name + " with " + city + " as the district center";
    }
}
