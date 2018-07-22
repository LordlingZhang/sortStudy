package com.zhangyu.sort.charu;

import com.zhangyu.sort.SortBase;

/*
 * @author : Lordling_Zhang
 * @description : 希尔排序  （排序图见附件shell.jpg）
 * 排序流程：先把数组长度对2取模（并非一定是2，只是通常），得到的值作为分组数，分成 n/2组
 *          把每一组里面的值按简单排序。每一组排序完毕之后，把分组数再次对2取模，后续操作同上，
 *          知道取模之后的数为1，那么排序结束
 * @date : 2018/7/22
 */
public class ShellSort extends SortBase{

    public static void main(String[] args){

        int[] array = {1,35,21,1,623,236,89,9,3,73,2};
        beforeSort(array);
        // 分组数
        int d = array.length ;
        while (true){
            // 得到新的分组数
            d = d / 2;
            // 对分组的每组第一个进行遍历
            for (int x = 0 ; x < d; x ++){
                // 对每一组内的数据开始简单插入排序
                for (int i = x + d; i < array.length; i = i + d){
                    int temp = array[i];
                    int j;
                    // 简单排序，从后往前，本质也是：只要大于temp，那么都往后移动一个
                    for( j = i - d; j >= 0 && temp < array[j]; j = j - d){
                        array[j + d] = array[j];
                    }
                    array[j + d] = temp;// 此处+d的原因是上面的for循环最后-d了
                }
            }
            // 排序结束
            if (d == 1){
                break;
            }
        }

        afterSort(array);


    }
}
