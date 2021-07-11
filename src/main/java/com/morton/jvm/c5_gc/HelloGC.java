package com.morton.jvm.c5_gc;

import java.util.LinkedList;
import java.util.List;

/**
 * @author MortonShaw
 * @date 2021/7/10 16:04
 */
public class HelloGC {

    public static void main(String[] args) {
        System.out.println("hello out of memory!");
        List<byte[]> list = new LinkedList<>();
        while (true) {
            list.add(new byte[1024 * 1024]);
        }
    }

}
