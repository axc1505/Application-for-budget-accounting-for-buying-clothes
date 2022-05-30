public class Hoody extends Clothes{

    boolean withHood;

    public Hoody(String brand, int price, boolean withHood) {
        super(brand, price);
        this.withHood = withHood;
    }

    @Override
    public String toString() {
        return "Hoody{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", withHood=" + withHood +
                '}';
    }
}
