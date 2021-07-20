package me.bogeun.tutorial.repository;

import me.bogeun.tutorial.model.Book;
import me.bogeun.tutorial.model.Bookshelf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookshelfRepository extends JpaRepository<Bookshelf, Long> {
}
