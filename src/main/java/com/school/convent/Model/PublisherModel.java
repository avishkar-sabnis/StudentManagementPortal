package com.school.convent.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="publisher")
public class PublisherModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;



    @Column(name="publisher_name")
    private String publisherName;

    @ManyToMany(mappedBy = "publishers")
    private Set<BookModel> books;





    public PublisherModel(String publisherName) {
        this.publisherName=publisherName;
    }


    public PublisherModel() {}
    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getPublisherName() {
        return publisherName;
    }


    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }


    public Set<BookModel> getBooks() {
        return books;
    }


    public void setBooks(Set<BookModel> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String result = String.format
                ("Publisher [id=%d, name='%s']%n", id, publisherName);
        if (books != null) {
            for (BookModel book : books) {
                result += String.format("Book[id=%d, name='%s']%n", book.getId(),
                        book.getBookName());
            }
        }

        return result;
    }


}