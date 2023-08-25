package com.leetcode.bean;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeanTest {

    @Test
    public void doBeanTest() {
        List<Bean> beans = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final Bean bean = new Bean("liqiming", "lqm", 1, i);
            beans.add(bean);
        }

        for (int i = 0; i < 5; i++) {
            final Bean bean = new Bean("liqiming", "lqm", 2, i);
            beans.add(bean);
        }

        for (int i = 0; i < 3; i++) {
            final Bean bean = new Bean("liqiming", "lqm", 3, i);
            beans.add(bean);
        }

        for (int i = 0; i < 1; i++) {
            final Bean bean = new Bean("liqiming", "lqm", 4, i);
            beans.add(bean);
        }

        final Map<Integer, List<Bean>> collect = beans.stream()
                .collect(Collectors.groupingBy(Bean::innerHash, Collectors.toList()));


        System.out.println(collect);
    }
}
