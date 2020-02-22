package be.ucll.spamapp.domain;

import java.util.List;
import java.util.Objects;

public abstract class User {
    private int id;
    private String mainPhotoPath;
    private List<String> photoPaths;
    private String name;
    private String firstName;
    private int age;
    private String email;
    private boolean woman;
    private PotService potService;
    private MatchService matchService;
    private Users users;

    public User() {
    }

    public User(int id, String name, String firstName, int age, String email, boolean woman, String mainPhotoPath, List<String> photoPaths){
        setId(id);
        setAge(age);
        setFirstName(firstName);
        setName(name);
        setEmail(email);
        setWoman(woman);
        setMainPhotoPath(mainPhotoPath);
        setPhotoPaths(photoPaths);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                age == user.age &&
                woman == user.woman &&
                Objects.equals(mainPhotoPath, user.mainPhotoPath) &&
                Objects.equals(photoPaths, user.photoPaths) &&
                name.equals(user.name) &&
                firstName.equals(user.firstName) &&
                email.equals(user.email) &&
                Objects.equals(potService, user.potService) &&
                Objects.equals(matchService, user.matchService) &&
                Objects.equals(users, user.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mainPhotoPath, photoPaths, name, firstName, age, email, woman, potService, matchService, users);
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public boolean isWoman() {
        return woman;
    }

    public void setWoman(boolean woman) {
        this.woman = woman;
    }


    public PotService getPotService() {
        return potService;
    }

    public void setPotService(PotService potService) {
        this.potService = potService;
    }

    public MatchService getMatchService() {
        return matchService;
    }

    public void setMatchService(MatchService matchService) {
        this.matchService = matchService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMainPhotoPath() {
        return mainPhotoPath;
    }

    public void setMainPhotoPath(String mainPhotoPath) {
        this.mainPhotoPath = mainPhotoPath;
    }

    public List<String> getPhotoPaths() {
        return photoPaths;
    }

    public void setPhotoPaths(List<String> photoPaths) {
        this.photoPaths = photoPaths;
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
