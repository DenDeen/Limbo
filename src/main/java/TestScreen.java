import be.ucll.spamapp.domain.*;

import java.time.LocalDate;

public class TestScreen {
    public static void main(String[] args) {
        Users users = Users.getInstance();
        User user1 = users.getPersons().get(0);
        User user2 = users.getPersons().get(1);
        User user3 = users.getPersons().get(2);
        User user4 = users.getPersons().get(3);

        System.out.println("eric swiped jane naar rechts");
        user1.getPotService().swipeRight();
        System.out.println("nu zou jane in pending van eric zitten");
        System.out.println("-> "+user1.getPotService().getPending().get(0).getFirstName());
        System.out.println("eric swiped jane naar rechts");
        user2.getPotService().swipeRight();
        System.out.println("nu zou jane en eric match zijn");
        System.out.println("-> " + user1.getMatchService().getMatches().get(0));
    }
}
