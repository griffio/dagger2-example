package griffio.modules;

import dagger.Module;
import dagger.Provides;
import griffio.planets.Earth;
import griffio.planets.Mars;
import griffio.planets.Venus;

@Module
public class TerrestrialPlanetsModule {

    @Provides
    public Earth earth() {
        return new Earth();
    }

    @Provides
    public Mars mars() {
        return new Mars();
    }

    @Provides
    public Venus venus() {
        return new Venus();
    }

}