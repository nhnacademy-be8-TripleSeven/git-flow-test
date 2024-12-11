package com.nhnacademy.hello.client;

import com.nhnacademy.hello.domain.Member;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "gateway")
public interface TestApiFeignClient {
    @GetMapping("/api/members")
    Member getMember(@RequestParam Long id);
}
