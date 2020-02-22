package be.ucll.spamapp.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class User {
    private int id;
    private String mainPhotoPath;
    private List<String> photoPaths;
    private String name;
    private String firstName;
    private int age;
    private String email;
    private boolean woman;

    public boolean isWoman() {
        return woman;
    }

    public void setWoman(boolean woman) {
        this.woman = woman;
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

    public User(String name, String firstName, int age){
        setId(id);
        setAge(age);
        setFirstName(firstName);
        setName(name);
        setEmail(email);
        setWoman(woman);
        setMainPhotoPath(mainPhotoPath);
        setPhotoPaths(photoPaths);
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
