package com.morton.jvm.classloader;

/**
 * @author MortonShaw
 * @date 2021/7/8 22:03
 */
public class T001_ClassLoadingProcedure {

    public static void main(String[] args) {
        System.out.println(T.count);
    }

}

class T {

    static T t = new T();
    static int count = 2;

    private T() {
        count++;
        System.out.println("--" + count);
    }

}
