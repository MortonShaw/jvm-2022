package com.morton.jvm.classloader;

/**
 * @author MortonShaw
 * @date 2021/7/8 20:33
 */
public class T009_WayToRun {

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            run();
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            run();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    static void run() {
        for (int i = 0; i < 1000000; i++) {
            int j = i;
        }
    }

}
