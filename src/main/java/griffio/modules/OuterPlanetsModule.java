package griffio.modules;

import dagger.Module;
import dagger.Provides;
import griffio.planets.Jupiter;
import griffio.planets.Neptune;
import griffio.planets.Planet;
import griffio.planets.Saturn;
import griffio.planets.Uranus;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class OuterPlanetsModule {

    @Provides
    @Singleton
    @Named("Jupiter")
    Planet fifth() {
        return new Jupiter();
    }

    @Provides
    @Singleton
    @Named("Saturn")
    Planet sixth() {
        return new Saturn();
    }

    @Provides
    @Singleton
    @Named("Uranus")
    Planet seventh() {
        return new Uranus();
    }

    @Provides
    @Singleton
    @Named("Neptune")
    Planet eighth() {
        return new Neptune();
    }

}