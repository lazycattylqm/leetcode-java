package com.leetcode.lqm.model;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@Slf4j
public class ModelTest {
    @InjectMocks
    private Wrapper wrapper;

    @Spy
    Inner inner = new Inner();

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void case_1() {
        Mockito.doAnswer(invocationOnMock -> {
            log.info("this is mock inner run");
            return null;
        }).when(inner).run(Mockito.anyString());
        wrapper.run("");

        Mockito.verify(inner).run(Mockito.anyString());
    }

    @Test
    void case_2() {
        Mockito.doAnswer(invocationOnMock -> {
            log.info("this is mock inner run");
            return null;
        }).when(inner).run(ArgumentMatchers.argThat(v-> v.equals("Y")));
        Mockito.doCallRealMethod().when(inner).run(ArgumentMatchers.argThat(v-> !v.equals("Y")));
        wrapper.run("N");
        wrapper.run("Y");
        Mockito.verify(inner).run("Y");
    }
}
