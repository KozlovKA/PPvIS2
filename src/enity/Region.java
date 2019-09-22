package enity;

import java.util.Objects;
import java.util.Set;

public class Region {
    private String name;
    private Set<District> districts;

    public Region(String name, Set<District> districts) {
        this.name = name;
        this.districts = districts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<District> getDistricts() {
        return districts;
    }

    public void setDistricts(Set<District> districts) {
        this.districts = districts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Region)) return false;
        Region region = (Region) o;
        return getName().equals(region.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "{Область='" + name + ", " + districts + "}\n";
    }
}


