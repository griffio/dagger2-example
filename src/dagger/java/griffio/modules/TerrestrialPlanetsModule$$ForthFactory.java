package griffio.modules;

import dagger.Factory;
import griffio.planets.Planet;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TerrestrialPlanetsModule$$ForthFactory implements Factory<Planet> {
  private final TerrestrialPlanetsModule module;

  public TerrestrialPlanetsModule$$ForthFactory(TerrestrialPlanetsModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Planet get() {  
    return module.forth();
  }
}

