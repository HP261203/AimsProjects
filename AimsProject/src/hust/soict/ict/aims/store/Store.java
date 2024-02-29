package hust.soict.ict.aims.store;

import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS = 200;
    private int qtyInStore = 0;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS];

    public int getQtyInStore() {
        return qtyInStore;
    }

    public void setQtyInStore(int qtyInStore) {
        this.qtyInStore = qtyInStore;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        int length = this.getQtyInStore();
        this.itemsInStore[length] = dvd;
        this.setQtyInStore(length + 1);
        System.out.println("A disc was added to the store");
    }
    public void removeDVD(DigitalVideoDisc dvd) {
        int length = this.getQtyInStore();
        int pos = -1;
        for(int i = 0; i < length; i++) {
            if(this.itemsInStore[i].isMatch(dvd.getTitle()))
                pos = i;
        }
        if(pos < 0) System.out.println("No such disc was found");
        else{
            for(int i = pos; i < length; i++) {
                this.itemsInStore[i] = this.itemsInStore[i+1];
            }
            this.setQtyInStore(this.getQtyInStore() - 1);
            System.out.println("A disc was removed from the store");
        }
    }

    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        store.addDVD(dvd2);
        store.removeDVD(dvd2);
    }
}
