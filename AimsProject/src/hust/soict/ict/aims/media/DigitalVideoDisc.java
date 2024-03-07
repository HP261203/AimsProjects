package hust.soict.ict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
//    private int id;
//    private String title;
//    private String category;
//    private float cost;

    private static int nbDigitalVideoDisc = 0;

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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }
    public DigitalVideoDisc(String title) {
        this.title = title;
        this.nbDigitalVideoDisc++;
        this.id = this.nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.nbDigitalVideoDisc++;
        this.id = this.nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.nbDigitalVideoDisc++;
        this.id = this.nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.nbDigitalVideoDisc++;
        this.id = this.nbDigitalVideoDisc;
    }

    @Override
    public String toString() {
        return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost();
    }

    public boolean isMatch(String str) {
        if(this.getTitle() == str) return true;
        else return false;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD Length: " + this.getLength());
    }
}
