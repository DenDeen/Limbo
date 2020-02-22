package be.ucll.spamapp.domain;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Service
public class PotService {
    private Queue<User> potentieleMatches;
    private Queue<Integer> potentieleMatchesScore;
    private ArrayList<User> pending;
    private User currentUser;

    public PotService(){
        potentieleMatches = new LinkedList<>();
        potentieleMatchesScore = new LinkedList<>();
        pending = new ArrayList<>();
    }

    private boolean isZelfdeSub(User u)
    {
        return currentUser.getClass( )== u.getClass();
    }

    private int berekenScore(User pot)
    {
        double randomDouble = Math.random();
        randomDouble = randomDouble * 100 + 1;
        return (int) randomDouble;
    }

    private void findPotentieleMatches()
    {
        List<User> potdum = new ArrayList<>();
        List<Integer> potscoreDum = new ArrayList<>();
        for(User user:currentUser.getUsers().getPersons())
        {
            if(!isZelfdeSub(user))
            {
                potdum.add(user);
                potscoreDum.add(berekenScore(user));
            }
        }
    }

    public void addPotentieel(User user){
        potentieleMatches.add(user);
        potentieleMatchesScore.add(berekenScore(user));
    }

    public User swipeLeft(){
        int posOfLovedONe = currentUser.getUsers().getPersons().indexOf(potentieleMatches.remove());
        potentieleMatchesScore.poll();
        User lovedOne = currentUser.getUsers().getPersons().get(posOfLovedONe);
        lovedOne.getPotService().getPending().remove(this.currentUser);
        lovedOne.getPotService().getPotentieleMatches().remove(this.currentUser);
        return potentieleMatches.peek();
    }

    public User swipeRight(){
        User dum = potentieleMatches.poll();
        int posOfLovedONe = currentUser.getUsers().getPersons().indexOf(dum);
        potentieleMatchesScore.poll();
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

    public Queue<Integer> getPotentieleMatchesScore() {
        return potentieleMatchesScore;
    }

    public void setPotentieleMatchesScore(Queue<Integer> potentieleMatchesScore) {
        this.potentieleMatchesScore = potentieleMatchesScore;
    }

    public Queue<User> getPotentieleMatches() {
        return potentieleMatches;
    }

    public void setPotentieleMatches(Queue<User> potentieleMatches) {
        this.potentieleMatches = potentieleMatches;
        this.findPotentieleMatches();
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
