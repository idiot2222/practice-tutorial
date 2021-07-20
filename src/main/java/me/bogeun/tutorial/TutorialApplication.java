package me.bogeun.tutorial;

import me.bogeun.tutorial.model.Bookshelf;
import me.bogeun.tutorial.repository.BookshelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialApplication implements CommandLineRunner {

    @Autowired
    BookshelfRepository bookshelfRepository;

    public static void main(String[] args) {
        SpringApplication.run(TutorialApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Bookshelf a = Bookshelf.builder()
                            .name("A")
                            .floor(1)
                            .build();
        Bookshelf b = Bookshelf.builder()
                            .name("B")
                            .floor(1)
                            .build();
        Bookshelf c = Bookshelf.builder()
                            .name("C")
                            .floor(2)
                            .build();

        bookshelfRepository.save(a);
        bookshelfRepository.save(b);
        bookshelfRepository.save(c);

    }
}
