package by.epam.ayem.module4;

/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class RegionService {

    private Region region;

    public RegionService(Region region) {
        this.region = region;
    }

    public void addDistrict(District district) {
        if (!district.isExist()) {
            region.getDistricts().add(district);
            district.setExist(true);
        } else {
            System.out.println("The district is already part of another region.");
        }
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        if (!region.isPart()) {
            this.region = region;
            region.setPart(true);
        } else {
            System.out.println("The region is already exists.");
        }
    }
}
