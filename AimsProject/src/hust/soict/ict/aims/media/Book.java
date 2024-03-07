package hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
//    private int id;
//    private String title;
//    private String category;
//    private float cost;
    private List<String> authors = new ArrayList<String>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public void addAuthor(String author) {
        boolean check = this.authors.contains(author);
        if(!check) {
            this.authors.add(author);
        }
    }

    public void removeAuthor(String author) {
        boolean check = this.authors.contains(author);
        if(check) {
            this.authors.remove(author);
        }
    }

    public Book(String title) {
        this.title = title;
    }
}
