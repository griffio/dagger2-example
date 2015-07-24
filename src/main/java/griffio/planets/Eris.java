package griffio.planets;

public final class Eris implements DwarfPlanet {
    @Override
    public String names() {
        return "Eris";
    }

    @Override
    public double au() {
        return 67.67;
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
