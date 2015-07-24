package griffio.planets;

public final class Haumea implements DwarfPlanet {
    @Override
    public String names() {
        return "Haumea";
    }

    @Override
    public double au() {
        return 43.13;
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
