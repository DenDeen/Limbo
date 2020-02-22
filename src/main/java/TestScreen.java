import be.ucll.spamapp.domain.*;

import java.time.LocalDate;

public class TestScreen {
    public static void main(String[] args) {
        Users users = Users.getInstance();
        User user1 = new Zombie();
        user1.setName("beast");
        user1.setFirstName("eric");
        user1.setAge(26);
        user1.setWoman(false);
        user1.setEmail("ericbeast@yahoo.com");
        ((Zombie) user1).setDate(LocalDate.now());
        PotService potService1 = new PotService();
        potService1.setCurrentUser(user1);
        po
        User user2 = new Human();
        User user3 = new Human();
        User user4 = new Zombie();
        System.out.println("hey");
    }
}
