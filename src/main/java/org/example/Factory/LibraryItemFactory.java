package org.example.Factory;

import org.example.Interface.LibraryItem;

public abstract class LibraryItemFactory {
    public abstract LibraryItem createItem(String title, String id);
}
