package models;

public class Books {
    String name;
    String author;
    int price;
    boolean isDiscounted;
    Genre genre;

public Books(String name, String author, int price, boolean isDiscounted, Genre genre) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.isDiscounted = isDiscounted;
    this.genre = genre;

    

}
}
