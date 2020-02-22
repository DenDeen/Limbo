package be.ucll.spamapp.domain;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class Facade {
    static Users allUsers = Users.getInstance();

    public Facade() {
    }

    public static User peekSecondPotential(String email)
    {
        for(User dum:allUsers.getPersons())
        {
            if(dum.getEmail().equals(email))
            {
                ArrayList<User>dumdum = new ArrayList<>(dum.getPotService().getPotentieleMatches());
                return dumdum.get(1);
            }
        }
        return null;
    }

    public static User peekFirstPotential(String email)
    {
        for(User dum:allUsers.getPersons())
        {
            if(dum.getEmail().equals(email))
            {
               return dum.getPotService().getPotentieleMatches().peek();
            }
        }
        return null;
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

    public static User getUser(String email){
        return Users.getInstance().getUser(email);
    }
}
