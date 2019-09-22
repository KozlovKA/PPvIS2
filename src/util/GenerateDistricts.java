package util;

import enity.District;
import enity.InhabitedLocality;
import service.DistrictService;
import service.impl.DistrictServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class GenerateDistricts {

    private static DistrictService districtService = new DistrictServiceImpl();

    public static Set<District> generateDistricts(Set<InhabitedLocality> inhabitedLocalities) {
        Set<District> districts = new HashSet<>();

        districts.add(new District("Минский", "Минская", new HashSet<>()));
        districts.add(new District("Могилевский", "Могилевская", new HashSet<>()));
        districts.add(new District("Брестский", "Брестская", new HashSet<>()));
        districts.add(new District("Белыничский", "Могилевская", new HashSet<>()));
        districts.add(new District("Кобринский", "Брестская", new HashSet<>()));

        for (District district : districts) {
            for (InhabitedLocality locality : inhabitedLocalities) {
                if (district.getName().equals(locality.getDistrict())) {
                    district.setInhabitedLocalities(districtService.getInhabitedLocalitiesByDistrict(inhabitedLocalities, district.getName()));
                }
            }
        }
        return districts;
    }

}
