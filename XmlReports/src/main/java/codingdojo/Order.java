package codingdojo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Order {

    private final String id;
    private final LocalDateTime date;
    private final Collection<Product> products = new ArrayList<>();
    private final Store store;

    public Order(String id, LocalDateTime date, Store store, Product[] products) {
        this.id = id;
        this.date = date;
        this.store = store;
        addProducts(products);
    }

    public double totalDollars() {
        return products.stream(). //
                mapToDouble(product -> product.getPrice().getAmountInCurrency("USD")). //
                sum();
    }

    @Override
    public String toString() {
        return "Order{" + id + '}';
    }

    public void saveToDatabase() {
        throw new UnsupportedOperationException("missing from this exercise - shouldn't be called from a unit test");
    }

    public String getId() {
        return id;
    }

    public Collection<Product> getProducts() {
        return Collections.unmodifiableCollection(products);
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void addProducts(Product... products) {
        this.products.addAll(Arrays.asList(products));
    }

    public Store getStore() {
        return store;
    }
}
