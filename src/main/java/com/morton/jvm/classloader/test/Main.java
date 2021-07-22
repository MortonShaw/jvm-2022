package com.morton.jvm.classloader.test;

/**
 * @author MortonShaw
 * @date 2021/7/12 17:06
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        MyClassLoad myClassLoad = new MyClassLoad();
        myClassLoad.loadClass("com.morton.jvm.classloader.test.ClassA", true);
        myClassLoad.loadClass("com.morton.jvm.classloader.test.ClassB", true);
    }

}

class MyClassLoad extends ClassLoader {

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return super.loadClass(name, resolve);
    }

}
