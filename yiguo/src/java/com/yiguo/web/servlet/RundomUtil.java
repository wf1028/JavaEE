package com.yiguo.web.servlet;

import java.util.Random;

public class RundomUtil {
    public static Integer number(){
        // 种子你可以随意生成，但不能重复
        int[] seed = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ranArr = new int[9];
        Random ran = new Random();
        // 数量你可以自己定义。
        for (int i = 0; i < seed.length; i++) {
            // 得到一个位置
            int j = ran.nextInt(seed.length - i);
            // 得到那个位置的数值
            ranArr[i] = seed[j];
            // 将最后一个未用的数字放到这里
            seed[j] = seed[seed.length - 1 - i];
        }
        System.out.println(ranArr.hashCode());
        int a=ranArr.hashCode();
        return a;
    }
}
