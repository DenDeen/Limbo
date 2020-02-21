package be.ucll.spamapp.domain;

import java.util.ArrayList;

public class Users {

    private ArrayList<Person> users = new ArrayList<>();

    public Users(){

    }

    public void setPersons(ArrayList<Person> persons) {
        this.users = persons;
    }

    public ArrayList<Person> getPersons() {
        return users;
    }

    public void addPerson(Person person){
        users.add(person);
    }

    public Person removeNextPerson(Person person){
        return users.remove(0);
    }


}
