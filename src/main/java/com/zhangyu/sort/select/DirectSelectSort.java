package com.zhangyu.sort.select;

import com.zhangyu.sort.SortBase;

/*
 * @author : Lordling_Zhang
 * @description : 直接选择排序
 * 排序原理 ： 从未排序列中选出最小的数，依次放到一排序列中(本质是最小值与待排序位置的值交换)
 * @date : 2018/7/22
 */
public class DirectSelectSort extends SortBase {

    public static void main(String[] args){

        int array[] = {3,1,6,23,6,23,675,3,26,48,33,2};
        beforeSort(array);
        for (int i = 0; i < array.length; i ++){
            int min = array[i];// 当前轮最小值
            int minUnder = i;// 当前最小值下标
            for (int j = i + 1; j < array.length; j ++){
                if (array[j] < min){
                    min = array[j];
                    minUnder = j;
                }
            }
            array[minUnder] = array[i];
            array[i] = min;
        }
        afterSort(array);
    }
}
