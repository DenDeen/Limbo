package be.ucll.spamapp.domain;

import java.util.ArrayList;
import java.util.Queue;

public class PotService {
    private Queue<User> potentieleMatches;
    private ArrayList<User> pending;
    private User currentUser;

    public PotService(){

    }

    public void addPotentieel(User user){

    }

    public void swipeLeft(){
        int posOfLovedONe = currentUser.getUsers().getPersons().indexOf(potentieleMatches.poll());
        User lovedOne = currentUser.getUsers().getPersons().get(posOfLovedONe);
        lovedOne.getPotService().getPending().remove(this.currentUser);
        lovedOne.getPotService().getPotentieleMatches().remove(this.currentUser);

    }

    public void swipeRight(){
        int posOfLovedONe = currentUser.getUsers().getPersons().indexOf(potentieleMatches.poll());
        User lovedOne = currentUser.getUsers().getPersons().get(posOfLovedONe);
        if(lovedOne.getPotService().getPending().contains(this))
        {
            lovedOne.getMatchService().addMatch(currentUser);
            currentUser.getMatchService().addMatch(lovedOne);
        }
        else {
            pending.add(potentieleMatches.poll());
        }
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
    }
}
