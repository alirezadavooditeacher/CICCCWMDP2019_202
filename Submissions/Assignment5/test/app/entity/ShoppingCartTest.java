package app.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @AfterEach
    void tearDown() {
        cart = null;
    }

    @Test
    void calculateTotalPrice() {
        Product stuff = new Product(111, "Shitish", 10.6f, "Japan");
        cart.addItem(stuff);
        cart.addItem(stuff);
        cart.addItem(stuff);
        cart.addItem(stuff);
        cart.addItem(stuff);

        assertEquals(53.0f, cart.calculateTotalPrice());
    }
}