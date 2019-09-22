import enity.District;
import enity.InhabitedLocality;
import enity.Region;

import java.util.HashSet;
import java.util.Set;

import static util.GenerateDistricts.generateDistricts;
import static util.GenerateInhabitedLocality.generateInhabitedLocalities;
import static util.GenerateRegions.generateDistricts;

public class Main {
    public static void main(String[] args) {
        Set<InhabitedLocality> inhabitedLocalities = new HashSet<>(generateInhabitedLocalities());
        Set<District> districts = new HashSet<>(generateDistricts(inhabitedLocalities));
        Set<Region> regions = new HashSet<>(generateDistricts(districts));
        System.out.println(regions);
    }
}
