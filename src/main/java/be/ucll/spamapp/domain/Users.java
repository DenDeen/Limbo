package be.ucll.spamapp.domain;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
@Service
public class Users {

    private ArrayList<User> users = new ArrayList<>();
    private static final Users INSTANCE = new Users();


    private Users(){
        User user1 = new Zombie();
        User user2 = new Human();
        User user3 = new Human();
        User user4 = new Zombie();
        user1.setName("beast");
        user1.setFirstName("eric");
        user1.setGeboortedatum(LocalDate.now());
        user1.setWoman(false);
        user1.setEmail("ericbeast@yahoo.com");
        user1.setMainPhotoPath("users/"+user1.getEmail()+"/profile.jpg");
        ((Zombie) user1).setDate(LocalDate.now());
        PotService potService1 = new PotService();
        potService1.setCurrentUser(user1);
        potService1.addPotentieel(user2);
        user1.setPotService(potService1);
        MatchService matchService1 = new MatchService();
        matchService1.setCurrentuser(user1);
        user1.setMatchService(matchService1);
        users.add(user1);
        user1.setUsers(this);

        user2.setName("plane");
        user2.setFirstName("jane");
        user2.setGeboortedatum(LocalDate.now());
        user2.setWoman(true);
        user2.setEmail("janeplane@gmail.com");
        user2.setMainPhotoPath("users/"+user2.getEmail()+"/profile.jpg");
        PotService potService2 = new PotService();
        potService2.setCurrentUser(user2);
        potService2.addPotentieel(user1);
        MatchService matchService2 = new MatchService();
        matchService2.setCurrentuser(user2);
        user2.setPotService(potService2);
        user2.setMatchService(matchService2);
        users.add(user2);
        user2.setUsers(this);

        user3.setName("doe");
        user3.setFirstName("john");
        user3.setGeboortedatum(LocalDate.now());
        user3.setWoman(true);
        user3.setEmail("johndoe@outlook.com");
        user3.setMainPhotoPath("users/"+user3.getEmail()+"/profile.jpg");
        PotService potService3 = new PotService();
        potService3.setCurrentUser(user3);
        potService3.addPotentieel(user1);
        MatchService matchService3 = new MatchService();
        matchService3.setCurrentuser(user3);
        user3.setPotService(potService3);
        user3.setMatchService(matchService3);
        users.add(user3);
        user3.setUsers(this);

        user4.setName("flint");
        user4.setFirstName("rachel");
        user4.setGeboortedatum(LocalDate.now());
        user4.setWoman(false);
        user4.setEmail("rachelflint@yahoo.com");
        user4.setMainPhotoPath("users/"+user4.getEmail()+"/profile.jpg");
        ((Zombie) user4).setDate(LocalDate.now());
        PotService potService4 = new PotService();
        potService4.setCurrentUser(user4);
        potService4.addPotentieel(user3);
        MatchService matchService4 = new MatchService();
        matchService4.setCurrentuser(user4);
        user4.setPotService(potService4);
        user4.setMatchService(matchService4);
        users.add(user4);
        user4.setUsers(this);
        potService1.addPotentieel(user3);
        potService1.addPotentieel(user4);
    }

    public static Users getInstance(){
        return INSTANCE;
    }

    public void setPersons(ArrayList<User> persons) {
        this.users = persons;
    }

    public ArrayList<User> getPersons() {
        return users;
    }

    public void addPerson(User person){
        users.add(person);
    }

    public User removeNextPerson(User person){
        return users.remove(0);
    }


}
