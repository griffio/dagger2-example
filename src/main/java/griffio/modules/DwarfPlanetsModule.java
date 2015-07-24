package griffio.modules;

import dagger.Module;
import dagger.Provides;
import griffio.planets.*;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class DwarfPlanetsModule {

  @Provides
  @Singleton
  @Named("Ceres")
  DwarfPlanet first() {
    return new Ceres();
  }

  @Provides
  @Singleton
  @Named("Pluto")
  DwarfPlanet second() {
    return new Pluto();
  }

  @Provides
  @Singleton
  @Named("Haumea")
  DwarfPlanet third() {
    return new Haumea();
  }

  @Provides
  @Singleton
  @Named("MakeMake")
  DwarfPlanet fourth() {
    return new MakeMake();
  }

  @Provides
  @Singleton
  @Named("Eris")
  DwarfPlanet fifth() {
    return new Eris();
  }

}