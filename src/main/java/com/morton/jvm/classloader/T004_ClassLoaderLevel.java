package com.morton.jvm.classloader;

/**
 * @author MortonShaw
 * @date 2021/7/8 16:25
 */
class T004_ClassLoaderLevel {

    public static void main(String[] args) {
        System.out.println(T004_ClassLoaderLevel.class.getClassLoader());
        System.out.println(T004_ClassLoaderLevel.class.getClassLoader().getClass().getSuperclass().getClassLoader());
        System.out.println(T004_ClassLoaderLevel.class.getClassLoader().getParent());
        System.out.println(T004_ClassLoaderLevel.class.getClassLoader().getParent().getParent());
    }

}
