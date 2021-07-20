package me.bogeun.tutorial.service;

import lombok.RequiredArgsConstructor;
import me.bogeun.tutorial.dto.BookDto;
import me.bogeun.tutorial.model.Book;
import me.bogeun.tutorial.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;
    private final BookshelfService bookshelfService;

    public List<Book> getAllBookList() {
        return bookRepository.findAll();
    }

    public void createBook(BookDto bookDto) {
        Book book = Book.builder()
                .title(bookDto.getTitle())
                .author(bookDto.getAuthor())
                .build();

        bookshelfService.getOneById(bookDto.getBookshelfId()).addBook(book);

        bookRepository.save(book);
    }

    public Book getOneById(Long id) {
        return bookRepository.findById(id).orElseGet(Book::new);
    }

}
