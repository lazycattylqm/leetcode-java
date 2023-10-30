package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void groupAnagrams() {
        List<List<String>> lists =
                new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    @Test
    void groupAnagrams2() {
        List<List<String>> lists =
                new GroupAnagrams().groupAnagrams(new String[]{"", ""});
    }
}