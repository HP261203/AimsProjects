package hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    List<Track> tracks = new ArrayList<Track>();
    public void addTrack(Track T) {
        boolean check = this.tracks.contains(T);
        if(!check) this.tracks.add(T);
    }

    public void removeTrack(Track T) {
        boolean check = this.tracks.contains(T);
        if(check) this.tracks.remove(T);
    }
    public int getLength() {
        int length = this.tracks.size();
        int sum = 0;
        for(int i = 0; i < length; i++)
            sum = sum + tracks.get(i).getLength();
        return sum;
    }

    @Override
    public void play() {
        int length = tracks.size();
        for(int i = 0; i < length; i++)
            tracks.get(i).play();
    }
}
