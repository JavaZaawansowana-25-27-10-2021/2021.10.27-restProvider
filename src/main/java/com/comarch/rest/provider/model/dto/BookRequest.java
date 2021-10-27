package com.comarch.rest.provider.model.dto;

import com.comarch.rest.provider.model.Book;
import com.comarch.rest.provider.model.Order;

public class BookRequest {
    private Order order;
    private Book book;

    public BookRequest(Order order, Book book) {
        this.order = order;
        this.book = book;
    }

    public BookRequest() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
