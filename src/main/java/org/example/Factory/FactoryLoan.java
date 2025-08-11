package org.example.Factory;

import org.example.Interface.Loan;
import org.example.Interface.User;
import org.example.Model.Book;
import org.example.Model.DefaultLoan;

import java.util.Date;

public class FactoryLoan {
    public Loan createLoan(String id, User user, Book book, Date dueDate) {
        return new DefaultLoan(id, user, book, dueDate );
    }
}
