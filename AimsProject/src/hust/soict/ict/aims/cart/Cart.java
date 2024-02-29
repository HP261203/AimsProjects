package hust.soict.ict.aims.cart;

import hust.soict.ict.aims.media.Media;

import java.util.ArrayList;

public class Cart {
//    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDER];
//    private int qtyOrdered;
//
//    public DigitalVideoDisc[] getItemsOrdered() {
//        return itemsOrdered;
//    }
//
//    public int getQtyOrdered() {
//        return qtyOrdered;
//    }
//
//    public void setQtyOrdered(int qtyOrdered) {
//        this.qtyOrdered = qtyOrdered;
//    }
//
//    public void addDigitalVideoDisc (DigitalVideoDisc dvd) {
//        if(this.getQtyOrdered() > MAX_NUMBERS_ORDER)
//            System.out.println("The cart is full");
//        else {
//            this.itemsOrdered[this.getQtyOrdered()] = dvd;
//            System.out.println("The disc has been added");
//            this.setQtyOrdered(this.getQtyOrdered() + 1);
//        }
//    }
//
//    public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
//        if(this.qtyOrdered >= MAX_NUMBERS_ORDER){
//            System.out.println("The cart is almost full");
//        }else{
//            this.itemsOrdered[this.qtyOrdered] = dvd1;
//            this.setQtyOrdered(this.getQtyOrdered()+1);
//            System.out.println("The first disc has been added");
//            if(this.qtyOrdered >= MAX_NUMBERS_ORDER){
//                System.out.println("The cart is almost full");
//            }else{
//                this.itemsOrdered[this.qtyOrdered] = dvd2;
//                this.setQtyOrdered(this.getQtyOrdered()+1);
//                System.out.println("The second disc has been added");
//            }
//        }
//    }
//    public void addDigitalVideoDisc (DigitalVideoDisc dvd[]) {
//        int N = dvd.length;
//        if(N > MAX_NUMBERS_ORDER) System.out.println("Too many discs");
//        else if(this.getQtyOrdered() + N > MAX_NUMBERS_ORDER) System.out.println("The cart is almost full");
//        else {
//            for(int i = 0; i < N; i++) {
//                this.itemsOrdered[this.getQtyOrdered()] = dvd[i];
//                this.setQtyOrdered(this.getQtyOrdered()+1);
//            }
//            System.out.println("A series of disc was added to the cart");
//        }
//    }
//    public void removeDigitalVideoDisc (DigitalVideoDisc dvd) {
//        int pos = -1;
//        int length = this.getQtyOrdered();
//        for(int i = 0; i < length; i++) {
//            if(this.itemsOrdered[i].isMatch(dvd.getTitle())) {
//                pos = i;
//                break;
//            }
//        }
//        if(pos < 0) System.out.println("No such disc was found");
//        else {
//            for(int i = pos; i < length - 1; i++) {
//                this.itemsOrdered[i] = this.itemsOrdered[i+1];
//            }
//            this.setQtyOrdered(this.getQtyOrdered()-1);
//            System.out.println("A disc was removed from the cart");
//        }
//    }
//    public float totalCost() {
//        float sum = 0f;
//        int length = this.getQtyOrdered();
//        for(int i = 0; i < length; i++)
//            sum = sum + itemsOrdered[i].getCost();
//        return sum;
//    }
//
//    public void printCart() {
//        System.out.println("****************CART****************");
//        System.out.println("Ordered Items");
//        int length = this.getQtyOrdered();
//        float total = this.totalCost();
//        for(int i = 0; i < length; i++) {
//            System.out.println(this.itemsOrdered[i].toString());
//        }
//        System.out.println("Total cost: " + total);
//        System.out.println("***********************************");
//    }
//
//    public void titleSearch(String str) {
//        boolean found = false;
//        int length = this.getQtyOrdered();
//        for(int i = 0; i < length; i++) {
//            if(this.itemsOrdered[i].isMatch(str)) {
//                System.out.println("The disc was found: " + itemsOrdered[i].toString());
//                found = true;
//            }
//        }
//        if(!found) System.out.println("No such disc was found");
//    }
//    public void idSearch(int id) {
//        boolean found = false;
//        int length = this.getQtyOrdered();
//        for(int i = 0; i < length; i++) {
//            if(this.itemsOrdered[i].getId() == id) {
//                System.out.println("The disc was found: " + itemsOrdered[i].toString());
//                found = true;
//            }
//        }
//        if(!found) System.out.println("No such disc was found");
//    }
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public boolean searchMedia(Media m) {
        if(this.itemsOrdered.contains(m)) return true;
        else return false;
    }
    public void addMedia(Media m) {
        if(!searchMedia(m)) this.itemsOrdered.add(m);
        System.out.println("An item was added to the cart");
    }

    public void removeMedia(Media m) {
        if(searchMedia(m)) this.itemsOrdered.remove(m);
        System.out.println("An item was removed from the cart");
    }

    public float totalCost() {
        int length = this.itemsOrdered.size();
        float sum = 0;
        for(int i = 0; i < length; i++)
            sum = sum + this.itemsOrdered.get(i).getCost();
        return sum;
    }

    public void cartPrint() {
        int length = this.itemsOrdered.size();
        System.out.println("**************CART**************");
        for(int i = 0; i < length; i++) {
            System.out.println(this.itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("********************************");
    }
}
