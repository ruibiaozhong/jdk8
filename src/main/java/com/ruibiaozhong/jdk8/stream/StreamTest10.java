package com.ruibiaozhong.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest10 {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello1", "world2", "hello world");
        list.stream().mapToInt(String::length).filter(item -> item == 5)
                .findFirst().ifPresent(System.out::println);
        System.out.println("--------------------------");

        list.stream().mapToInt(item -> {
            System.out.println(item);
            return item.length();
        }).filter(item -> 5 == item)
                .findFirst().ifPresent(System.out::println);


    }








}
