package com.zhangyu.sort.charu;

import com.zhangyu.sort.SortBase;

/*
 * @author : Lordling_Zhang
 * @description : 简单排序
 * 原理： 从第二个数字开始  ，与排在前面的数字相比较（从前面队列的最后面往前比），
 *       如果>=前一位，则位置不变，换下一个数字开始比较，如果比前一位小，则前面的数字往后移动一位，
 *       比较的数字继续往前比较，直到不小于前一位数字，此轮排序结束，开始下一轮。
 * @date : 2018/7/19
 */
public class JianDanSort extends SortBase {

    public static void main(String[] args){

        int[] originArry = {12, 24,452,1,334,2,8,3,253,32};
        beforeSort(originArry);

        for (int i = 1 ; i < originArry.length; i ++){
            // 记录下一个带插入字段位置   只需从第二个开始
            int temp = originArry[i];
            // j用于被比较值的位置
            int j;
            for (j = i - 1; j >= 0; j --){
                if (originArry[j] > temp){
                    // 临时值较小，需要往前移动一位
                    originArry[j + 1] = originArry[j];
                }else {
                    break;
                }
            }
            originArry[j + 1] = temp;

        }

        afterSort(originArry);

    }
}
