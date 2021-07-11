package com.morton.jvm.c5_gc;

/**
 * -XX:-DoEscapeAnalysis -XX:-EliminateAllocations -XX:-UseTLAB
 * 逃逸分析 标量替换 线程专有对象分配
 *
 * @author MortonShaw
 * @date 2021/7/9 22:29
 */
public class TestTLAB {

    class User {
        int id;
        String name;

        User(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    void alloc(int i) {
        new User(i, "name " + i);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000_1000L; i++) {
            new TestTLAB().alloc(i);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

}
