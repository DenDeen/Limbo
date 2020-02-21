package be.ucll.spamapp.domain;

public class Restaurant {
    String name;
    String address;
    String rating;

    public Restaurant(String name, String address, String rating) {
        this.name = name;
        this.address = address;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getRating() {
        return rating;
    }
}
