
import java.util.*;
public class Hello{
    public static void main (String [] args) {
        int[] nums = {1,2,3,4,5,7};

//        bubblesort(nums);
//        selectsort(nums);
//        printArray(nums);
        int ret = get_index(nums,6);
        System.out.println(ret);
    }


    //冒泡排序
    public static void  bubblesort(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]<nums[j+1])
                {
                    swap(nums,j,j+1);
                }
            }
        }
    }

    //选择排序
    public static  void selectsort(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]>nums[j])
                {
                    swap(nums,i,j);
                }
            }

        }
    }

        /*
    数组的查找操作。

    练习：有一个有序的数组，想要将一个元素插入到该数组中，
    还要保证该数组是有序的。如何获取该元素在数组中的位置。

    */

    public static int get_index(int[] nums, int a)
    {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<a && nums[i+1]>a)
            {
                return i+1;
            }
        }
        return 0;
    }


    public static void printArray(int[] nums) {
        if(nums.length == 0 )
        {
            System.out.print("no array");
        }
        System.out.print('[');
        for (int i = 0; i < nums.length; i++) {
            if(i != nums.length-1)
            {
                System.out.print(nums[i]+" ,");
            }else{
                System.out.print(nums[i]+"]");
            }

        }
    }

    public static void swap(int [] nums, int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


}