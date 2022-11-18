package com.leetcode.bean;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bean {

    private String name;

    private String secondName;

    private Integer group;

    private Integer seq;


    public int innerHash() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSecondName() != null ? getSecondName().hashCode() : 0);
        result = 31 * result + (getGroup() != null ? getGroup().hashCode() : 0);
        return result;
    }

}
