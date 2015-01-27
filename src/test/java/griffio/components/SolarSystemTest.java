package griffio.components;

import griffio.planets.TerrestrialPlanets;
import org.junit.Assert;
import org.junit.Test;

public class SolarSystemTest {

    @Test
    public void terrestrial() throws Exception {
        SolarSystem solarSystem = Dagger_SolarSystem.builder().build();
        TerrestrialPlanets terrestrialPlanets = solarSystem.terrestrial();
        Assert.assertNotNull(terrestrialPlanets);
        Assert.assertTrue(terrestrialPlanets.getPlanets().size() == 3);
    }
}
