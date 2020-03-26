package Theme2;

import java.util.Scanner;

public class SingleLevelArrays {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        nums[3] = 20;
        nums[4] = 25;

        System.out.println(nums[3]);

        int[] nums2 = {1,2,3,4,5};

        dowhile(15);
    }

    public static void dowhile(int num){
        do {
            System.out.println(num++);
        }
        while (num < 10);
    }
}

