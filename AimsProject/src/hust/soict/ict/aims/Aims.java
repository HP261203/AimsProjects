package hust.soict.ict.aims;

import hust.soict.ict.aims.disc.DigitalVideoDisc;
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
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
        cart.addDigitalVideoDisc(dvd4, dvd5);
        cart.printCart();
        cart.titleSearch("Doraemon");
        cart.idSearch(5);
        cart.idSearch(8);

        cart.addDigitalVideoDisc(dvdList);
        cart.printCart();

        System.out.printf("The total cost is %.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
        System.out.println('\n');
        cart.removeDigitalVideoDisc(dvd3);
        System.out.printf("The total cost is %.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
        cart.printCart();
    }
}
