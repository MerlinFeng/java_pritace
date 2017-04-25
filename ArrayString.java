/**
 * Created by fengqiang on 2017/4/25.
 */

/*
"12 0 99 -7 30 4 100 13"
要求对字符串中的数值进行排序。生成一个数值从小到大新字符串。

"-7 0 4 12 13 30 99 100"

思路：
1，将字符串切割。变成字符串数组。
2，将字符串数组转成int数组。
3，int数组排序。
4，将int数组变成字符串。

*/

import java.util.*;
class ArrayString {
    public static void main(String[] args){
        String str = "12 0 99 -7 30 4 100 13";
        String newstr = StringNumberSort(str);
        System.out.println(newstr);
    }


    public  static String StringNumberSort(String str){
        String[] arr = str.split(" ");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(nums);
        return Array2String(nums);
    }

    public static String Array2String(int[] arr){
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]+" ");
        }

        return str.toString();
    }
}
