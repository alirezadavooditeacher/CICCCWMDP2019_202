package app.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product;

    @BeforeEach
    void setUp() {
        product = new Product(111, "Black cap", 10.0f, "China");
    }

    @Test
    void getName() {
        assertEquals("Black cap", product.getName());
    }

    @Test
    void getPrice() {
        assertEquals(10.0f, product.getPrice());
    }
}