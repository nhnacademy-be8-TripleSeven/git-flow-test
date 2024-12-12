package com.nhnacademy.front.controller;

import com.nhnacademy.front.domain.Member;
import com.nhnacademy.front.service.TestApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestApiController {
    private final TestApiService testApiService;

    @GetMapping("/api/members")
    public Member getMember(@RequestParam Long id) {
        return testApiService.getMember(id);
    }
}
