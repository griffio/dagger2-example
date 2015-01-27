package griffio.planets;

public class Venus implements Planet {
    @Override
    public String names() {
        return "Venus,Sister Planet";
    }

    @Override
    public double au() {
        return 0.7;
    }
}
