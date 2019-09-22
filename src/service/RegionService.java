package service;

import enity.District;

import java.util.Set;

public interface RegionService {
    Set<District> getDistrictsByRegionName(Set<District> districts, String region);
}
