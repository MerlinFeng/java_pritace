/**
 * Created by fengqiang on 2017/4/24.
 */
/*
练习：
创建两个线程，和主线程交替运行。

原来线程都有自己默认的名称。
Thread-编号 该编号从0开始。


static Thread currentThread():获取当前线程对象。
getName(): 获取线程名称。

设置线程名称：setName或者构造函数。



*/

class Test extends Thread {
//    private String name;
    Test(String name){
        super(name);
    }

    public void run(){
        for (int i = 0; i < 60; i++) {
            System.out.println((Thread.currentThread() == this)+"==="+this.getName()+"===="+i);
//            System.out.println((Thread.currentThread()==this)+"..."+this.getName()+" run..."+x);
        }
    }
}

class ThreadTest{
    public static void main(String[] args){
        Test d1 = new Test("one+++");
        Test d2 = new Test("two++++");
        d1.start();
        d2.start();

    }
}
