/**
 * Created by fengqiang on 2017/5/4.
 */
/*
集合框架的工具类。
Collections:集合框架的工具类。里面定义的都是静态方法。

Collections和Collection有什么区别？
Collection是集合框架中的一个顶层接口，它里面定义了单列集合的共性方法。
		它有两个常用的子接口，
		List：对元素都有定义索引。有序的。可以重复元素。
		Set：不可以重复元素。无序。

Collections是集合框架中的一个工具类。该类中的方法都是静态的
		提供的方法中有可以对list集合进行排序，二分查找等方法。
		通常常用的集合都是线程不安全的。因为要提高效率。
		如果多线程操作这些集合时，可以通过该工具类中的同步方法，将线程不安全的集合，转换成安全的。

*/
import java.util.*;
class CollectionsTest {
    public static void main(String[] args){
//        sortDemo();
        binarySearchDemo();
    }

    public static void sortDemo(){
        List<String> list = new ArrayList<String>();
        list.add("rr");
        list.add("z");
        list.add("ggg");
        list.add("aaaf");
        list.add("bbb");
        sop(list);
//        Collections.sort(list, new StrLenComparator());
        String max = Collections.max(list);
//        sop(list);
        sop(max);
    }

    public static void sop(Object object){
        System.out.println(object);
    }

    public static void binarySearchDemo(){
        List<String> list = new ArrayList<String>();
        list.add("rr");
        list.add("z");
        list.add("ggg");
        list.add("aaaf");
        list.add("bbb");
        list.add("l");
        list.add("o");
        Collections.sort(list, new StrLenComparator());
        sop(list);
        int num = halfSearch(list, "aa");
        sop(num);

    }

    public static int halfSearch(List<String> list, String key){
        int min,max,mid;
        min = 0;
        max = list.size()-1;
        while (min<max){
            mid = (min+max)>>1;
            String str = list.get(mid);
            int num = str.compareTo(key);
            if (num>0)
                max = mid-1;
            else if(num<0)
                min = mid+1;
            else
                return mid;
        }
        return -min-1;
    }
}


class StrLenComparator implements Comparator<String>{
    public int compare(String s1, String s2){
        if(s1.length()>s2.length())
            return 1;
        if(s1.length()<s2.length())
            return -1;
        return s1.compareTo(s2);
    }
}
