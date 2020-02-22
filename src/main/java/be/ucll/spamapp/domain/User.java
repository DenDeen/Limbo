package be.ucll.spamapp.domain;

import java.util.Map;

public abstract class User {
    private String name;
    private String firstName;
    private int age;
    private String email;
    private boolean vrouw;
    private boolean[] ledematen = new boolean[4];

    public User(String name, String firstName, int age) {
        setAge(age);
        setFirstName(firstName);
        setName(name);
    }

    public void setLedematen(boolean linkerArm, boolean rechterArm, boolean linkerBeen, boolean rechterBeen) {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
