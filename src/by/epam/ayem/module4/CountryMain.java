package by.epam.ayem.module4;

/**
 * @author Aleh Yemelyanchyk on 9/19/2019.
 */
/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы:
вывести на консоль столицу, количество областей, площадь, областные центры.*/

import by.epam.ayem.module4.model.City;
import by.epam.ayem.module4.model.Country;
import by.epam.ayem.module4.model.District;
import by.epam.ayem.module4.model.Region;
import by.epam.ayem.module4.service.CountryService;

public class CountryMain {

    public static void main(String[] args) {
        Country belarus = new Country("Belarus");

        Region brestRegion = new Region("Brest Region", 32_790.68, belarus);
        Region minskRegion = new Region("Minsk Region", 39_912.35, belarus);
        Region gomelRegion = new Region("Gomel Region", 40_361.66, belarus);
        Region grodnoRegion = new Region("Grodno Region", 25_118.07, belarus);
        Region mogilevRegion = new Region("Mogilev Region", 29_079.01, belarus);
        Region vitebskRegion = new Region("Vitebsk Region", 40_049.99, belarus);

        District brestDistrict = new District("Brest District", brestRegion);
        District pinskDistrict = new District("Pinsk District", brestRegion);
        District minskDistrict = new District("Minsk District", minskRegion);
        District barysawDistrict = new District("Barysaw District", minskRegion);

        City minsk = new City("Minsk", minskDistrict);
        City brest = new City("Brest", brestDistrict);
        City pinsk = new City("Pinsk", brestDistrict);
        City barysaw = new City("Barysaw", minskDistrict);

        belarus.setCapital(minsk);
        brestRegion.setRegionalCenter(brest);
        minskRegion.setRegionalCenter(minsk);

        CountryService countryService = new CountryService();
        countryService.addRegion(gomelRegion,belarus);
        countryService.addRegion(grodnoRegion,belarus);
        countryService.addRegion(minskRegion,belarus);
        countryService.addRegion(mogilevRegion,belarus);
        countryService.addRegion(vitebskRegion,belarus);
        countryService.addRegion(brestRegion,belarus);


        countryService.showCapital(belarus);
        countryService.showRegionsAmount(belarus);
        countryService.showCountryArea(belarus);
        countryService.showRegionalCenters(belarus);

    }
}
