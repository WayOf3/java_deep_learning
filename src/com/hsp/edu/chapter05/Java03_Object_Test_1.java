package com.hsp.edu.chapter05;



public class Java03_Object_Test_1 {

    public static void main(String[] args) {

        // TODO 常见类和对象
        // 数组

        int nums[] = {1,4,3,5,2};

//        for (int num : nums) {
//            System.out.println(num);
//        }

        // TODO 希望获取到的数据: 1，2，3，4，5
        // 简化需求: 将数组中最大值放置数组的最后
        int swap;
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i< nums.length - j - 1; i++){
                if (nums[i] > nums[i+1]){
                    // 左边的数据大于右边的数据，应该交换位置
                    swap = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = swap;
                }
            }
        }


        for (int num : nums) {
            System.out.println(num);
        }



    }
}

