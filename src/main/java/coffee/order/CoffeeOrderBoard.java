package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    public List<Order> orders;

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
    }

    public void add(Order order) {
        int orderNumber = orders.size() + 1;
        order.setNumber(orderNumber);
        orders.add(order);
    }

    public void deliver() {
        if(!orders.isEmpty()) {
            Order nextOrder = orders.get(0);
            System.out.println("Order # " + nextOrder.getNumber() + " for " + nextOrder.getName());
            orders.remove(0);
        } else {
            System.out.println("No orders");
        }
    }

    public void deliver(int orderNumber) {
        Order foundOrder = null;
        for (Order order : orders) {
            if (order.getNumber() == orderNumber) {
                foundOrder = order;
                break;
            }
        }
        if (foundOrder != null) {
            System.out.println("Order # " + foundOrder.getNumber() + " for " + foundOrder.getName());
            orders.remove(foundOrder);
        } else {
            System.out.println("No order");
        }
    }

    public void draw() {
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getName());
        }
    }
}
