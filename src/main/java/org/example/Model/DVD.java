package org.example.Model;

import org.example.Interface.LibraryItem;

public class DVD implements LibraryItem {
    private String title;
    private String id;

    public DVD(String title, String id) {
        this.title = title;
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getIsbn() {
        return id;
    }
}
