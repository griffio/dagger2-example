package griffio.modules;

import dagger.Factory;
import griffio.planets.Venus;

import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TerrestrialPlanetsModule$$VenusFactory implements Factory<Venus> {
    private final TerrestrialPlanetsModule module;

    public TerrestrialPlanetsModule$$VenusFactory(TerrestrialPlanetsModule module) {
        assert module != null;
        this.module = module;
    }

    @Override
    public Venus get() {
        return module.venus();
    }
}

