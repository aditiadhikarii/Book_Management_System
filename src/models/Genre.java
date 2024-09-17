package models;

import java.util.ArrayList;

public class Genre {

    String name;

    String discription;

    public Genre(String name, String discription) {
        this.name = name;
        this.discription = discription;
    }
    public String getName() {
        return name;

    }
public void setName(String name) {
        this.name = name;
}
public String getDiscription() {
        return discription;
}
public void setDiscription(String discription) {
        this.discription = discription;
}



}


