public class Sneakers extends Clothes{

    boolean laces;

    public Sneakers(String brand, int price, boolean laces) {
        super(brand, price);
        this.laces = laces;
    }

    @Override
    public String toString() {
        return "Sneakers{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", laces=" + laces +
                '}';
    }
}
