package be.ucll.spamapp.domain;

import org.springframework.stereotype.Service;

@Service
public class Account {
    String email;
    String password;

    public Account() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
