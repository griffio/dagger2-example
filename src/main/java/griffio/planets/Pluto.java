package griffio.planets;

public final class Pluto implements DwarfPlanet {
    @Override
    public String names() {
        return "Pluto";
    }

    @Override
    public double au() {
        return 39.48;
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
