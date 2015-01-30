package griffio.planets;

import com.google.common.collect.ImmutableSortedSet;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Iterator;
import java.util.Set;

public class OuterPlanets implements Iterable<Planet> {

    private Set<Planet> planets;

    @Inject
    public OuterPlanets(@Named("Jupiter") Planet jupiter, @Named("Neptune") Planet neptune, @Named("Saturn") Planet saturn, @Named("Uranus") Planet uranus) {
        this.planets = ImmutableSortedSet.orderedBy(new Planets()).add(neptune, saturn, uranus, jupiter).build();
    }

    public Set<Planet> getPlanets() {
        return this.planets;
    }

    @Override
    public Iterator<Planet> iterator() {
        return getPlanets().iterator();
    }
}
