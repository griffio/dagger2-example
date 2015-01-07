package griffio.planets;

import javax.inject.Inject;

public class TerrestrialPlanets {

    private final Earth earth;
    private final Mars mars;
    private final Venus venus;

    @Inject
    public TerrestrialPlanets(Earth earth, Mars mars, Venus venus) {
        this.earth = earth;
        this.mars = mars;
        this.venus = venus;
    }

    public Earth getEarth() {
        return earth;
    }

    public Mars getMars() {
        return mars;
    }

    public Venus getVenus() {
        return venus;
    }
}
