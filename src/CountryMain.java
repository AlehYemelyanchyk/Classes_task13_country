/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class CountryMain {

    public static void main(String[] args) {
        City brest = new City("Brest", true, false);
        City pinsk = new City("Pinsk", false, false);
        District brestDistrict = new District("Brest District", brest);
        District pinskDistrict = new District("Pinsk District", pinsk);
        Region brestRegion = new Region("Brest Region", 32_790.68, brestDistrict, pinskDistrict);

        City minsk = new City("Misnk", true, true);
        City barysaw = new City("Barysaw", false, false);
        District minskDistrict = new District("Minsk", minsk);
        District barysawDistrict = new District("Barysaw District", barysaw);
        Region minskRegion = new Region("Minsk Region", 39_912.35, minskDistrict, barysawDistrict);

        Region gomelRegion = new Region("Gomel Region",40_361.66);
        Region grodnoRegion = new Region("Grodno Region",25_118.07);
        Region mogilevRegion = new Region("Mogilev Region",29_079.01);
        Region vitebskRegion = new Region("Bitebsk Region",40_049.99);

        Country belarus = new Country("Belarus",
                brestRegion, minskRegion, gomelRegion, grodnoRegion, mogilevRegion, vitebskRegion);
        belarus.showCapital();
        belarus.regionsAmount();
        belarus.countArea();
        belarus.showRegionalCenters();
    }
}
