package util;

import enity.InhabitedLocality;
import enity.inhabitedLocality.City;
import enity.inhabitedLocality.Village;

import java.util.HashSet;
import java.util.Set;

public class GenerateInhabitedLocality {
    public static Set<InhabitedLocality> generateInhabitedLocalities() {
        Set<InhabitedLocality> inhabitedLocalities = new HashSet<>();
        inhabitedLocalities.add(new City("Минск", 2000000000, "Минский"));
        inhabitedLocalities.add(new City("Могилев", 1000000000, "Могилевский"));
        inhabitedLocalities.add(new Village("Бушкаво", 100, "Могилевский"));
        inhabitedLocalities.add(new City("Белыничи", 2000000000, "Белыничский"));
        inhabitedLocalities.add(new City("Кобрин", 100, "Кобринский"));

        return inhabitedLocalities;
    }
}
