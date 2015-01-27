package griffio.modules;

import dagger.Factory;
import griffio.planets.Planet;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TerrestrialPlanetsModule$$SecondFactory implements Factory<Planet> {
  private final TerrestrialPlanetsModule module;

  public TerrestrialPlanetsModule$$SecondFactory(TerrestrialPlanetsModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Planet get() {  
    return module.second();
  }
}

