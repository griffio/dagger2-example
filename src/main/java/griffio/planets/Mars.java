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

}
