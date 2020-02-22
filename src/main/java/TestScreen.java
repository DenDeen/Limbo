import be.ucll.spamapp.domain.*;

import java.time.LocalDate;

public class TestScreen {
    public static void main(String[] args) {
        Users users = Users.getInstance();
        User user1 = new Zombie();
        User user2 = new Human();
        User user3 = new Human();
        User user4 = new Zombie();
        user1.setName("beast");
        user1.setFirstName("eric");
        user1.setAge(26);
        user1.setWoman(false);
        user1.setEmail("ericbeast@yahoo.com");
        ((Zombie) user1).setDate(LocalDate.now());
        PotService potService1 = new PotService();
        potService1.setCurrentUser(user1);
        potService1.addPotentieel(user2);
        MatchService matchService1 = new MatchService();
        matchService1.setCurrentuser(user1);
        user1.setPotService(potService1);

        user2.setName("plane");
        user2.setFirstName("jane");
        user2.setAge(22);
        user2.setWoman(true);
        user2.setEmail("janeplane@gmail.com");
        PotService potService2 = new PotService();
        potService2.setCurrentUser(user2);
        potService2.addPotentieel(user1);
        MatchService matchService2 = new MatchService();
        matchService2.setCurrentuser(user2);
        user2.setPotService(potService2);
        System.out.println("eric swiped jane naar rechts");
        user1.getPotService().swipeRight();
        System.out.println("nu zou jane in pending van eric zitten");
        System.out.println("-> "+user1.getPotService().getPotentieleMatches().peek().getFirstName());
    }
}
