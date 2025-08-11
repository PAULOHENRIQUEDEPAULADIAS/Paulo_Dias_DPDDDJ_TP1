package org.example.Model;

import org.example.Interface.Subscriber;
import org.example.Interface.User;

public class DefaultUser implements User, Subscriber {
    private String id;
    private String name;
    private String email;

    public DefaultUser(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        System.out.println("Enviando para " + email + ": " + message);
    }

    @Override
    public String getEmail(){
        return email;
    };
}
