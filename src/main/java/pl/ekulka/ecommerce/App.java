package pl.ekulka.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.ekulka.ecommerce.catalog.ProductCatalog;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("Jazda");
        SpringApplication.run(App.class, args);
    }

    @Bean
    ProductCatalog createMyProductCatalog() {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.addProduct("Lego set 1", "Nice one");
        productCatalog.addProduct("Cobi set 2", "Nice one");

        return productCatalog;
    }
}
