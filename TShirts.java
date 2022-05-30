public class TShirts extends Clothes{

    public TShirts(String brand, int price) {
        super(brand, price);
    }

    @Override
    public String toString() {
        return "TShirts{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
