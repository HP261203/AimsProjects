package hust.soict.ict.aims.media;

public abstract class Media {
    protected int id;
    protected static int nbMedia = 0;
    protected String title;
    protected String category;
    protected float cost;

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
    public Media() {
        this.nbMedia++;
        this.id = this.nbMedia;
    }
    @Override
    public String toString() {
        return "ID " + this.id + " Title: " + this.title + " Category: " + this.category;
    }
}
