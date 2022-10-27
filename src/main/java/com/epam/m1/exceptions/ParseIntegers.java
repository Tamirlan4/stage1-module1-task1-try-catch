package com.epam.m1.exceptions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {
        Iterator<String> words = WORDS.iterator();
        int sum = 0;
        String justWords ="";
        int number = 0;
        String next="";
        while (words.hasNext()) {
            try {
                next = words.next();
                number = Integer.parseInt(next);
            }catch (NumberFormatException e){
                justWords += next + " ";
                number = 0;
            }finally {
                sum+=number;
            }
            // todo: complete it
        }
        System.out.println("Sum is " + sum);
        System.out.println("Just words: " + justWords);
    }
}

