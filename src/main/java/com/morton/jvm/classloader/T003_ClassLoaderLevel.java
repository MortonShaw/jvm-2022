package com.morton.jvm.classloader;

/**
 * @author MortonShaw
 * @date 2021/7/8 16:11
 */
class T003_ClassLoaderLevel {

    public static void main(String[] args) {
        String bootstrap = System.getProperty("sun.boot.class.path");
        System.out.println(bootstrap.replaceAll(";", System.lineSeparator()));
        System.out.println("-----------------------------------------------------");
        String ext = System.getProperty("java.ext.dirs");
        System.out.println(ext.replaceAll(";", System.lineSeparator()));
        System.out.println("-----------------------------------------------------");
        String app = System.getProperty("java.class.path");
        System.out.println(app.replaceAll(";", System.lineSeparator()));
    }

}
