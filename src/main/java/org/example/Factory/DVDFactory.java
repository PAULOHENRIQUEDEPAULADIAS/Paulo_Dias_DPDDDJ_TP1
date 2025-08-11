package org.example.Factory;

import org.example.Interface.LibraryItem;
import org.example.Model.DVD;

public class DVDFactory extends LibraryItemFactory {

    @Override
    public LibraryItem createItem(String title, String id) {
        return new DVD(title, id);
    }
}
