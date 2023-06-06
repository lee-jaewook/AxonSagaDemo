package com.example.orderservice.command.api.controller;

import com.example.orderservice.command.api.model.OrderRestModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderCommandController {

    public String createOrder(@RequestBody OrderRestModel orderRestModel){
        return "Order Created";
    }
}
