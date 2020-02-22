package be.ucll.spamapp.domain;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

@Service
public class PotService {
    private Queue<User> potentieleMatches;
    private ArrayList<User> pending;
    private User currentUser;

    public PotService(){
        potentieleMatches = new LinkedList<>();
        pending = new ArrayList<>();
    }

    private void findPotentieleMatches()
    {

    }

    public void addPotentieel(User user){
        potentieleMatches.add(user);
    }

    public User swipeLeft(){
        int posOfLovedONe = currentUser.getUsers().getPersons().indexOf(potentieleMatches.poll());
        User lovedOne = currentUser.getUsers().getPersons().get(posOfLovedONe);
        lovedOne.getPotService().getPending().remove(this.currentUser);
        lovedOne.getPotService().getPotentieleMatches().remove(this.currentUser);
        return potentieleMatches.peek();
    }

    public User swipeRight(){
        int posOfLovedONe = currentUser.getUsers().getPersons().indexOf(potentieleMatches.poll());
        User lovedOne = currentUser.getUsers().getPersons().get(posOfLovedONe);
        ArrayList<User> dummy = lovedOne.getPotService().getPending();
        if(dummy.contains(currentUser))
        {
            lovedOne.getMatchService().addMatch(currentUser);
            currentUser.getMatchService().addMatch(lovedOne);
        }
        else {
            pending.add(lovedOne);
        }
        return potentieleMatches.peek();
    }

    public Queue<User> getPotentieleMatches() {
        return potentieleMatches;
    }

    public void setPotentieleMatches(Queue<User> potentieleMatches) {
        this.potentieleMatches = potentieleMatches;
    }

    public ArrayList<User> getPending() {
        return pending;
    }

    public void setPending(ArrayList<User> pending) {
        this.pending = pending;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
        this.findPotentieleMatches();
    }


}
