package com.jsonpath;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public class APp {
    public static void main(String[] args) {
        String json = """
                {
                    "a": null
                }
                """;
        Map<String, Object> b = JsonPath.parse(json)
                .set("$.a", "b")
                .json();
        System.out.println(b);
        A a = new ObjectMapper().convertValue(b, A.class);
        a.getMap().forEach((k, v) -> System.out.println(k + " " + v));
    }
}

@Data
class A {
    public Map<String, Object> getMap() {
        return map;
    }

    @JsonAnyGetter
    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @JsonAnySetter
    public void addProp(String k, Object v) {
        this.map.put(k, v);
    }

    @JsonIgnore
    private Map<String, Object>map = new HashMap<>();
}
