package com.morton.jvm.classloader;

/**
 * @author MortonShaw
 * @date 2021/7/8 21:00
 */
public class T010_Parent {

    private static class MyLoader extends ClassLoader {
        public MyLoader() {
            super(new T006_MortonClassLoader());
            System.out.println(getSystemClassLoader());
            System.out.println(this.getParent());
        }
    }

    public static void main(String[] args) {
        new MyLoader();
    }

}
