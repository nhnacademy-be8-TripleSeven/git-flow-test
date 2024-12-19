package com.tripleseven.frontapi.service;

import com.tripleseven.frontapi.client.TestApiFeignClient;
import com.tripleseven.frontapi.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class TestApiService {
    private final TestApiFeignClient testApiFeignClient;

    public Member getMember(Long id) {
        return testApiFeignClient.getMember(id);
    }
}
