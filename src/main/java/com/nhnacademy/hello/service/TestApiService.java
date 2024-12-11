package com.nhnacademy.hello.service;

import com.nhnacademy.hello.client.TestApiFeignClient;
import com.nhnacademy.hello.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TestApiService {
    private final TestApiFeignClient testApiFeignClient;

    public Member getMember(Long id){
        return testApiFeignClient.getMember(id);
    }
}
