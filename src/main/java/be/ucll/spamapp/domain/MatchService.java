package be.ucll.spamapp.domain;

import org.assertj.core.internal.bytebuddy.implementation.bytecode.Throw;

import java.util.ArrayList;

public class MatchService {
    private ArrayList<User> matches;

    MatchService(){

    }

    public void addMatch(User user){
        matches.add(user);
    }

    public void deleteMatch(User user){
        for (User u: matches) {
            if (user.getEmail() == u.getEmail()){
                matches.remove(u);
            }
        }
    }

    public ArrayList<User> getMatches(){
        return matches;
    }

    public User getMatch(String email){
        for (User u: matches
        ) {
            if (email == u.getEmail()){
                return u;
            }
        }
        throw  new DomainException("the wanted user is not a match");
    }
}
