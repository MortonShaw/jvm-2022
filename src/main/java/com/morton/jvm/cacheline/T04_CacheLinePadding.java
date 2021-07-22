package com.morton.jvm.cacheline;

/**
 * @author MortonShaw
 * @date 2021/7/22 22:33
 */
public class T04_CacheLinePadding {

    public static volatile long[] arr = new long[16];

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (long i = 0; i < 1_000_000_000L; i++) {
                arr[0] = i;
            }
        });
        Thread t2 = new Thread(() -> {
            for (long i = 0; i < 1_000_000_000L; i++) {
                arr[8] = i;
            }
        });
        long start = System.nanoTime();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(System.nanoTime() - start);
    }

}
