package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TopStudentsTest {

    @Test
    void test_case_1() {
        String[] positive_feedback = new String[]{"smart","brilliant","studious"};
        String[] negative_feedback = new String[]{"not"};
        String[] report = new String[]{"this student is studious","the student is smart"};
        int[] student_id = new int[]{1,2};
        int k = 2;
        TopStudents solution = new TopStudents();
        List<Integer> integers = solution.topStudents(positive_feedback, negative_feedback, report, student_id, k);
        assertArrayEquals(new Integer[]{1,2}, integers.toArray());

    }

    @Test
    void test_case_2() {
        String[] positive_feedback = new String[]{"smart","brilliant","studious"};
        String[] negative_feedback = new String[]{"not"};
        String[] report = new String[]{"this student is not studious","the student is smart"};
        int[] student_id = new int[]{1,2};
        int k = 2;
        TopStudents solution = new TopStudents();
        List<Integer> integers = solution.topStudents(positive_feedback, negative_feedback, report, student_id, k);
        assertArrayEquals(new Integer[]{2,1}, integers.toArray());

    }

}