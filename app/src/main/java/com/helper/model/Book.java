package com.helper.model;

/**
 * @author Mike
 * @date 20161112
 * @version 1.0
 */

public class Book {

    public String title;
    public String author;
    public String price;

    public Book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPrice() {
        return price;
    }
}
