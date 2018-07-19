package com.zhangyu.sort;

/*
 * @author : Lordling_Zhang
 * @description : 排序父类
 * @date : 2018/7/19
 */
public class SortBase {

    /**
     * 排序之前
     * @param arry
     */
    public static void beforeSort(int[] arry){
        System.out.print("before sort :");
        for (int origin : arry){
            System.out.print(origin + " ");
        }
        System.out.println();
    }
    /**
     * 排序之后
     * @param arry
     */
    public static void afterSort(int[] arry){
        System.out.print("after sort :");
        for (int origin : arry){
            System.out.print(origin + " ");
        }
        System.out.println();
    }

}
