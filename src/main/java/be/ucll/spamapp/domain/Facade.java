package be.ucll.spamapp.domain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Facade {
    static Users allUsers = Users.getInstance();

    public Facade() {
    }

    public static void swipeRechts(String email)
    {
        for(User dum:allUsers.getPersons())
        {
            if(dum.getEmail().equals(email))
            {
                dum.getPotService().swipeRight();
                return;
            }
        }
    }

    public static void swipeLinks(String email)
    {
        for(User dum:allUsers.getPersons())
        {
            if(dum.getEmail().equals(email))
            {
                dum.getPotService().swipeLeft();
                return;
            }
        }
    }

    public static List<String> getPhotoPaths(String email)
    {
        for(User dum:allUsers.getPersons())
        {
            if(dum.getEmail().equals(email))
            {
                return new ArrayList<>(dum.getAllPhotoPaths());
            }
        }
        return null;
    }

    public static List<User> getPotentiele(String email)
    {
        for(User dum:allUsers.getPersons())
        {
            if(dum.getEmail().equals(email))
            {
                return new LinkedList<>(dum.getPotService().getPotentieleMatches());
            }
        }
        return null;
    }

    public static List<User> getPending(String email)
    {
        for(User dum:allUsers.getPersons())
        {
            if(dum.getEmail().equals(email))
            {
                return new ArrayList<>(dum.getPotService().getPending());
            }
        }
        return null;
    }

    public static List<User> getMatches(String email)
    {
        for(User dum:allUsers.getPersons())
        {
            if(dum.getEmail().equals(email))
            {
                return new ArrayList<>(dum.getMatchService().getMatches());
            }
        }
        return null;
    }
}
