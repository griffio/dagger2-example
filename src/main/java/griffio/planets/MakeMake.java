package griffio.planets;

public final class MakeMake implements DwarfPlanet {
    @Override
    public String names() {
        return "MakeMake";
    }

    @Override
    public double au() {
        return 45.79;
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
