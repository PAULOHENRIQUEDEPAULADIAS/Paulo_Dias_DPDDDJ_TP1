package org.example.Model;

import org.example.Interface.Loan;
import org.example.Interface.User;

import java.util.Date;

public class DefaultLoan implements Loan {
    private String id;
    private User user;
    private Book book;
    private Date dueDate;

    public DefaultLoan(String id, User user, Book book, Date dueDate) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.dueDate = dueDate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Date getDueDate() {
        return dueDate;
    }

    @Override
    public boolean isOverdue() {
        Date today = new Date();
        return dueDate.before(today);
    }
}
