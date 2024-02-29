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

    public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if(this.qtyOrdered >= MAX_NUMBERS_ORDER){
            System.out.println("The cart is almost full");
        }else{
            this.itemsOrdered[this.qtyOrdered] = dvd1;
            this.setQtyOrdered(this.getQtyOrdered()+1);
            System.out.println("The first disc has been added");
            if(this.qtyOrdered >= MAX_NUMBERS_ORDER){
                System.out.println("The cart is almost full");
            }else{
                this.itemsOrdered[this.qtyOrdered] = dvd1;
                this.setQtyOrdered(this.getQtyOrdered()+1);
                System.out.println("The second disc has been added");
            }
        }
    }
    public void addDigitalVideoDisc (DigitalVideoDisc dvd[]) {
        int N = dvd.length;
        if(N > MAX_NUMBERS_ORDER) System.out.println("Too many discs");
        else if(this.getQtyOrdered() + N > MAX_NUMBERS_ORDER) System.out.println("The cart is almost full");
        else {
            for(int i = 0; i < N; i++) {
                this.itemsOrdered[this.getQtyOrdered()] = dvd[i];
                this.setQtyOrdered(this.getQtyOrdered()+1);
            }
            System.out.println("A series of disc was added to the cart");
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
}
