package enity.inhabitedLocality;

import enity.InhabitedLocality;

public class Village extends InhabitedLocality {

    private static final String TYPE = "Деревня";

    public Village(String name, int population, String district) {
        super(name, TYPE, population, district);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
