import java.util.ArrayList;

public class Client {

    String name;
    int budget;
    ArrayList<Clothes> boughtClothes;

    public Client(String name, int budget) {
        this.name = name;
        this.budget = budget;
        this.boughtClothes = new ArrayList<>();
    }

    public void buyClothes(Clothes clothes){
        if (budget >= clothes.price) {
            this.budget -= clothes.price;
            boughtClothes.add(clothes);
            System.out.println("Customer " + this.name + " bought " + clothes);
            System.out.println("Budget: " + this.budget);
        } else {
            System.out.println(this.name + " has no more money.");
            System.out.println("Budget: " + this.budget);
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", boughtClothes=" + boughtClothes +
                '}';
    }
}
