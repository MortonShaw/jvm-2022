package com.morton.jvm.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author MortonShaw
 * @date 2021/7/8 21:34
 */
public class T011_ClassReloading extends ClassLoader {

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        String path = "D:/" + name.replaceAll("\\.", "/") + ".class";
        File file = new File(path);
        try {
            if (!file.exists()) {
                return super.loadClass(name);
            }
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int i = 0;
            while ((i = fis.read()) > -1) {
                baos.write(i);
            }
            byte[] bytes = baos.toByteArray();
            return defineClass(name, bytes, 0, bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.loadClass(name);
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ClassLoader classLoader = new T011_ClassReloading();
        Class<?> clazz = classLoader.loadClass("com.morton.jvm.classloader.Hello");
        Object o = clazz.newInstance();

        classLoader = new T011_ClassReloading();
        Class<?> clazz2 = classLoader.loadClass("com.morton.jvm.classloader.Hello");
        Object o2 = clazz2.newInstance();

        System.out.println(classLoader.getClass().getClassLoader());
        System.out.println(o.getClass().getClassLoader());

        System.out.println(clazz == clazz2);
        System.out.println(o == o2);
    }

}
