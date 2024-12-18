package com.nhnacademy.front.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/api/frontend/member/my-page")
    public String getMyPage() {
        return "/member/my-page";
    }

    @GetMapping("/frontend/guest/orders")
    public String searchGuestOrder() {
        return "/guest/order-search";
    }

    @GetMapping("/frontend/guest/find/order-number")
    public String findGuestOrderNumbers() {
        return "/guest/search/order-number";
    }

    @GetMapping("/frontend/guest/find/order-password")
    public String findGuestOrderPassword() {
        return "/guest/search/order-password";
    }
}
