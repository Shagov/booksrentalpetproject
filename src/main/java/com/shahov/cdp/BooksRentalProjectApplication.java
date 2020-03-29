package com.shahov.cdp;

import com.shahov.cdp.model.Book;
import com.shahov.cdp.repositories.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BooksRentalProjectApplication extends SpringBootServletInitializer {

    private static final Logger log = LoggerFactory.getLogger(BooksRentalProjectApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BooksRentalProjectApplication.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BooksRentalProjectApplication.class);
    }


}
