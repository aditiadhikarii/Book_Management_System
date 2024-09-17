package models;

import java.util.ArrayList;

public class Order {
    int orderId;

    ArrayList<BookOrders>BookOrders;

public Order() {
    BookOrders = new ArrayList<>();

}
public int getOrderId() {
    return orderId;

}
public void setOrderId(int orderId) {
    this.orderId = orderId;

}
public ArrayList<BookOrders> getBookOrders() {
    return BookOrders;

}
public void setBookOrders(ArrayList<BookOrders> bookOrders) {
    this.BookOrders = bookOrders;
}
}

