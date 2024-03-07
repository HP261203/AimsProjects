package hust.soict.ict.aims.media;

import java.util.Objects;

public class Track implements Playable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Play Track: " + this.getTitle());
        System.out.println("Track Length: " + this.getLength());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else if(!(o instanceof Track t)) return false;
        else return this.getTitle().equals(t.getTitle()) && this.getLength() == t.getLength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, length);
    }
}
