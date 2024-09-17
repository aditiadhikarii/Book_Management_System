import models.BookOrders;
import models.Books;
import models.Genre;

public class Main {
    public static void main(String[] args) {

        Genre g1 = new Genre("Friction","Best Friction");
        System.out.println(g1.getDiscription());

        g1.setDiscription("This is my Fiction");

        System.out.println(g1.getDiscription());
        Books b1 = new Books();
        Books b2 = new Books();


        BookOrders bo1 = new BookOrders(bo1,5);
        BookOrders bo2 = new BookOrders(bo2,5);



    }
}