package enity;

import java.util.Objects;
import java.util.Set;

public class District {
    private String name;
    private String region;
    private Set<InhabitedLocality> inhabitedLocalities;


    public District(String name, String region, Set<InhabitedLocality> inhabitedLocalities) {
        this.name = name;
        this.region = region;
        this.inhabitedLocalities = inhabitedLocalities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<InhabitedLocality> getInhabitedLocalities() {
        return inhabitedLocalities;
    }

    public void setInhabitedLocalities(Set<InhabitedLocality> inhabitedLocalities) {
        this.inhabitedLocalities = inhabitedLocalities;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof District)) return false;
        District district = (District) o;
        return getName().equals(district.getName()) &&
                getRegion().equals(district.getRegion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRegion());
    }

    @Override
    public String toString() {
        return "{Район: " + name +
                ", " + inhabitedLocalities + "}\n";

    }
}
