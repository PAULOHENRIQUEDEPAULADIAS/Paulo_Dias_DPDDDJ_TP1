package org.example;

import org.example.Interface.LibraryItem;
import org.example.Interface.Loan;
import org.example.Interface.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Library {
    private List<LibraryItem> items;
    private List<User> users;
    private List<Loan> loans;

    private static Library instance;

    private Library() {
        items = new ArrayList<>();
        users = new ArrayList<>();
        loans = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }


    public List<LibraryItem> getItems() {
        return items;
    }


    public void setDvds(List<LibraryItem> items) {
        this.items = items;
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUsersById(String id) {
        for (User u : users){
            if (u.getId().equals(id)){
                return u;
            }
        }
        return null;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public Loan getLoanById(String id) {
        for (Loan l : loans){
            if (l.getId().equals(id)){
                return l;
            }
        }
        return null;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
}
