/**
 * Created by fengqiang on 2017/4/28.
 */
/*
Arrays:用于操作数组的工具类。
里面都是静态方法。


asList:将数组变成list集合
*/

import java.util.*;
class ArraysTest {
    public static void main(String[] args){
        /*把数组变成list集合有什么好处？

		可以使用集合的思想和方法来操作数组中的元素。

		注意：将数组变成集合，不可以使用集合的增删方法。
		因为数组的长度是固定。
		contains。
		get
		indexOf()
		subList();

		如果你增删。那么会反生UnsupportedOperationException,

		*/
        String[] arr= {"aa", "bb", "cc", "dd"};
        List<String> list = Arrays.asList(arr);
        sop(list.get(2));

        sop(list);
        Integer[] num = {4,5,6};
        List<Integer> numlist = Arrays.asList(num);
        sop(numlist);
    }

    public static void sop(Object obj){
        System.out.println(obj);
    }
}
