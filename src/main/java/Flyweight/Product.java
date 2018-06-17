package Flyweight;

/**
 * Object to be kept in cache.
 */
public class Product {
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
