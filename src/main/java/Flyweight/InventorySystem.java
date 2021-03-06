package Flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
    private final Portfolio portfolio = new Portfolio();
    private final List<Order> orders = new CopyOnWriteArrayList<Order>();

 public void executeOrder(String productName, int orderNumber) {
        Product product = portfolio.lookup(productName);
        Order order= new Order(orderNumber, product);
        orders.add(order);
    }

    public void process(){
        for (Order order: orders) {
            order.processOrder();
            orders.remove(order);
        }
    }

    public int getTotalProducts() {
        return portfolio.totalProductsMade();
    }
}
