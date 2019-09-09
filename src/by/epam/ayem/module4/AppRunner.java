package by.epam.ayem.module4;

/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class AppRunner {

    public static void main(String[] args) {
        City brest = new City("Brest", true, false);
        City pinsk = new City("Pinsk", false, false);
        District brestDistrict = new District("Brest District");
        District pinskDistrict = new District("Pinsk District");
        Region brestRegion = new Region("Brest Region", 32_790.68);

        RegionService brestRegionService = new RegionService(brestRegion);
        brestDistrict.setCity(brest);
        pinskDistrict.setCity(pinsk);
        brestRegionService.addDistrict(brestDistrict);
        brestRegionService.addDistrict(pinskDistrict);

        City minsk = new City("Minsk", true, true);
        City barysaw = new City("Barysaw", false, false);
        District minskDistrict = new District("Minsk District");
        District barysawDistrict = new District("Barysaw District");
        Region minskRegion = new Region("Minsk Region", 39_912.35);

        RegionService minskRegionService = new RegionService(minskRegion);
        minskDistrict.setCity(minsk);
        barysawDistrict.setCity(barysaw);
        minskRegionService.addDistrict(minskDistrict);
        minskRegionService.addDistrict(barysawDistrict);


        Region gomelRegion = new Region("Gomel Region", 40_361.66);
        Region grodnoRegion = new Region("Grodno Region", 25_118.07);
        Region mogilevRegion = new Region("Mogilev Region", 29_079.01);
        Region vitebskRegion = new Region("Vitebsk Region", 40_049.99);

        Country belarus = new Country("Belarus");

        CountryService countryService = new CountryService();
        countryService.addCountry(belarus);
        countryService.addRegion(gomelRegion);
        countryService.addRegion(grodnoRegion);
        countryService.addRegion(minskRegion);
        countryService.addRegion(mogilevRegion);
        countryService.addRegion(vitebskRegion);
        countryService.addRegion(brestRegion);

        countryService.showCapital();
        countryService.regionsAmount();
        countryService.countArea();
        countryService.showRegionalCenters();
    }
}
