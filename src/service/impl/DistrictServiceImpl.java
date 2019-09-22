package service.impl;

import enity.InhabitedLocality;
import service.DistrictService;

import java.util.HashSet;
import java.util.Set;

public class DistrictServiceImpl implements DistrictService {

    @Override
    public Set<InhabitedLocality> getInhabitedLocalitiesByDistrict(Set<InhabitedLocality> inhabitedLocalities, String district) {

        Set<InhabitedLocality> locationByDistrict = new HashSet<>();

        for (InhabitedLocality location : inhabitedLocalities) {
            if (location.getDistrict().equals(district)) {
                locationByDistrict.add(location);
            }

        }
        return locationByDistrict;
    }
}
