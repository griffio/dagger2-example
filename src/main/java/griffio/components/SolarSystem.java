package griffio.components;

import dagger.Component;
import griffio.modules.OuterPlanetsModule;
import griffio.modules.TerrestrialPlanetsModule;
import griffio.planets.OuterPlanets;
import griffio.planets.TerrestrialPlanets;

import javax.inject.Singleton;

@Singleton
@Component(modules = {TerrestrialPlanetsModule.class, OuterPlanetsModule.class})
public interface SolarSystem {
    TerrestrialPlanets terrestrial();
    OuterPlanets outer();
}
