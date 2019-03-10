package com.alex.library.springlibrary.entities;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue
    private int id;
    private String isbn;
    private String name;

    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> books;

    public Publisher() {
    }

    public Publisher(String isbn, String name, Set<Book> books) {
        this.isbn = isbn;
        this.name = name;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher)) return false;
        Publisher publisher = (Publisher) o;
        return getId() == publisher.getId() &&
                getIsbn().equals(publisher.getIsbn()) &&
                getName().equals(publisher.getName()) &&
                getBooks().equals(publisher.getBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getIsbn(), getName(), getBooks());
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
