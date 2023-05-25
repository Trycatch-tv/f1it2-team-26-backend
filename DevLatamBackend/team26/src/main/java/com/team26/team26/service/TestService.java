package com.team26.team26.service;

import com.team26.team26.dto.TestRequestDTO;
import com.team26.team26.dto.TestResponseDTO;

public interface TestService {
    TestResponseDTO testHolaMundo(TestRequestDTO request);
}
