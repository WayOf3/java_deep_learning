package com.hsp.edu.chapter05;



public class Java03_Object_Test_2 {

    public static void main(String[] args) {

        // TODO 常见类和对象
        // 数组

        int nums[] = {1,4,3,5,2};

        // TODO 希望获取到的数据: 1，2，3，4，5
        // 选择排序

        int swap;
        for (int j = 0; j < nums.length; j++) {
            int maxIndex = 0; // 每次重置为最开始的索引
            for (int i = 1; i < nums.length - j ; i++) {
                if (nums[i] > nums[maxIndex]) {
                    maxIndex = i;
                }

            }
            swap = nums[nums.length - 1 - j];
            nums[nums.length - 1 - j] = nums[maxIndex];
            nums[maxIndex] = swap;
        }




        for (int num : nums) {
            System.out.println(num);
        }




    }
}

