package org.example.Factory;

import org.example.Interface.User;
import org.example.Model.DefaultUser;

public class UserFactory {
    public User createUser(String id, String name, String email) {
        return new DefaultUser(id, name, email);
    }
}
