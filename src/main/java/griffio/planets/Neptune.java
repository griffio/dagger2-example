package griffio.planets;

public final class Neptune implements Planet {
    @Override
    public String names() {
        return "Neptune, Le Verrier's planet, The planet exterior to Uranus";
    }

    @Override
    public double au() {
        return 30.1;
    }

    @Override
    public int hashCode() {
        return Planets.hash(names(), au());
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Planet && Planets.isEqual(this, (Planet) other);
    }

}
