package griffio.planets;

public class Earth implements Planet {
    @Override
    public String names() {
        return "Earth,Gaia,Terra";
    }

    @Override
    public double au() {
        return 1.0;
    }
}
