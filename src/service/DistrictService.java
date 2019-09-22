package service;

import enity.InhabitedLocality;

import java.util.Set;

public interface DistrictService {
    Set<InhabitedLocality> getInhabitedLocalitiesByDistrict(Set<InhabitedLocality> inhabitedLocalities, String district);
}
