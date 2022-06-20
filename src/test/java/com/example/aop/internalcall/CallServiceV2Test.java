package com.example.aop.internalcall;

import com.example.aop.internalcall.aop.CallLogAspect;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@Import(CallLogAspect.class)
@SpringBootTest
class CallServiceV2Test {
    @Autowired
    private CallServiceV2 callServiceV2;

    @Test
    void external() {
        callServiceV2.external();
    }

    @Test
    void internal() {
        callServiceV2.internal();
    }
}