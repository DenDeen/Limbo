package be.ucll.spamapp.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Restaurants {
    ArrayList<Restaurant> restaurants;

    public Restaurants() {
        this.restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Alma 1",	"Tiensestraat 115 – 3000 Leuven",	"3.9/5"));
        restaurants.add(new Restaurant("Alma 2",	"E. Van Evenstraat 2 – 3000 Leuven",	"4.5/5"));
        restaurants.add(new Restaurant("Alma 3",	"Steengroevenlaan 3 – 3001 Heverlee",	"4.1/5"));
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }
}
