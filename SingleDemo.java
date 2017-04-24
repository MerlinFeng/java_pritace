/*
设计模式：解决某一类问题最行之有效的方法。
java中23种设计模式：
单例设计模式：解决一个类在内存只存在一个对象。


想要保证对象唯一。
1，为了避免其他程序过多建立该类对象。先禁止其他程序建立该类对象
2，还为了让其他程序可以访问到该类对象，只好在本类中，自定义一个对象。
3，为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。

这三部怎么用代码体现呢？
1，将构造函数私有化。
2，在类中创建一个本类对象。
3，提供一个方法可以获取到该对象。



对于事物该怎么描述，还怎么描述。
当需要将该事物的对象保证在内存中唯一时，就将以上的三步加上即可。


*/

class Single{



    private Single(){};
    private int num;

    /**
     * 这个是先初始化对象。
     称为：饿汉式。
     Single类一进内存，就已经创建好了对象。
     */
//    private static Single s = new Single();


//    public static Single getInstance(){
//        return s;
//    }

    //对象是方法被调用时，才初始化，也叫做对象的延时加载。成为：懒汉式。
    //Single类进内存，对象还没有存在，只有调用了getInstance方法时，才建立对象。
    private static Single s = null;
    public static Single getInstance(){
        synchronized(Single.class) { //Java语言的关键字，当它用来修饰一个方法或者一个代码块的时候，能够保证在同一时刻最多只有一个线程执行该段代码。
            if (s == null) {
                s = new Single();
            }
        }
        return s;
    }

    public void setNum(int num){
        this.num = num;
    }

    public void getNum(){
        System.out.println(this.num);
    }
}

class SingleDemo{
    public static void main(String[] args){
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        s1.setNum(666);
        s2.getNum();
    }
}