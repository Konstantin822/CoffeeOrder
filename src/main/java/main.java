import coffee.order.CoffeeOrderBoard;
import coffee.order.Order;

public class main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        Order order1 = new Order("Bob");
        Order order2 = new Order("John");
        Order order3 = new Order("Jane");

        coffeeOrderBoard.add(order1);
        coffeeOrderBoard.add(order2);
        coffeeOrderBoard.add(order3);

        System.out.println("Orders ");
        coffeeOrderBoard.draw();
        System.out.println();

        System.out.println("Deliver order ");
        coffeeOrderBoard.deliver();
        System.out.println();

        System.out.println("Orders ");
        coffeeOrderBoard.draw();
        System.out.println();

        System.out.println("Deliver order ");
        int orderNumber = 2;
        coffeeOrderBoard.deliver(orderNumber);
        System.out.println();

        System.out.println("Orders ");
        coffeeOrderBoard.draw();
    }
}
