package com.leetcode;

import java.util.*;

public class TopStudents {

    private record Student(int id, int score) {
    }

    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report,
                                     int[] student_id, int k) {
        Map<String, Integer> scoreMap = initScoreMap(positive_feedback, negative_feedback);
        List<Student> students = new ArrayList<>();
        for (int id = 0; id < student_id.length; id++) {
            String s = report[id];
            List<String> words = divideReport(s);
            int score = calcScore(words, scoreMap);
            students.add(new Student(student_id[id], score));
        }
        students.sort((s1, s2) -> {
            if (s1.score() == s2.score()) {
                return s1.id() - s2.id();
            }
            return s2.score() - s1.score();
        });

        return students.stream()
                .map(Student::id)
                .limit(k)
                .toList();


    }

    private Map<String, Integer> initScoreMap(String[] positiveFeedback, String[] negativeFeedback) {
        Map<String, Integer> scoreMap = new HashMap<>();
        for (String s : positiveFeedback) {
            scoreMap.put(s, 3);
        }
        for (String s : negativeFeedback) {
            scoreMap.put(s, -1);
        }
        return scoreMap;

    }

    private List<String> divideReport(String report) {
        return Arrays.stream(report.split(" "))
                .toList();

    }

    private int calcScore(List<String> reportWords, Map<String, Integer> scoreMap) {
        int score = 0;
        for (String word : reportWords) {
            score += scoreMap.getOrDefault(word, 0);
        }
        return score;
    }

}
