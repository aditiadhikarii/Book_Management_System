package models;

public class BookOrders {
    int quantity;
    Books book;

    public BookOrders(int quantity, Books book) {
        this.quantity = quantity;
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Books getBook() {
        return book;
    }

}
