package be.ucll.spamapp.domain;

import org.springframework.stereotype.Service;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public abstract class User {
    private String mainPhotoPath;
    private List<String> photoPaths = new ArrayList<>();
    private String name;
    private String firstName;
    private LocalDate geboortedatum;
    private String email;
    private boolean woman;
    private List<Defect> defects = new ArrayList<>();
    private Preferences preferences;
    private String bio;
    private PotService potService;
    private MatchService matchService;
    private Users users;
    private int age;
    private int Length;
    private char orientation;
    //private List<Defect> defects;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public char getOrientation() {
        return orientation;
    }

    public void setOrientation(char orientation) {
        this.orientation = orientation;
    }

    public User() {
    }

    public User(String name, String firstName, LocalDate geboortedatum, String email, boolean woman, String mainPhotoPath, List<String> photoPaths){
        setGeboortedatum(geboortedatum);
        setFirstName(firstName);
        setName(name);
        setEmail(email);
        setWoman(woman);
        setMainPhotoPath(mainPhotoPath);
        setPhotoPaths(photoPaths);
    }

    @Override
    public String toString() {
        return name + " " + firstName + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainPhotoPath, photoPaths, name, firstName, geboortedatum, email, woman, potService, matchService, users);
    }

    public List<String> getAllPhotoPaths()
    {
        List<String> dum = new ArrayList<>();
        dum.add(this.getMainPhotoPath());
        dum.addAll(this.getPhotoPaths());
        return dum;
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
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

    public String getMainPhotoPath() {
        return mainPhotoPath;
    }

    public void setMainPhotoPath(String mainPhotoPath) {
        this.mainPhotoPath = mainPhotoPath;
    }

    public List<String> getPhotoPaths() {
        System.out.println(System.getProperty("user.dir"));
        File folder = new File("src/main/resources/static/users/" + this.getEmail()+"/");
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> photoPaths = new ArrayList<>();



        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile() && !listOfFiles[i].getName().substring(listOfFiles[i].getName().length()-3).equals("txt")) {
                System.out.println("File " + listOfFiles[i].getName());
                photoPaths.add("users/" + this.getEmail() + "/" + listOfFiles[i].getName());
            }
        }

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

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public List<Defect> getDefects() {
        return defects;
    }

    public void setDefects(List<Defect> defects) {
        this.defects = defects;
    }

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }
}
