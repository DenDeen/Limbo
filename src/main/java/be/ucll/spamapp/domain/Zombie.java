package be.ucll.spamapp.domain;

public class Zombie extends User {

    private String date;

    public Zombie(String name, String firstName, int age, boolean isZombie, String date) {

        super(name, firstName, age, isZombie);
        setDate(date);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
