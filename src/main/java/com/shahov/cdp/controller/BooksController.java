package com.shahov.cdp.controller;

import com.shahov.cdp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class BooksController {

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
}
