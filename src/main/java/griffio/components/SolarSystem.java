package griffio.components;

import dagger.Component;
import griffio.modules.TerrestrialPlanetsModule;
import griffio.planets.TerrestrialPlanets;

import javax.inject.Singleton;

@Singleton
@Component(modules = {TerrestrialPlanetsModule.class})
public interface SolarSystem {
    TerrestrialPlanets terrestrial();
}
