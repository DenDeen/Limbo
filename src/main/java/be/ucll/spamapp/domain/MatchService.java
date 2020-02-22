package be.ucll.spamapp.domain;

import org.assertj.core.internal.bytebuddy.implementation.bytecode.Throw;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MatchService {
    private ArrayList<User> matches;
    private User currentuser;
    public MatchService(){
        matches = new ArrayList<>();
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

    public void setMatches(ArrayList<User> matches) {
        this.matches = matches;
    }

    public User getCurrentuser() {
        return currentuser;
    }

    public void setCurrentuser(User currentuser) {
        this.currentuser = currentuser;
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
