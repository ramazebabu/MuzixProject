package com.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
public static void main(String args[]){
    Map<String, String> books = new HashMap<>();
    books.put("serial-1001", "Design patterns : elements of reusable object-oriented software");
    books.put("serial-1002-1", "Effective Java - First Edition");
    books.put("serial-1003", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
    books.put("serial-1002-2", "Effective Java - Second Edition");

    List<String> collect = books.entrySet().stream()
            .filter(e -> e.getKey().startsWith("serial-1002"))
            .map(Map.Entry::getValue)
            .collect(Collectors.toList());
    System.out.println(collect);
}
}
