package griffio.planets;

import dagger.Factory;

import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TerrestrialPlants$$Factory implements Factory<TerrestrialPlanets> {
    private final Provider<Earth> earthProvider;
    private final Provider<Mars> marsProvider;
    private final Provider<Venus> venusProvider;

    public TerrestrialPlants$$Factory(Provider<Earth> earthProvider, Provider<Mars> marsProvider, Provider<Venus> venusProvider) {
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
}

