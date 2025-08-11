package org.example.Factory;

import org.example.Interface.LibraryItem;
import org.example.Model.Book;

public class BookFactory extends LibraryItemFactory {

    @Override
    public LibraryItem  createItem(String title, String isbn) {
        return new Book(title, isbn);
    }
}
