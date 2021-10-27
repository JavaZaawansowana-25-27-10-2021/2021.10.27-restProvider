package com.comarch.rest.provider.model.dto;

import com.comarch.rest.provider.model.Book;
import org.springframework.hateoas.Link;
import com.comarch.rest.provider.controllers.BookController;
import java.util.Date;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

public class OrderDTOBuilder {
    OrderDTO orderDTO = new OrderDTO();

    public OrderDTOBuilder() {
    }

    public OrderDTOBuilder setId(int id) {
        this.orderDTO.setId(id);
        return this;
    }

    public OrderDTOBuilder setDate(Date date) {
        this.orderDTO.setDate(date);
        return this;
    }

    public OrderDTOBuilder addBook(Book book) {
        Link link = linkTo(
                methodOn(BookController.class).getBook(book.getId())
        ).withRel("book");
        this.orderDTO.getBooks().add(link);
        return this;
    }

    public OrderDTO build() {
        return this.orderDTO;
    }
}