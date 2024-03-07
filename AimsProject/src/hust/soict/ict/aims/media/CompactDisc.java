package hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    List<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTrack(Track T) {
        boolean check = this.contains(T);
        if(!check) this.tracks.add(T);
        System.out.println("A track has been added");
    }

    public void removeTrack(Track T) {
        boolean check = this.tracks.contains(T);
        if(check) this.tracks.remove(T);
        System.out.println("A track was removed");
    }
    public int getLength() {
        int length = this.tracks.size();
        int sum = 0;
        for(int i = 0; i < length; i++)
            sum = sum + tracks.get(i).getLength();
        return sum;
    }

    public CompactDisc(String artist) {
        this.artist = artist;
    }
    @Override
    public void play() {
        int length = tracks.size();
        for(int i = 0; i < length; i++)
            tracks.get(i).play();
    }
    public boolean contains(Track t) {
        int length = this.tracks.size();
        boolean b = false;
        for(Track track : tracks)
            if(track.equals(t)) b = true;
        return b;
    }

    public static void main(String[] args) {
        Track t1 = new Track("Enchanted", 4);
        Track t2 = new Track("Nu Cuoi Xuan", 5);
        Track t3 = new Track("Malevolent Kitchen", 5);
        CompactDisc cd = new CompactDisc("Musician1");
        cd.addTrack(t1);
        cd.addTrack(t2);
        cd.addTrack(t3);
        System.out.println(cd.getLength());
        cd.removeTrack(t2);
        System.out.println(cd.getLength());
    }
}
