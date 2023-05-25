package com.team26.team26.service;

import com.team26.team26.dto.TestRequestDTO;
import com.team26.team26.dto.TestResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements  TestService{
    @Override
    public TestResponseDTO testHolaMundo(TestRequestDTO request) {
        TestResponseDTO response= new TestResponseDTO("hola "+request.getName());
        return response;
    }
}
