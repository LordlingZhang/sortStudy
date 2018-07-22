package com.zhangyu.sort.change;

import com.zhangyu.sort.SortBase;

/*
 * @author : Lordling_Zhang
 * @description : 快速排序
 * 排序原理: 把第一个值作为关键点，把比这个值小的放其左边，大的放右边，然后对分成的两边的两个数组继续以前面同样的方式，
 *          按大小分类，本质上就是不断的按大小划分归类
 * @date : 2018/7/22
 */
public class QuickSort extends SortBase{

    public static void main(String[] args){

        int[] array = {43,7,2,783,2,82,1,80,38,3,2};
        beforeSort(array);
        mainSort(array, 0, array.length - 1);
        afterSort(array);

    }

    public static void mainSort(int[] a, int start, int end){
        if (start < end){
            int mid = getMid(a, start, end);
            mainSort(a, 0, mid - 1);
            mainSort(a, mid + 1, end);
        }
    }

    public  static int getMid(int[] a, int start, int end){
        // 设为基准
        int temp = a[start];
        while (start < end){
            // 从后往前找到比基准小的
            while (start < end && a[end] >= temp){
                end --;
            }
            a[start] = a[end];
            // 从前往后找到比基准大的
            while (start < end && a[start] <= temp){
                start ++;
            }
            a[end] = a[start];
        }
        a[start] = temp;
        return start;

    }
}
