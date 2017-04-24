/**
 * Created by fengqiang on 2017/4/21.
 */
/*
需求：
银行有一个金库。
有两个储户分别存300员，每次存100，存3次。

目的：该程序是否有安全问题，如果有，如何解决？


如何找问题：
1，明确哪些代码是多线程运行代码。
2，明确共享数据。
3，明确多线程运行代码中哪些语句是操作共享数据的。
*/
class Bank {
    private int summ;

    public synchronized void add(int n) {
        summ += n;
        try {
            Thread.sleep(10);
        } catch (Exception e) {

        }
        System.out.println(summ);
    }
}

class Cus implements Runnable {
    private Bank b = new Bank();

    public void run() {
        for(int i=0; i<3; i++){
            b.add(100);
        }
    }
}

class BankDemo{
    public static void main(String[] args){
        Cus c = new Cus();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}





