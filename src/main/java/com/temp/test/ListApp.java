package com.temp.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListApp {
    public static void main(String[] args) {
        List<Node> nodes = List.of(new Node(1, "A"), new Node(1, "B"), new Node(1, "C"))
                .stream()
                .collect(Collectors.groupingBy(Node::getSeq))
                .entrySet()
                .stream()
                .map(v -> v.getValue()
                        .get(0))
                .toList();
        nodes.forEach(System.out::println);

    }


}

class Node {
    int seq;
    String value;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node(int seq, String value) {
        this.seq = seq;
        this.value = value;
    }

    @Override public String toString() {
        return "Node{" +
                "seq=" + seq +
                ", value='" + value + '\'' +
                '}';
    }
}
