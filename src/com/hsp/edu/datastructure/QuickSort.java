package com.hsp.edu.datastructure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {

    public static void QuickSort(int[] arr ,int left ,int right) {

        // left 为当前排序数组第一个索引
        // right 为当前排序数组最后一个索引

        // 非法判断 如果Left > right  直接跳出循环
        if ( left > right ) {
            return;
        }

        //定义基准数 初始化为最左边的数
        int base = arr[left];

        // 定义两个指针 i j 初始化为left right
        int i = left;
        int j = right;



        // 开始排序,每一次排序 循环条件为 i != j
        while ( i != j) {

            // 先移动右边的指针寻找比基准数更小的数
            // 如果比基准数大就继续循环
            while ( arr[j] >=  base && i < j) {
                    j--;
            }

            // 再移动左边的指针寻找比基准数更大的数
            // 如果比基准数小就继续循环
            while ( arr[i] <=  base && i < j) {
                    i++;
            }

            // 交换两个找到数的位置
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        // 当 i = j时交换基准数和i索引处位置的元素
        arr[left] = arr[i];
        arr[i] = base;


        // 递归调用方法排序左子序列
        QuickSort(arr,left,i-1);

        // 递归调用方法排序右子序列
        QuickSort(arr,i+1,right);



    }

    public static void main(String[] args) {

        int[] arr = {4,6,3,2,7,9,22};

        QuickSort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));

    }
}
