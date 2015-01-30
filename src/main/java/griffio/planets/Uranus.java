package griffio.planets;

public final class Uranus implements Planet{
    @Override
    public String names() {
        return "Uranus, Ouranos, Georgium Sidus";
    }

    @Override
    public double au() {
        return 19.2;
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
