package be.ucll.spamapp.domain;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Service
public class Facade {
    static Users allUsers = Users.getInstance();

    public Facade() {
    }



    public static User swipe(String email, int keuze)
    {
        for(User dum:allUsers.getPersons())
        {
            if(dum.getEmail().equals(email))
            {
                if(keuze==1) {return dum.getPotService().swipeRight();}
                else{return dum.getPotService().swipeLeft();}
            }
        }
        return null;
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
