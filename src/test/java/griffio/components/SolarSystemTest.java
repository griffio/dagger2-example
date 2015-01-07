package griffio.components;

import griffio.planets.TerrestrialPlanets;
import org.junit.Test;

public class SolarSystemTest {

    @Test
    public void terrestrial() throws Exception {
        SolarSystem solarSystem = Dagger_SolarSystem.builder().build();
        TerrestrialPlanets terrestrialPlanets = solarSystem.terrestrialPlanets();

    }
}
