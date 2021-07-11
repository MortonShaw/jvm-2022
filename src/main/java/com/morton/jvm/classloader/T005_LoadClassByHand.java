package com.morton.jvm.classloader;

/**
 * @author MortonShaw
 * @date 2021/7/8 19:22
 */
public class T005_LoadClassByHand {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = T005_LoadClassByHand.class.getClassLoader().loadClass("com.morton.jvm.classloader.T002_ClassLoaderLevel");
        System.out.println(clazz.getName());
    }

}
