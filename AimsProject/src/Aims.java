public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "Doraemon", 1.80f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Drama", "Mr.Queen", 3.81f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Science Fiction", "Avatar", 24.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Horror", "Annabelle", 10.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Comedy", "Friends", 8.19f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Science Fiction", "Star Wars", 19.99f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Animation", "Vinland Saga", 8.99f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Animation", "Jujutsu Kaisen", 10.99f);
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Superhero", "Spiderman 1", 15.99f);
        DigitalVideoDisc[] dvdList = {dvd6, dvd7};
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        System.out.printf("The total cost is %.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
        System.out.println('\n');

        cart.addDigitalVideoDisc(dvd4, dvd5);

        System.out.printf("The total cost is %.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
        System.out.println('\n');

    /*     cart.addDigitalVideoDisc(dvdList);
        System.out.printf("The total cost is %.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
        System.out.println('\n'); */

        cart.addDigitalVideoDisc(dvd8,dvd9);
        System.out.printf("The total cost is %.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
        System.out.println('\n');

        cart.removeDigitalVideoDisc(dvd3);
        System.out.printf("The total cost is %.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
    }
}
