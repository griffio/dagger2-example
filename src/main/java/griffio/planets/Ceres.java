package griffio.planets;

public final class Ceres implements DwarfPlanet {
    @Override
    public String names() {
        return "Ceres";
    }

    @Override
    public double au() {
        return 2.77;
    }

    @Override
    public int hashCode() {
        return Planets.hash(names(), au());
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof DwarfPlanet && Planets.isEqual(this, (DwarfPlanet) other);
    }
}
