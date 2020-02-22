package be.ucll.spamapp.domain;

import java.time.LocalDate;

public class Zombie extends User {

    private LocalDate date;

    public Zombie(String name, String firstName, int age, LocalDate date) {

        super(name, firstName, age);
        setDate(date);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int calculateDays(){
        return 2;
    }
}
