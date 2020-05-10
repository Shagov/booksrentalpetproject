package com.shahov.cdp.service;

import com.shahov.cdp.model.Book;
import com.shahov.cdp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book getBookByName(String name){
        return bookRepository.findBookByName(name).get(0);
    }

    public List<Book> getAllBooks(){
        return bookRepository.getAllBooksAvailable();
    }

    public Book getBookById(String id){
        long idToGet = Long.parseLong(id);
        return bookRepository.findById(idToGet);
    }
}
