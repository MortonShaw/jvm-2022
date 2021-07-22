package com.morton.jvm.cacheline;

import sun.misc.Contended;

/**
 * @author MortonShaw
 * @date 2021/7/22 22:35
 */
public class T05_Contended {

    @Contended
    volatile long x;
    @Contended
    volatile long y;

    public static void main(String[] args) throws InterruptedException {
        T05_Contended t = new T05_Contended();
        Thread t1 = new Thread(() -> {
            for (long i = 0; i < 100_000_000L; i++) {
                t.x = i;
            }
        });
        Thread t2 = new Thread(() -> {
            for (long i = 0; i < 100_000_000L; i++) {
                t.y = i;
            }
        });
        long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(System.currentTimeMillis() - start);
    }

}
