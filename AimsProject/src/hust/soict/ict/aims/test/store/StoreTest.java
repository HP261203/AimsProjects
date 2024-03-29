package hust.soict.ict.aims.test.store;

import hust.soict.ict.aims.disc.DigitalVideoDisc;
import hust.soict.ict.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        store.addDVD(dvd2);
        store.removeDVD(dvd2);
    }
}
