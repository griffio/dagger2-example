package griffio.components;

import com.google.common.truth.Truth;
import griffio.planets.Earth;
import griffio.planets.Jupiter;
import griffio.planets.Mars;
import griffio.planets.Neptune;
import griffio.planets.OuterPlanets;
import griffio.planets.Saturn;
import griffio.planets.TerrestrialPlanets;
import griffio.planets.Uranus;
import griffio.planets.Venus;
import org.junit.Before;
import org.junit.Test;

public class SolarSystemTest {

    private SolarSystem solarSystem;

    @Before
    public void setUp() throws Exception {
        solarSystem = Dagger_SolarSystem.builder().build();
    }

    @Test
    public void terrestrial() throws Exception {
        TerrestrialPlanets terrestrialPlanets = solarSystem.terrestrial();
        Truth.ASSERT.that(terrestrialPlanets).containsExactly(new Venus(), new Earth(), new Mars()).inOrder();
    }

    @Test
    public void outer() throws Exception {
        OuterPlanets outerPlanets = solarSystem.outer();
        Truth.ASSERT.that(outerPlanets).containsExactly(new Jupiter(), new Saturn(), new Uranus(), new Neptune()).inOrder();
    }
}
