package griffio;

import griffio.components.DaggerSolarSystem;
import griffio.components.SolarSystem;
import griffio.planets.OuterPlanets;
import griffio.planets.Planet;
import griffio.planets.TerrestrialPlanets;

public class MainApplication {

    public static void main(String[] args) {
        SolarSystem solarSystem = DaggerSolarSystem.builder().build();
        TerrestrialPlanets terrestrialPlanets = solarSystem.terrestrial();
        for (Planet planet : terrestrialPlanets) {
            System.out.println(String.format("%s is %.2f au from Sun", planet.names(), planet.au()));
        }

        OuterPlanets outerPlanets = solarSystem.outer();
        for (Planet planet : outerPlanets) {
            System.out.println(String.format("%s is %.2f au from Sun", planet.names(), planet.au()));
        }
    }

}
