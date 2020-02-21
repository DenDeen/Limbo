package be.ucll.spamapp.domain;

import java.util.ArrayList;

public class Persons {

    private ArrayList<Person> persons = new ArrayList<>();

    public Persons(){

    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person){
        persons.add(person);
    }

    public Person removeNextPerson(Person person){
        return persons.remove(0);
    }

    
}
