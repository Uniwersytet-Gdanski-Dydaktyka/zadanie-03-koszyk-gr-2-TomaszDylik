package pl.javamarkt.cart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductSmokeTest {

    @Test
    void shouldCreateSimpleDomainObject() {
        Product product = new Product("CODE-001", "Kawa", 19.99);

        assertAll(
                () -> assertEquals("CODE-001", product.getCode()),
                () -> assertEquals("Kawa", product.getName()),
                () -> assertEquals(19.99, product.getPrice())
        );
    }
}
