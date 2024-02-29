package hust.soict.ict.aims;

import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.cart.Cart;
public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc( "Doraemon", "Animation", 1.80f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Mr.Queen","Drama" , 3.81f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Adventure Time", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avatar","Science Fiction", 24.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Annabelle","Horror",  10.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Friends","Comedy",  8.19f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Star Wars","Science Fiction",  19.99f);
        DigitalVideoDisc[] dvdList = {dvd6, dvd7};
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);
        cart.addMedia(dvd4);
        cart.addMedia(dvd5);
        cart.cartPrint();
    }
}
