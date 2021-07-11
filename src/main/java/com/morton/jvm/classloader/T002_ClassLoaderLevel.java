package com.morton.jvm.classloader;

/**
 * @author MortonShaw
 * @date 2021/7/8 16:11
 */
class T002_ClassLoaderLevel {

    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());
        System.out.println(T002_ClassLoaderLevel.class.getClassLoader());
    }

}
