package com.nhnacademy.front.service;

import com.nhnacademy.front.client.TestApiFeignClient;
import com.nhnacademy.front.domain.Member;
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
