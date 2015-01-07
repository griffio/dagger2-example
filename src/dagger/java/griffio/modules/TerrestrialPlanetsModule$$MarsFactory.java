package griffio.modules;

import dagger.Factory;
import griffio.planets.Mars;

import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TerrestrialPlanetsModule$$MarsFactory implements Factory<Mars> {
    private final TerrestrialPlanetsModule module;

    public TerrestrialPlanetsModule$$MarsFactory(TerrestrialPlanetsModule module) {
        assert module != null;
        this.module = module;
    }

    @Override
    public Mars get() {
        return module.mars();
    }
}

