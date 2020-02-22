import be.ucll.spamapp.domain.*;

import java.time.LocalDate;
import java.util.List;

public class TestScreen {
    public static void main(String[] args) {
        Users users = Users.getInstance();
        User user1 = users.getPersons().get(0);
        User user2 = users.getPersons().get(1);
        User user3 = users.getPersons().get(2);
        User user4 = users.getPersons().get(3);
/*
        System.out.println("eric swiped jane naar rechts");
        user1.getPotService().swipeRight();
        System.out.println("nu zou jane in pending van eric zitten");
        System.out.println("-> "+user1.getPotService().getPending().get(0).getFirstName());
        *//*System.out.println("jane swiped eric naar links");
        user2.getPotService().swipeLeft();
        System.out.println("nu zou eric en jane hun pending 0 zijn");
        System.out.println("-> " + user1.getPotService().getPending().size());
        System.out.println("-> " + user2.getPotService().getPending().size());*//*
        System.out.println("jane swiped eric naar rechts");
        user2.getPotService().swipeRight();
        System.out.println("nu zou eric en jane hun matches 1 lang moeten zijn");
        System.out.println("-> " + user1.getMatchService().getMatches().size());
        System.out.println("-> " + user2.getMatchService().getMatches().size());*/

        /*System.out.println(user1.getPotService().getPotentieleMatches());
        System.out.println("eerste potentie van eric: " + user1.getPotService().getPotentieleMatches().peek());
        System.out.println("eric swiped");
        user1.getPotService().swipeLeft();
        System.out.println(user1.getPotService().getPotentieleMatches());
        System.out.println("-> " + user1.getPotService().getPotentieleMatches().peek());*/

        System.out.println(user1.getClass());

    }
}
