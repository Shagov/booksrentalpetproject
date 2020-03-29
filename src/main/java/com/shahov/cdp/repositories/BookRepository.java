package com.shahov.cdp.repositories;

import com.shahov.cdp.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findBookByName(String name);

    Book findById(long id);

    @Query(value = "select * from book_model", nativeQuery = true)
    List<Book> getAllBooksAvailable();

}
