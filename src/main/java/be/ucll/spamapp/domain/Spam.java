package be.ucll.spamapp.domain;

import org.springframework.context.annotation.Bean;

import java.util.Random;

public class Spam {
    String[] spam = {"Hier gratis gehoorbeschadiging", "Dr. Vandenkistens 10 stappen tot minder buikvet",
            "Bill Gates fountation wilt u 1000000USD schenken", "Grote drol", "ga naar 9GAG.com for funny jokes"};
    public Spam(){

    }
    @Bean
    public String getSpam(){
        return spam[new Random().nextInt(4)];
    }
}
