public class Pants extends Clothes{

    int pockets;

    public Pants(String brand, int price, int pockets) {
        super(brand, price);
        this.pockets = pockets;
    }

    @Override
    public String toString() {
        return "Pants{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", pockets=" + pockets +
                '}';
    }
}
