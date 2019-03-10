package com.alex.library.springlibrary.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private boolean taken;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "books_authors",
            joinColumns = { @JoinColumn(name = "book_id") },
            inverseJoinColumns = { @JoinColumn(name = "author_id") })
    private Set<Author> authors; //owner of the relationship

    @ManyToOne
    private Publisher publisher;

    @ManyToOne
    private User user;

    public Book() {
    }

    public Book(String title, boolean taken, Set<Author> authors, Publisher publisher, User user) {
        this.title = title;
        this.taken = taken;
        this.authors = authors;
        this.publisher = publisher;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getId() == book.getId() &&
                isTaken() == book.isTaken() &&
                getTitle().equals(book.getTitle()) &&
                getAuthors().equals(book.getAuthors()) &&
                getPublisher().equals(book.getPublisher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), isTaken(), getAuthors(), getPublisher());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taken=" + taken +
                ", authors=" + authors +
                ", publisher=" + publisher +
                ", user=" + user +
                '}';
    }
}
