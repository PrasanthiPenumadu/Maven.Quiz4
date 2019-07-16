package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    List<Spice> spices=new ArrayList<>();
    public List<Spice> getAllSpices() {
        return this.spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
       // spice.get()
        return null;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
