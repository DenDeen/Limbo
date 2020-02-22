package be.ucll.spamapp.domain;

import java.util.Map;

public abstract class User {
    private String name;
    private String firstName;
    private int age;
    private String email;
    private boolean vrouw;

    public boolean isVrouw() {
        return vrouw;
    }

    public void setVrouw(boolean vrouw) {
        this.vrouw = vrouw;
    }

    public User(String name, String firstName, int age, String email, boolean vrouw){
        setAge(age);
        setFirstName(firstName);
        setName(name);
        setEmail(email);
        setVrouw(vrouw);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
