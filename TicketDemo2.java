/**
 * Created by fengqiang on 2017/4/24.
 */

/*

通过分析，发现，打印出0，-1，-2等错票。

多线程的运行出现了安全问题。

问题的原因：
	当多条语句在操作同一个线程共享数据时，一个线程对多条语句只执行了一部分，还没有执行完，
	另一个线程参与进来执行。导致共享数据的错误。

解决办法：
	对多条操作共享数据的语句，只能让一个线程都执行完。在执行过程中，其他线程不可以参与执行。



Java对于多线程的安全问题提供了专业的解决方式。

就是同步代码块。

synchronized(对象)
{
	需要被同步的代码

}
对象如同锁。持有锁的线程可以在同步中执行。
没有持有锁的线程即使获取cpu的执行权，也进不去，因为没有获取锁。

火车上的卫生间---经典。

同步的前提：
1，必须要有两个或者两个以上的线程。
2，必须是多个线程使用同一个锁。

必须保证同步中只能有一个线程在运行。


好处：解决了多线程的安全问题。

弊端：多个线程需要判断锁，较为消耗资源，

*/
class Ticket2 implements Runnable {
    private int tick = 100;
    Object obj = new Object();

    public void run(){
        while (true){
            synchronized (obj){
                if(tick>0){
                    System.out.println(Thread.currentThread().getName()+"++++++sale:"+tick--);
                }
            }

        }
    }
}


class TickeDemo2 {
    public static void main(String[] args){
        Ticket2 t = new Ticket2();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

