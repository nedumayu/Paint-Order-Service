package paintorderservice;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Ann");
        Client client1 = new Client("Kate");
        Order order1 = new Order(1332);
        Preorder preorder1 = new Preorder(0034);

        artist1.setWorkExperience("2 years");
        client1.setStatus(Client.Status.ACTIVE);
        order1.setStartDate(LocalDate.of(2012, 12, 12));
        preorder1.setLength(12);
        artist1.setStyles(new ArrayList<String>());


        System.out.println(artist1.getWorkExperience());
        System.out.println(client1.getStatus());
        System.out.println(order1.getStartDate());
        System.out.println(preorder1.getLength());
        System.out.println(artist1.getStyles());
    }
}
