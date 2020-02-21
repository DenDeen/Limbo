package be.ucll.spamapp.domain;

public abstract class User {
    private String name;
    private String firstName;
    private int age;
    boolean isZombie;

    public User(String name, String firstName, int age, boolean isZombie) {
        setAge(age);
        setFirstName(firstName);
        setName(name);
        setZombie(isZombie);
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

    public void setZombie(boolean zombie) {
        isZombie = zombie;
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

    public boolean isZombie() {
        return isZombie;
    }
}
