public class Main {

    /*
    1. Clientul va cere urmatoarea aplicatie:
    Firma noastra va vinde haine. Toate hainele noastre vor avea in comun o marca si un pret.
    Vom vinde tricouri.
    Vom vinde pantaloni, care vor avea un numar specific de buzunare.
    Vom vinde hanorace, care pot sau nu pot avea gluga.
    Vom vinde adidasi, care pot sau nu pot avea sireturi.

    Clientii nostrii vor avea un nume, un buget si o lista de haine cumparate.
    De asemenea, vrem ca toti clientii nostrii sa poata cumpara oricand hainele noastre.
    Creati aplicatia si testati cazurile.
     */

    public static void main(String[] args) {

        TShirts tShirt_tommy_hilfiger = new TShirts("Tommy Hilfiger", 300);
        TShirts tShirt_givenchy = new TShirts("Givenchy", 550);
        TShirts tShirt_north_face = new TShirts("North Face", 250);
        TShirts tShirt_hugo = new TShirts("Hugo", 450);

        Pants pants_adidas = new Pants("Adidas",300,0);
        Pants pants_nike = new Pants("Nike",200,0);
        Pants pants_jack_jones = new Pants("Jack & Jones",500,2);

        Hoody hoody_calvin_klein = new Hoody("Calvin Klein", 500, true);
        Hoody hoody_puma = new Hoody("Puma", 300, false);

        Sneakers sneakers_balenciaga = new Sneakers("Balenciaga", 700, true);
        Sneakers sneakers_tommy_jeans = new Sneakers("Tommy Jeans", 500, true);
        Sneakers sneakers_guess = new Sneakers("Guess", 900, false);

        Client client1 = new Client("John", 10_000);
        Client client2 = new Client("Smith", 5000);
        Client client3 = new Client("Jack", 3000);

        client1.buyClothes(tShirt_tommy_hilfiger);
        client1.buyClothes(hoody_calvin_klein);
        client1.buyClothes(tShirt_givenchy);
        client1.buyClothes(pants_nike);
        client1.buyClothes(hoody_puma);

        for (int i = 0; i < 5; i++) {
            client2.buyClothes(sneakers_guess);
        }
        client2.buyClothes(pants_adidas);
        client2.buyClothes(pants_jack_jones);

        client3.buyClothes(tShirt_north_face);
        client3.buyClothes(tShirt_hugo);
        client3.buyClothes(sneakers_balenciaga);

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);

    }
}
