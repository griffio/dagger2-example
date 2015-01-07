package griffio.modules;

import dagger.Factory;
import griffio.planets.Earth;

import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TerrestrialPlanetsModule$$EarthFactory implements Factory<Earth> {
    private final TerrestrialPlanetsModule module;

    public TerrestrialPlanetsModule$$EarthFactory(TerrestrialPlanetsModule module) {
        assert module != null;
        this.module = module;
    }

    @Override
    public Earth get() {
        return module.earth();
    }
}

