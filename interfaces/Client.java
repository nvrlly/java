package interfaces;

public class Client {
    void makeOrder(Waiter waiter, String dish) { // Принимает два параметра
        waiter.bringOrder(dish); // Передача названия блюда в качестве аргумента
    }
}
