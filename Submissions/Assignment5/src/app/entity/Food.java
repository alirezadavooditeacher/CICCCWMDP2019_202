package app.entity;

import java.util.List;

public class Food extends Product {
    Integer calorie;
    Integer size;
    List<String> ingredients;

    public Food(Integer id, String name, Float price, String madeInCountry, Integer calorie, Integer size, List<String> ingredients) {
        super(id, name, price, madeInCountry);
        this.calorie = calorie;
        this.size = size;
        this.ingredients = ingredients;
    }
}
