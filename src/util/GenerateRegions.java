package util;

import enity.District;
import enity.Region;
import service.RegionService;
import service.impl.RegionServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class GenerateRegions {

    private static RegionService regionService = new RegionServiceImpl();

    public static Set<Region> generateDistricts(Set<District> districts) {
        Set<Region> regions = new HashSet<>();
        regions.add(new Region("Минская", new HashSet<>()));
        regions.add(new Region("Могилевская", new HashSet<>()));
        regions.add(new Region("Брестская", new HashSet<>()));

        for (Region region : regions) {
            for (District district : districts) {
                if (region.getName().equals(district.getRegion())) {
                    region.setDistricts(regionService.getDistrictsByRegionName(districts, region.getName()));
                }
            }
        }

        return regions;
    }
}
