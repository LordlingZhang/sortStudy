package com.zhangyu.sort.charu;

import com.zhangyu.sort.SortBase;

/*
 * @author : Lordling_Zhang
 * @description : 插入排序-二分法排序
 * 原理： 先定义两个边指left与right，由此可以得到mid中间值，
 *       然后被比较的对象与中间值比较，如果对象较大，那么中间值+1作为left，
 *       如果对象较小，那么中间值-1作为right。
 *       一轮结束之后，把left+1到被比较对象前一个所有数据右移一步，
 *       最后被比较对象直接插入left+1这个位置
 * @date : 2018/7/19
 */
public class ErFenSort extends SortBase {

    public static void main(String[] args){
        int[] originArry = {12, 24,452,1,334,2,8,3,253,32};
        beforeSort(originArry);

        // 从第一个开始遍历被比较对象
        for (int i = 0; i < originArry.length; i ++){
            int temp = originArry[i]; // 记录被比较的值
            int left = 0;
            int right = i - 1;

            // 确认左右两个位置
            while (left <= right){
                int mid = (left + right) / 2;
                if (originArry[mid] > temp){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
            // 插入节点位置右移
            for (int j = i - 1; j >= left ; j --){
                originArry[j + 1] = originArry[j];
            }
            // 插入对象
            if (left != i){
                originArry[left] = temp;
            }

        }
        afterSort(originArry);

    }


}
