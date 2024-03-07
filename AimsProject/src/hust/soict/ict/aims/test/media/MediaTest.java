package hust.soict.ict.aims.test.media;

import hust.soict.ict.aims.media.CompactDisc;
import hust.soict.ict.aims.media.Track;

public class MediaTest {
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
