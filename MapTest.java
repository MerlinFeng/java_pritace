/**
 * Created by fengqiang on 2017/4/25.
 */
/*
每一个学生都有对应的归属地。
学生Student，地址String。
学生属性：姓名，年龄。
注意：姓名和年龄相同的视为同一个学生。
保证学生的唯一性。



1，描述学生。

2，定义map容器。将学生作为键，地址作为值。存入。

3，获取map集合中的元素。

*/
import java.util.*;
class Student implements Comparable<Student>{
    private int age;
    private String name;
    Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String toString()
    {
        return name+":"+age;
    }

    public int compareTo(Student s){
        int num = new Integer(this.age).compareTo(new Integer(s.age));
        if (num == 0)
            return this.name.compareTo(s.name);
        return num;
    }


    public boolean equals(Object obj)
    {
        if(!(obj instanceof Student))
            throw new ClassCastException("类型不匹配");

        Student s = (Student)obj;

        return this.name.equals(s.name) && this.age==s.age;
    }
}

class MapTest {
    public static void main(String[] args){
        HashMap<Student, String> hm = new HashMap<Student, String>();
        hm.put(new Student("feng", 20),"beijing");
        hm.put(new Student("lisi1",21),"beijing1");
        hm.put(new Student("lisi1",21),"beijing2");
        hm.put(new Student("lisi3",21),"beijing3");

        Set<Student> keySet = hm.keySet();
        Iterator<Student> it = keySet.iterator();

        while (it.hasNext()){
            Student stu = it.next();
            String addr = hm.get(stu);
            System.out.println(stu+"======"+addr);
        }
    }
}
