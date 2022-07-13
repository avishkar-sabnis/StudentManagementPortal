package com.school.convent.Model;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "tbl_book")
public class BookModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;

        @Column(name = "book_name")
        private String bookName;

        //Many to Many to Publisher Entity

        @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        @JoinTable(name = "book_publisher",
                joinColumns = @JoinColumn(
                        name = "book_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "publisher_id", referencedColumnName = "id")
        )
        private Set<PublisherModel> publishers;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public Set<PublisherModel> getPublishers() {
            return publishers;
        }

        public void setPublishers(Set<PublisherModel> publishers) {
            this.publishers = publishers;
        }

        public BookModel( String bookName, Set<PublisherModel> publishers) {
            super();
            this.bookName = bookName;
            this.publishers = publishers;
        }

        public BookModel() {}

        @Override
        public String toString() {

            String result = String.format("Book Data  [id=%d,name='%s']%n", id, bookName);
            // Book Data[id=1,name='Book A']

            if (publishers != null)
                for (PublisherModel publisher : publishers) {

                    result += String.format("Publisher [id=%d,name='%s']%n", publisher.getId(),
                            publisher.getPublisherName());
                }

            return result;

        }




    }


