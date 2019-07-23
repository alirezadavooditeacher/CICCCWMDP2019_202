package app.entity;

public class Product {
    private Integer id;
    private String name;
    private Float price;
    private String madeInCountry;

    public Product(Integer id, String name, Float price, String madeInCountry) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.madeInCountry = madeInCountry;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }
}
