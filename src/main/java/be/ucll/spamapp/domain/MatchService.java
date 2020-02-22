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
            if (user.getId() == u.getId()){
                matches.remove(u.getId());
            }
        }
    }

    public ArrayList<User> getMatches(){
        return matches;
    }

    public User getMatch(int id){
        for (User u: matches
        ) {
            if (id == u.getId()){
                return matches.get(id);
            }
        }
        throw  new DomainException("the wanted user is not a match");
    }
}
