package me.bogeun.tutorial.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.bogeun.tutorial.dto.BookDto;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String author;

    @ManyToOne
    private Bookshelf bookshelf;




    @Builder
    public Book(String title, String author, Bookshelf bookshelf) {
        this.title = title;
        this.author = author;
        this.bookshelf = bookshelf;
    }

    public void setBookshelf(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
    }

    public void updateBook(BookDto bookDto) {
        this.title = bookDto.getTitle();
        this.author = bookDto.getAuthor();
    }
}
