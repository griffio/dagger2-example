package griffio.components;

import dagger.Component;
import griffio.modules.TerrestrialPlanetsModule;
import griffio.planets.TerrestrialPlanets;

@Component(modules = TerrestrialPlanetsModule.class)
interface SolarSystem {

    TerrestrialPlanets terrestrialPlanets();

}
