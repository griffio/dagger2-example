package griffio.components;

import dagger.internal.ScopedProvider;
import griffio.modules.TerrestrialPlanetsModule;
import griffio.modules.TerrestrialPlanetsModule$$ForthFactory;
import griffio.modules.TerrestrialPlanetsModule$$SecondFactory;
import griffio.modules.TerrestrialPlanetsModule$$ThirdFactory;
import griffio.planets.Planet;
import griffio.planets.TerrestrialPlanets;
import griffio.planets.TerrestrialPlanets$$Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Dagger_SolarSystem implements SolarSystem {
  private final TerrestrialPlanetsModule terrestrialPlanetsModule;
  private Provider<Planet> thirdProvider;
  private Provider<Planet> forthProvider;
  private Provider<Planet> secondProvider;
  private Provider<TerrestrialPlanets> terrestrialPlanetsProvider;

  private Dagger_SolarSystem(Builder builder) {  
    assert builder != null;
    this.terrestrialPlanetsModule = builder.terrestrialPlanetsModule;
    initialize();
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static SolarSystem create() {  
    return builder().build();
  }

  private void initialize() {  
    this.thirdProvider = ScopedProvider.create(new TerrestrialPlanetsModule$$ThirdFactory(terrestrialPlanetsModule));
    this.forthProvider = ScopedProvider.create(new TerrestrialPlanetsModule$$ForthFactory(terrestrialPlanetsModule));
    this.secondProvider = ScopedProvider.create(new TerrestrialPlanetsModule$$SecondFactory(terrestrialPlanetsModule));
    this.terrestrialPlanetsProvider = TerrestrialPlanets$$Factory.create(thirdProvider, forthProvider, secondProvider);
  }

  @Override
  public TerrestrialPlanets terrestrial() {  
    return terrestrialPlanetsProvider.get();
  }

  public static final class Builder {
    private TerrestrialPlanetsModule terrestrialPlanetsModule;
  
    private Builder() {  
    }
  
    public SolarSystem build() {  
      if (terrestrialPlanetsModule == null) {
        this.terrestrialPlanetsModule = new TerrestrialPlanetsModule();
      }
      return new Dagger_SolarSystem(this);
    }
  
    public Builder terrestrialPlanetsModule(TerrestrialPlanetsModule terrestrialPlanetsModule) {  
      if (terrestrialPlanetsModule == null) {
        throw new NullPointerException("terrestrialPlanetsModule");
      }
      this.terrestrialPlanetsModule = terrestrialPlanetsModule;
      return this;
    }
  }
}

