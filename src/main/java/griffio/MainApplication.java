package griffio;

import griffio.components.Dagger_SolarSystem;
import griffio.components.SolarSystem;
import griffio.planets.Planet;
import griffio.planets.TerrestrialPlanets;

import java.util.Set;

public class MainApplication {

    public static void main(String[] args) {
        SolarSystem solarSystem = Dagger_SolarSystem.builder().build();
        TerrestrialPlanets terrestrial = solarSystem.terrestrial();
        Set<Planet> planets = terrestrial.getPlanets();
        for (Planet planet : planets) {
           System.out.println(String.format("%s is %f au from Sun", planet.names(), planet.au()));
        }
    }

}
