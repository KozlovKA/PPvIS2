package enity.inhabitedLocality;

import enity.InhabitedLocality;

public class City extends InhabitedLocality {

    private static final String TYPE = "Город";

    public City(String name, int population, String district) {
        super(name, TYPE, population, district);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
