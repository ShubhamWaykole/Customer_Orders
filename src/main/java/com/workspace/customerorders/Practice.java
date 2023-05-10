package com.workspace.customerorders;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String args[]) {
        String s = "aabbcasd";
        Stream<Character> charStream = s.chars().mapToObj(
                c -> (char) c
        );

        System.out.println(charStream.filter(c -> c.equals('a')).count());

    }
}
