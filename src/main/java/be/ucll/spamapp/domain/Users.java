package be.ucll.spamapp.domain;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
@Service
public class Users {

    private ArrayList<User> users = new ArrayList<>();
    private static final Users INSTANCE = new Users();


    private Users(){
        User user1 = new Human();
        User user2 = new Zombie();
        User user3 = new Zombie();
        User user4 = new Zombie();
        User user5 = new Zombie();
        User user6 = new Zombie();
        User user7 = new Zombie();
        User user8 = new Zombie();
        User user9 = new Zombie();
        User user10 = new Zombie();
        User user11 = new Zombie();
        User user12 = new Zombie();
        User user13 = new Zombie();
        User user14 = new Zombie();
        User user15 = new Zombie();
        User user16 = new Zombie();
        User user17 = new Zombie();
        User user18 = new Zombie();
        User user19 = new Zombie();
        User user20 = new Zombie();

        user1.setName("Beast");
        user1.setFirstName("Eric");
        user1.setGeboortedatum(LocalDate.now());
        user1.setWoman(false);
        user1.setEmail("ericbeast@yahoo.com");
        user1.setMainPhotoPath("users/"+user1.getEmail()+"/profile.jpg");
        PotService potService1 = new PotService();
        potService1.setCurrentUser(user1);
        potService1.addPotentieel(user2);
        potService1.addPotentieel(user3);
        potService1.addPotentieel(user2);
        potService1.addPotentieel(user5);
        potService1.addPotentieel(user6);
        potService1.addPotentieel(user7);
        potService1.addPotentieel(user8);
        potService1.addPotentieel(user9);
        potService1.addPotentieel(user10);
        potService1.addPotentieel(user11);
        potService1.addPotentieel(user12);
        potService1.addPotentieel(user13);
        potService1.addPotentieel(user14);
        potService1.addPotentieel(user15);
        potService1.addPotentieel(user16);
        potService1.addPotentieel(user17);
        potService1.addPotentieel(user18);
        potService1.addPotentieel(user19);
        potService1.addPotentieel(user20);
        user1.setPotService(potService1);
        MatchService matchService1 = new MatchService();
        matchService1.setCurrentuser(user1);
        user1.setMatchService(matchService1);
        users.add(user1);
        user1.setUsers(this);
        user1.setLength(175);
        user1.setAge(34);
        user1.setOrientation('m');

        user2.setName("Plane");
        user2.setFirstName("Jane");
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
        user2.setLength(175);
        user2.setAge(20);
        user2.setOrientation('m');


        user3.setName("Doe");
        user3.setFirstName("John");
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
        user3.setLength(175);
        user3.setAge(18);
        user3.setOrientation('m');

        user4.setName("Flint");
        user4.setFirstName("Rachel");
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
        user4.setLength(175);
        user4.setAge(19);
        user4.setOrientation('m');

        user5.setName("Advertisement");
        user5.setFirstName("Advertisement");
        user5.setGeboortedatum(LocalDate.now());
        user5.setWoman(false);
        user5.setEmail("barcoadvertisements@gmail.com");
        user5.setMainPhotoPath("users/"+user5.getEmail()+"/profile.jpg");
        ((Zombie) user5).setDate(LocalDate.now());
        PotService potService5 = new PotService();
        potService5.setCurrentUser(user5);
        potService5.addPotentieel(user6);
        user5.setPotService(potService5);
        MatchService matchService5 = new MatchService();
        matchService5.setCurrentuser(user5);
        user5.setMatchService(matchService5);
        users.add(user5);
        user5.setUsers(this);
        user5.setLength(175);
        user5.setAge(0);
        user5.setOrientation('m');

        user6.setName("Dec");
        user6.setFirstName("Jonas");
        user6.setGeboortedatum(LocalDate.now());
        user6.setWoman(true);
        user6.setEmail("jonasdec@gmail.com");
        user6.setMainPhotoPath("users/"+user6.getEmail()+"/profile.jpg");
        PotService potService6 = new PotService();
        potService6.setCurrentUser(user6);
        potService6.addPotentieel(user1);
        MatchService matchService6 = new MatchService();
        matchService6.setCurrentuser(user6);
        user6.setPotService(potService6);
        user6.setMatchService(matchService6);
        users.add(user6);
        user6.setUsers(this);
        user6.setLength(175);
        user6.setAge(44);
        user6.setOrientation('m');

        user7.setName("Ghi");
        user7.setFirstName("Martijn");
        user7.setGeboortedatum(LocalDate.now());
        user7.setWoman(true);
        user7.setEmail("martijnghi@outlook.com");
        user7.setMainPhotoPath("users/"+user7.getEmail()+"/profile.jpg");
        PotService potService7 = new PotService();
        potService7.setCurrentUser(user7);
        potService7.addPotentieel(user1);
        MatchService matchService7 = new MatchService();
        matchService7.setCurrentuser(user7);
        user7.setPotService(potService7);
        user7.setMatchService(matchService7);
        users.add(user7);
        user7.setUsers(this);
        user7.setLength(175);
        user7.setAge(21);
        user7.setOrientation('m');

        user8.setName("Abc");
        user8.setFirstName("Quentin");
        user8.setGeboortedatum(LocalDate.now());
        user8.setWoman(false);
        user8.setEmail("quentinabc@yahoo.com");
        user8.setMainPhotoPath("users/"+user8.getEmail()+"/profile.jpg");
        ((Zombie) user8).setDate(LocalDate.now());
        PotService potService8 = new PotService();
        potService8.setCurrentUser(user8);
        potService8.addPotentieel(user3);
        MatchService matchService8 = new MatchService();
        matchService8.setCurrentuser(user8);
        user8.setPotService(potService8);
        user8.setMatchService(matchService8);
        users.add(user8);
        user8.setUsers(this);
        user8.setLength(175);
        user8.setAge(66);
        user8.setOrientation('m');

        user9.setName("Jkl");
        user9.setFirstName("Mikkel");
        user9.setGeboortedatum(LocalDate.now());
        user9.setWoman(false);
        user9.setEmail("mikkeljkl@yahoo.com");
        user9.setMainPhotoPath("users/"+user9.getEmail()+"/profile.jpg");
        ((Zombie) user9).setDate(LocalDate.now());
        PotService potService9 = new PotService();
        potService9.setCurrentUser(user9);
        potService9.addPotentieel(user10);
        user9.setPotService(potService9);
        MatchService matchService9 = new MatchService();
        matchService9.setCurrentuser(user9);
        user9.setMatchService(matchService9);
        users.add(user9);
        user9.setUsers(this);
        user9.setLength(175);
        user9.setAge(77);
        user9.setOrientation('m');

        user10.setName("Advertisements");
        user10.setFirstName("Advertisements");
        user10.setGeboortedatum(LocalDate.now());
        user10.setWoman(true);
        user10.setEmail("barcoadvertisements@gmail.com");
        user10.setMainPhotoPath("users/"+user10.getEmail()+"/profile.jpg");
        PotService potService10 = new PotService();
        potService10.setCurrentUser(user10);
        potService10.addPotentieel(user1);
        MatchService matchService10 = new MatchService();
        matchService10.setCurrentuser(user10);
        user10.setPotService(potService10);
        user10.setMatchService(matchService10);
        users.add(user10);
        user10.setUsers(this);
        user10.setLength(175);
        user10.setAge(0);
        user10.setOrientation('m');

        user11.setName("Marascalco");
        user11.setFirstName("Ariel");
        user11.setGeboortedatum(LocalDate.now());
        user11.setWoman(true);
        user11.setEmail("arielmarascalco@outlook.com");
        user11.setMainPhotoPath("users/"+user11.getEmail()+"/profile.jpg");
        PotService potService11 = new PotService();
        potService11.setCurrentUser(user11);
        potService11.addPotentieel(user1);
        MatchService matchService11 = new MatchService();
        matchService11.setCurrentuser(user11);
        user11.setPotService(potService11);
        user11.setMatchService(matchService11);
        users.add(user11);
        user11.setUsers(this);
        user11.setLength(175);
        user11.setAge(30);
        user11.setOrientation('m');

        user12.setName("Hosch");
        user12.setFirstName("Matthew");
        user12.setGeboortedatum(LocalDate.now());
        user12.setWoman(false);
        user12.setEmail("matthewhosch@yahoo.com");
        user12.setMainPhotoPath("users/"+user12.getEmail()+"/profile.jpg");
        ((Zombie) user12).setDate(LocalDate.now());
        PotService potService12 = new PotService();
        potService12.setCurrentUser(user12);
        potService12.addPotentieel(user3);
        MatchService matchService12 = new MatchService();
        matchService12.setCurrentuser(user12);
        user12.setPotService(potService12);
        user12.setMatchService(matchService12);
        users.add(user12);
        user12.setUsers(this);
        user12.setLength(175);
        user12.setAge(25);
        user12.setOrientation('m');

        user13.setName("JefCoat");
        user13.setFirstName("Sunni");
        user13.setGeboortedatum(LocalDate.now());
        user13.setWoman(false);
        user13.setEmail("sunnijefcoat@yahoo.com");
        user13.setMainPhotoPath("users/"+user13.getEmail()+"/profile.jpg");
        ((Zombie) user13).setDate(LocalDate.now());
        PotService potService13 = new PotService();
        potService13.setCurrentUser(user13);
        potService13.addPotentieel(user2);
        user13.setPotService(potService13);
        MatchService matchService13 = new MatchService();
        matchService13.setCurrentuser(user13);
        user13.setMatchService(matchService13);
        users.add(user13);
        user13.setUsers(this);
        user13.setLength(175);
        user13.setAge(29);
        user13.setOrientation('m');

        user14.setName("Emerald");
        user14.setFirstName("Kelly");
        user14.setGeboortedatum(LocalDate.now());
        user14.setWoman(true);
        user14.setEmail("kellyemerald@gmail.com");
        user14.setMainPhotoPath("users/"+user14.getEmail()+"/profile.jpg");
        PotService potService14 = new PotService();
        potService14.setCurrentUser(user14);
        potService14.addPotentieel(user1);
        MatchService matchService14 = new MatchService();
        matchService14.setCurrentuser(user14);
        user14.setPotService(potService14);
        user14.setMatchService(matchService14);
        users.add(user14);
        user14.setUsers(this);
        user14.setLength(175);
        user14.setAge(59);
        user14.setOrientation('m');

        user15.setName("Advertisements");
        user15.setFirstName("Advertisements");
        user15.setGeboortedatum(LocalDate.now());
        user15.setWoman(true);
        user15.setEmail("barcoadvertisements@gmail.com");
        user15.setMainPhotoPath("users/"+user15.getEmail()+"/profile.jpg");
        PotService potService15 = new PotService();
        potService15.setCurrentUser(user15);
        potService15.addPotentieel(user1);
        MatchService matchService15 = new MatchService();
        matchService15.setCurrentuser(user15);
        user15.setPotService(potService15);
        user15.setMatchService(matchService15);
        users.add(user15);
        user15.setUsers(this);
        user15.setLength(175);
        user15.setAge(0);
        user15.setOrientation('m');

        user16.setName("Decamp");
        user16.setFirstName("Leda");
        user16.setGeboortedatum(LocalDate.now());
        user16.setWoman(false);
        user16.setEmail("ledadecamp@yahoo.com");
        user16.setMainPhotoPath("users/"+user16.getEmail()+"/profile.jpg");
        ((Zombie) user16).setDate(LocalDate.now());
        PotService potService16 = new PotService();
        potService16.setCurrentUser(user16);
        potService16.addPotentieel(user3);
        MatchService matchService16 = new MatchService();
        matchService16.setCurrentuser(user16);
        user16.setPotService(potService16);
        user16.setMatchService(matchService16);
        users.add(user16);
        user16.setUsers(this);
        user16.setLength(175);
        user16.setAge(27);
        user16.setOrientation('m');

        user17.setName("Harton");
        user17.setFirstName("Weston");
        user17.setGeboortedatum(LocalDate.now());
        user17.setWoman(false);
        user17.setEmail("westonharton@yahoo.com");
        user17.setMainPhotoPath("users/"+user17.getEmail()+"/profile.jpg");
        ((Zombie) user17).setDate(LocalDate.now());
        PotService potService17 = new PotService();
        potService17.setCurrentUser(user17);
        potService17.addPotentieel(user2);
        user17.setPotService(potService17);
        MatchService matchService17 = new MatchService();
        matchService17.setCurrentuser(user17);
        user17.setMatchService(matchService17);
        users.add(user17);
        user17.setUsers(this);
        user17.setLength(175);
        user17.setAge(55);
        user17.setOrientation('m');

        user18.setName("Couvilier");
        user18.setFirstName("Amber");
        user18.setGeboortedatum(LocalDate.now());
        user18.setWoman(true);
        user18.setEmail("ambercouvilier@gmail.com");
        user18.setMainPhotoPath("users/"+user18.getEmail()+"/profile.jpg");
        PotService potService18 = new PotService();
        potService18.setCurrentUser(user18);
        potService18.addPotentieel(user1);
        MatchService matchService18 = new MatchService();
        matchService18.setCurrentuser(user18);
        user18.setPotService(potService18);
        user18.setMatchService(matchService18);
        users.add(user18);
        user18.setUsers(this);
        user18.setLength(175);
        user18.setAge(90);
        user18.setOrientation('m');

        user19.setName("Donald");
        user19.setFirstName("Trump");
        user19.setGeboortedatum(LocalDate.now());
        user19.setWoman(true);
        user19.setEmail("trumpdonald@outlook.com");
        user19.setMainPhotoPath("users/"+user19.getEmail()+"/profile.jpg");
        PotService potService19 = new PotService();
        potService19.setCurrentUser(user19);
        potService19.addPotentieel(user1);
        MatchService matchService19 = new MatchService();
        matchService19.setCurrentuser(user19);
        user19.setPotService(potService19);
        user19.setMatchService(matchService19);
        users.add(user19);
        user19.setUsers(this);
        user19.setLength(175);
        user19.setAge(10);
        user19.setOrientation('m');

        user20.setName("Advertisements");
        user20.setFirstName("Advertisements");
        user20.setGeboortedatum(LocalDate.now());
        user20.setWoman(false);
        user20.setEmail("barcoadvertisements@gmail.com");
        user20.setMainPhotoPath("users/"+user20.getEmail()+"/profile.jpg");
        ((Zombie) user20).setDate(LocalDate.now());
        PotService potService20 = new PotService();
        potService20.setCurrentUser(user20);
        potService20.addPotentieel(user3);
        MatchService matchService20 = new MatchService();
        matchService20.setCurrentuser(user20);
        user20.setPotService(potService20);
        user20.setMatchService(matchService20);
        users.add(user20);
        user20.setUsers(this);
        user20.setLength(175);
        user20.setAge(0);
        user20.setOrientation('m');

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

    public User getUser(String email) {
        System.out.println(email);
        for (User u: users
             ) {
            if (u.getEmail().equals(email)){
                return u;
            }
        }

        throw new DomainException("user bestaat niet");
    }



}
