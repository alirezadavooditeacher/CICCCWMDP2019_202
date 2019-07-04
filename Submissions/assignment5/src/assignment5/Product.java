/**
 *
 */
package assignment5;

/**
 * @author miyamotoatsushi
 *
 */
public class Product {
    Integer prpductID;
    String ProductName;
    Float productPrice;
    String productMadelnCountry;

    public Product(Integer prpductID, String ProductName, Float productPrice, String productMadelnCountry) {
        this.prpductID = prpductID;
        this.ProductName = ProductName;
        this.productPrice = productPrice;
        this.productMadelnCountry = productMadelnCountry;
    }

    public Float getPrice() {
        return this.productPrice;
    }

    public String getName() {
        return this.ProductName;
    }
}
