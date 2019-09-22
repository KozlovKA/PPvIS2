package service.impl;

import enity.District;
import service.RegionService;

import java.util.HashSet;
import java.util.Set;

public class RegionServiceImpl implements RegionService {

    @Override
    public Set<District> getDistrictsByRegionName(Set<District> districts, String region) {

        Set<District> districtsByRegionName = new HashSet<>();

        for (District district : districts) {
            if (district.getRegion().equals(region)) {
                districtsByRegionName.add(district);
            }
        }
        return districtsByRegionName;
    }
}
