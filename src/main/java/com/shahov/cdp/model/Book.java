package com.shahov.cdp.model;

import javax.persistence.*;

@Entity
@Table(name = "book_model")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "isbn")
    private String isbn;

    public Book() {
    }

    public Book(String name, String isbn) {
        this.name = name;
        this.isbn = isbn;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
