package me.bogeun.tutorial.repository;

import me.bogeun.tutorial.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
