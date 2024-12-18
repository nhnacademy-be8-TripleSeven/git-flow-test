package com.nhnacademy.front.controller.cart;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

    @GetMapping("/frontend/cart")
    public String getCart() {
        return "/order/cart";
    }

    @GetMapping("/frontend/order")
    public String order() {
        return "/order/order";
    }

    @GetMapping("/frontend/order/payment")
    public String pay() {
        return "/order/payment";
    }

    @GetMapping("/frontend/complete-order")
    public String completeOrder() {
        return "/order/complete";
    }

    public String
}
