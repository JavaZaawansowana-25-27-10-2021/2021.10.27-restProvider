package com.comarch.rest.provider.model.dto;

import org.springframework.hateoas.Link;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDTO {
    private int id;
    private Date date;
    private List<Link> books = new ArrayList<>();

    public OrderDTO(int id, Date date, List<Link> books) {
        this.id = id;
        this.date = date;
        this.books = books;
    }

    public OrderDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Link> getBooks() {
        return books;
    }

    public void setBooks(List<Link> books) {
        this.books = books;
    }
}
