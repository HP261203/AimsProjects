public class Cart {
    public static final int MAX_NUMBERS_ORDER = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDER];
    private int qtyOrdered;

    public DigitalVideoDisc[] getItemsOrdered() {
        return itemsOrdered;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc (DigitalVideoDisc dvd) {
        if(this.getQtyOrdered() > MAX_NUMBERS_ORDER)
            System.out.println("The cart is full");
        else {
            this.itemsOrdered[this.getQtyOrdered()] = dvd;
            System.out.println("The disc has been added");
            this.setQtyOrdered(this.getQtyOrdered() + 1);
        }
    }

    public void removeDigitalVideoDisc (DigitalVideoDisc dvd) {
        int pos = -1;
        int length = this.getQtyOrdered();
        for(int i = 0; i < length; i++) {
            if(dvd.getTitle() == itemsOrdered[i].getTitle()) {
                pos = i;
                break;
            }
        }
        if(pos < 0) System.out.println("No such disc was found");
        else {
            for(int i = pos; i < length - 1; i++) {
                this.itemsOrdered[i] = this.itemsOrdered[i+1];
            }
            this.setQtyOrdered(this.getQtyOrdered()-1);
        }
    }
    public float totalCost() {
        float sum = 0f;
        int length = this.getQtyOrdered();
        for(int i = 0; i < length; i++)
            sum = sum + itemsOrdered[i].getCost();
        return sum;
    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "Doraemon", 1.80f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Drama", "Mr.Queen", 3.81f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        System.out.printf("%.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());

        cart.removeDigitalVideoDisc(dvd3);
        System.out.printf("%.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
    }
}
