package griffio.planets;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableSortedSet;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

public class TerrestrialPlanets implements Iterable<Planet> {

    private Set<Planet> planets;

    @Inject
    public TerrestrialPlanets(@Named("Earth") Planet earth, @Named("Mars") Planet mars, @Named("Venus") Planet venus) {
        this.planets = ImmutableSortedSet.orderedBy(new PlanetSorter()).add(earth, mars, venus).build();
    }

    public Set<Planet> getPlanets() {
        return this.planets;
    }

    private static class PlanetSorter implements Comparator<Planet> {
        @Override
        public int compare(Planet a, Planet b) {
            return ComparisonChain.start().compare(a.au(), b.au()).result();
        }
    }

    @Override
    public Iterator<Planet> iterator() {
        return planets.iterator();
    }
}
