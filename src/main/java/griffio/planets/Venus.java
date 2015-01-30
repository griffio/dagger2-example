package griffio.planets;

public final class Venus implements Planet {
    @Override
    public String names() {
        return "Venus,Sister Planet";
    }

    @Override
    public double au() {
        return 0.7;
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
