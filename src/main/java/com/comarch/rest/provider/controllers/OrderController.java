package com.comarch.rest.provider.controllers;

import com.comarch.rest.provider.model.Book;
import com.comarch.rest.provider.model.Order;
import com.comarch.rest.provider.model.dto.OrderDTO;
import com.comarch.rest.provider.model.dto.OrderDTOBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OrderDTO getOrderById(@PathVariable int id) {
        Order order = new Order();
        order.setId(id);
        order.setDate(new Date());
        order.getBooks().add(new Book(1, "String title", "String author", "2345-2345-34", 50.99));
        order.getBooks().add(new Book(2, "String title", "String author", "2345-2345-3445", 50.99));

        OrderDTO orderDTO = new OrderDTOBuilder()
                .setId(order.getId())
                .setDate(order.getDate())
                .addBook(new Book(1, "String title", "String author", "2345-2345-34", 50.99))
                .addBook(new Book(2, "String title", "String author", "2345-2345-3445", 50.99))
                .build();

        return orderDTO;
    }


}
