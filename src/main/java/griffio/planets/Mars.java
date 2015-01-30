package griffio.planets;

public class Mars implements Planet {
    @Override
    public String names() {
        return "Mars,Red Planet";
    }

    @Override
    public double au() {
        return 1.5;
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
