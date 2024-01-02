package com.leetcode.lqm.model;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;


@Slf4j
public class Wrapper {
    private Inner inner;

    public Inner getInner() {
        return inner;
    }

    public void setInner(Inner inner) {
        this.inner = inner;
    }

    public void run(String s) {
        log.info("this is wrapper run");
        Optional.ofNullable(inner).ifPresent(v->v.run(s));
    }
}
