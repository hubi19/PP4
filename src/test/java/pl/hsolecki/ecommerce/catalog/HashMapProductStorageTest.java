package pl.hsolecki.ecommerce.catalog;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class HashMapProductStorageTest {

    @Test
    void itAllowToStoreProduct() {
        Product product = thereIsExampleProduct();

        ProductStorage hasMapStorage = thereIsExampleHashMapStorage();

        hasMapStorage.addProduct(product);

        List<Product> products = hasMapStorage.allProducts();
        assertThat(products)
                .hasSize(1)
                .extracting(Product::getName)
                .contains("test-it");



    }

    private ProductStorage thereIsExampleHashMapStorage() {
        return new HashMapProductStorage();
    }

    private Product thereIsExampleProduct() {
        return new Product(UUID.randomUUID(), "test-it", "test");
    }

    @Test
    void itAllowsToLoadAllProduct() {

    }

    @Test
    void itAllowsToLoadProductById() {

    }
}