package org.example;

import org.example.Factory.FactoryLoan;
import org.example.Factory.UserFactory;
import org.example.Interface.LibraryItem;
import org.example.Interface.Loan;
import org.example.Interface.User;
import org.example.Model.Book;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class LibraryFacade {

    private Library library;
    private FactoryLoan factoryLoan;
    private UserFactory userFactory;

    public LibraryFacade() {
        this.library = Library.getInstance();
        this.factoryLoan = new FactoryLoan();
        this.userFactory = new UserFactory();
    }

    public void addUser(User user) {
        library.getUsers().add(user);
    }

    public List<User> listUsers() {
        return library.getUsers();
    }

    public User listUserById(String id) {
        return library.getUsersById(id);
    }


    public void addItem(LibraryItem item) {
        library.addItem(item);
    }

    public List<LibraryItem> listItems() {
        return library.getItems();
    }


    public Loan loanBook(User user, LibraryItem item, Date dueDate) {
        String id = UUID.randomUUID().toString();
        Loan loan = factoryLoan.createLoan(id, user, (Book) item, dueDate);
        library.getLoans().add(loan);
        return loan;
    }

    public List<Loan> listLoans() {
        return library.getLoans();
    }

    public boolean returnLoan(String loanId) {
        Loan loanToRemove = null;
        for (Loan loan : library.getLoans()) {
            if (loan.getId().equals(loanId)) {
                loanToRemove = loan;
                break;
            }
        }
        if (loanToRemove != null) {
            library.getLoans().remove(loanToRemove);

            return true;
        }
        return false;
    }
}
