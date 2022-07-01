package dojo.supermarket.model;

import java.util.HashMap;
import java.util.Map;

public class FakeCatalog implements SupermarketCatalog {

    private final Map<Product, Double> prices = new HashMap<>();

    @Override
    public void addProduct(Product product, double price) {
        prices.put(product, price);
    }

    @Override
    public double getUnitPrice(Product product) {
        return prices.get(product);
    }
}
