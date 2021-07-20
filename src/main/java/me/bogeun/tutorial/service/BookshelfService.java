package me.bogeun.tutorial.service;

import lombok.RequiredArgsConstructor;
import me.bogeun.tutorial.model.Bookshelf;
import me.bogeun.tutorial.repository.BookshelfRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BookshelfService {

    private final BookshelfRepository bookshelfRepository;

    public List<Bookshelf> getAllBookshelfList() {
        return bookshelfRepository.findAll();
    }

    public Bookshelf getOneById(Long bookshelfId) {
        Optional<Bookshelf> byId = bookshelfRepository.findById(bookshelfId);

        return byId.orElseGet(Bookshelf::new);
    }
}
