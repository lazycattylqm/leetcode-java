package com.leetcode.lqm.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Inner {
    public void run(String s) {
        log.info("this is inner run {}", s);
    }
}
