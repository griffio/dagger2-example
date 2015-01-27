package griffio.planets;

import dagger.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TerrestrialPlanets$$Factory implements Factory<TerrestrialPlanets> {
  private final Provider<Planet> earthProvider;
  private final Provider<Planet> marsProvider;
  private final Provider<Planet> venusProvider;

  public TerrestrialPlanets$$Factory(Provider<Planet> earthProvider, Provider<Planet> marsProvider, Provider<Planet> venusProvider) {  
    assert earthProvider != null;
    this.earthProvider = earthProvider;
    assert marsProvider != null;
    this.marsProvider = marsProvider;
    assert venusProvider != null;
    this.venusProvider = venusProvider;
  }

  @Override
  public TerrestrialPlanets get() {  
    return new TerrestrialPlanets(earthProvider.get(), marsProvider.get(), venusProvider.get());
  }

  public static Factory<TerrestrialPlanets> create(Provider<Planet> earthProvider, Provider<Planet> marsProvider, Provider<Planet> venusProvider) {  
     return new TerrestrialPlanets$$Factory(earthProvider, marsProvider, venusProvider);
  }
}

