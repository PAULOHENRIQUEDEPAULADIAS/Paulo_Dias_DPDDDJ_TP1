package org.example.Model;

import org.example.Interface.LibraryItem;

public class Book implements LibraryItem {
    private String title;
    private String isbn;


    public Book(String title, String id) {
        this.title = title;
        this.isbn = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getIsbn() {
        return isbn;
    }
}
