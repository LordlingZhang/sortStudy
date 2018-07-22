package com.zhangyu.sort.change;

import com.zhangyu.sort.SortBase;

/*
 * @author : Lordling_Zhang
 * @description : 冒泡排序
 * 排序原理： 从第一个开始遍历，每次把最大一个往后移
 * @date : 2018/7/22
 */
public class MaoPaoSort extends SortBase{

    public static void main(String[] args){

        int[] array = {4,2,73,26,27,3,3832,2,2772,67,213};
        beforeSort(array);
        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array.length - i -1; j ++ ){
                if (array[j] > array[j + 1]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        afterSort(array);
    }
}
