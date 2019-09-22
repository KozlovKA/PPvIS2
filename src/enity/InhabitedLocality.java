package enity;

import java.util.Objects;

public abstract class InhabitedLocality {

    private String name;
    private String type;
    private int population;
    private String district;

    public InhabitedLocality(String name, String type, int population, String district) {
        this.name = name;
        this.type = type;
        this.population = population;
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InhabitedLocality)) return false;
        InhabitedLocality that = (InhabitedLocality) o;
        return getPopulation() == that.getPopulation() &&
                getName().equals(that.getName()) &&
                getType().equals(that.getType()) &&
                getDistrict().equals(that.getDistrict());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getType(), getPopulation(), getDistrict());
    }

    @Override
    public String toString() {
        return "{Населенный пункт: " + name + '\'' +
                ", Тип населенного пункта: " + type + '\'' +
                ", Население: " + population + "}\n";
    }
}