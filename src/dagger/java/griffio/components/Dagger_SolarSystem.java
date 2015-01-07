package griffio.components;

import griffio.modules.TerrestrialPlanetsModule;
import griffio.modules.TerrestrialPlanetsModule$$EarthFactory;
import griffio.modules.TerrestrialPlanetsModule$$MarsFactory;
import griffio.modules.TerrestrialPlanetsModule$$VenusFactory;
import griffio.planets.*;

import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Dagger_SolarSystem implements SolarSystem {
    private final TerrestrialPlanetsModule terrestrialPlanetsModule;
    private Provider<Earth> earthProvider;
    private Provider<Mars> marsProvider;
    private Provider<Venus> venusProvider;
    private Provider<TerrestrialPlanets> terrestrialPlantsProvider;

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
        this.earthProvider = new TerrestrialPlanetsModule$$EarthFactory(terrestrialPlanetsModule);
        this.marsProvider = new TerrestrialPlanetsModule$$MarsFactory(terrestrialPlanetsModule);
        this.venusProvider = new TerrestrialPlanetsModule$$VenusFactory(terrestrialPlanetsModule);
        this.terrestrialPlantsProvider = new TerrestrialPlants$$Factory(earthProvider, marsProvider, venusProvider);
    }

    @Override
    public TerrestrialPlanets terrestrialPlanets() {
        return terrestrialPlantsProvider.get();
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

