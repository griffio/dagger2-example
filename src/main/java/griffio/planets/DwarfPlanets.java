package griffio.planets;

import com.google.common.collect.ImmutableSortedSet;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Iterator;
import java.util.Set;

/**
 * https://en.wikipedia.org/wiki/Dwarf_planet
 */
public class DwarfPlanets implements Iterable<Planet> {

  private Set<Planet> dwarfPlanets;

  @Inject
  public DwarfPlanets(@Named("Ceres") DwarfPlanet ceres, @Named("Eris") DwarfPlanet eris, @Named("Haumea") DwarfPlanet haumea,
                      @Named("MakeMake") DwarfPlanet makeMake, @Named("Pluto") DwarfPlanet pluto) {
    this.dwarfPlanets = ImmutableSortedSet.orderedBy(new Planets()).add(ceres, eris, haumea, makeMake, pluto).build();
  }

  public Set<Planet> getDwarfPlanets() {
    return this.dwarfPlanets;
  }

  @Override
  public Iterator<Planet> iterator() {
    return getDwarfPlanets().iterator();
  }
}
