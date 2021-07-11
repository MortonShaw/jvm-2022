package com.morton.jvm.jmm;

/**
 * @author MortonShaw
 * @date 2021/7/9 14:12
 */
public class TestSynchronized {

    synchronized void m() {

    }

    void n() {
        synchronized (this) {

        }
    }

}
