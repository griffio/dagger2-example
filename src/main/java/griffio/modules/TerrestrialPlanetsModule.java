package griffio.modules;

import dagger.Module;
import dagger.Provides;
import griffio.planets.Earth;
import griffio.planets.Mars;
import griffio.planets.Mercury;
import griffio.planets.Planet;
import griffio.planets.Venus;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class TerrestrialPlanetsModule {

    @Provides
    @Singleton
    @Named("Mercury")
    Planet first() {
        return new Mercury();
    }

    @Provides
    @Singleton
    @Named("Venus")
    Planet second() {
        return new Venus();
    }

    @Provides
    @Singleton
    @Named("Earth")
    Planet third() {
        return new Earth();
    }

    @Provides
    @Singleton
    @Named("Mars")
    Planet forth() {
        return new Mars();
    }

}