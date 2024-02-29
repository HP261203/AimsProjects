package hust.soict.ict.aims.store;

import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    public boolean searchMedia(Media m) {
        if(this.itemsInStore.contains(m)) return true;
        else return false;
    }
    public void addMedia(Media m) {
        if(!searchMedia(m)) this.itemsInStore.add(m);
        System.out.println("An item was added to the store");
    }

    public void removeMedia(Media m) {
        if(searchMedia(m)) this.itemsInStore.remove(m);
        System.out.println("An item was removed from the store");
    }

    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        store.addMedia(dvd2);
        store.removeMedia(dvd2);
    }
}
