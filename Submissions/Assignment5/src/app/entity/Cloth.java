package app.entity;

import java.util.List;

public class Cloth extends Product {
    List<Material> materials;

    public Cloth(Integer id, String name, Float price, String madeInCountry, List<Material> materials) {
        super(id, name, price, madeInCountry);
        this.materials = materials;
    }
}
