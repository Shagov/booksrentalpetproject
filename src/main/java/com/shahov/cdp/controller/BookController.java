package com.shahov.cdp.controller;

import com.shahov.cdp.model.Book;
import com.shahov.cdp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(value = "/")
    public String greeting(){
        return "hello";
    }

    @GetMapping(value = "table")
    public String table(Model model){
        model.addAttribute("books",bookService.getAllBooks());
        return "table";
    }

    @GetMapping("book-view/{bookId}")
    public String bookDetailsView(@PathVariable("bookId") String bookId, Model model){
        System.out.println(bookId);
    Book bookModel = bookService.getBookById(bookId);
        System.out.println(bookModel);
    model.addAttribute( bookModel);
    return "book-view";
    }
}
