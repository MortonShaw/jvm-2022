package com.morton.jvm.c4_runtime_data_area_and_instruction_set;

/**
 * @author MortonShaw
 * @date 2021/7/9 15:38
 */
public class TestIPlusPlus {

    public static void main(String[] args) {
        int i = 8;
//        i = i++;
        i = ++i;
        System.out.println(i);
    }

}
