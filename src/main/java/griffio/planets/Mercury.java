package griffio.planets;

public final class Mercury implements Planet {
    @Override
    public String names() {
        return "Mercury";
    }

    @Override
    public double au() {
        return 0.45;
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
