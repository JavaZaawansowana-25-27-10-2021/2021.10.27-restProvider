package com.comarch.rest.provider.controllers;

import com.comarch.rest.provider.model.Book;
import com.comarch.rest.provider.model.Order;
import com.comarch.rest.provider.model.dto.BookRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import java.util.Date;

@RestController
@RequestMapping("/book2")
public class BookController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getBook(@PathVariable int id) {
        Book book = new Book();
        book.setTitle("jakis tytul");
        book.setAuthor("jakis autor");
        book.setId(id);
        book.setIsbn("345-345-345");
        book.setPrice(100.99);

        return book;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Book> getBooks() {
        Book book = new Book();
        book.setTitle("jakis tytul");
        book.setAuthor("jakis autor");
        book.setId(10);
        book.setIsbn("345-345-345");
        book.setPrice(100.99);

        List<Book> books = new ArrayList<>();
        books.add(book);
        return books;
    }

    @RequestMapping(value = "/filter", method = RequestMethod.GET)
    public List<Book> getBooks(@RequestParam String filter1, @RequestParam String filter2) {
        Book book = new Book();
        book.setTitle("jakis tytul");
        book.setAuthor("jakis autor");
        book.setId(10);
        book.setIsbn("345-345-345");
        book.setPrice(100.99);

        List<Book> books = new ArrayList<>();
        books.add(book);
        return books;
    }


    /*private List<Book> getBooks() {
        Book book = new Book();
        book.setTitle("jakis tytul");
        book.setAuthor("jakis autor");
        book.setId(10);
        book.setIsbn("345-345-345");
        book.setPrice(100.99);

        List<Book> books = new ArrayList<>();
        books.add(book);
        return books;
    }

    private List<Book> getBooksWithFilters() {
        Book book = new Book();
        book.setTitle("jakis tytul");
        book.setAuthor("jakis autor");
        book.setId(10);
        book.setIsbn("345-345-345");
        book.setPrice(100.99);

        List<Book> books = new ArrayList<>();
        books.add(book);
        return books;
    }*/

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBook() {
        //??
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Book updateBook(@RequestBody BookRequest request) {
        return request.getBook();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Book putBook(@RequestBody Book book2) {
        Book book = new Book();
        book.setTitle("jakis tytul");
        book.setAuthor("jakis autor");
        book.setId(10);
        book.setIsbn("345-345-345");
        book.setPrice(100.99);
        return book;
    }

    /*@RequestMapping(value = "", method = RequestMethod.POST)
    public Book postBook(@RequestBody Book book2) {
        Book book = new Book();
        book.setTitle("jakis tytul");
        book.setAuthor("jakis autor");
        book.setId(10);
        book.setIsbn("345-345-345");
        book.setPrice(100.99);
        return book;
    }*/

    @RequestMapping(value = "/temp", method = RequestMethod.GET)
    public ResponseEntity<Book> order(@RequestBody String param) {
        if(param.equals("abc")) {
            Book book = new Book();
            book.setTitle("jakis tytul");
            book.setAuthor("jakis autor");
            book.setId(10);
            book.setIsbn("345-345-345");
            book.setPrice(100.99);
            return ResponseEntity.ok(book);
        } else {
            return ResponseEntity.status(400).build();
        }
    }
}
