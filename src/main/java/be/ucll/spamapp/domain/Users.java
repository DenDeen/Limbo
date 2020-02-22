package be.ucll.spamapp.domain;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class Users {

    private ArrayList<User> users = new ArrayList<>();
    private static final Users INSTANCE = new Users();


    private Users(){

    }

    public static Users getInstance(){
        return INSTANCE;
    }

    public void setPersons(ArrayList<User> persons) {
        this.users = persons;
    }

    public ArrayList<User> getPersons() {
        return users;
    }

    public void addPerson(User person){
        users.add(person);
    }

    public User removeNextPerson(User person){
        return users.remove(0);
    }


}
