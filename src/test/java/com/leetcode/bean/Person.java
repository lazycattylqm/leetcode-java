package com.leetcode.bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Person {
    public Person(String name) {
        log.info("Person constructor {}", name);
    }

    public void sayHello() {
        log.info("Hello");
    }

}
