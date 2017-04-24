
# super

标签： super synchronized Runnable Thread

---

# super

---
###super

super可以理解为是指向自己超（父）类对象的一个指针，而这个超类指的是离自己最近的一个父类。

###this

this是自身的一个对象，代表对象本身，可以理解为：指向对象本身的一个指针。

---
# synchronized
---

### synchronized是Java中的关键字，是一种同步锁。它修饰的对象有以下几种： 
1. 修饰一个代码块，被修饰的代码块称为同步语句块，其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象； 
2. 修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象； 
3. 修改一个静态的方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象； 
4. 修改一个类，其作用的范围是synchronized后面括号括起来的部分，作用主的对象是这个类的所有对象。
具体例子参见  [Java中Synchronized的用法][1]


  [1]: http://blog.csdn.net/luoweifu/article/details/46613015
    
    ---

    # Runnable和Thread

    ---
    在Java中可有两种方式实现多线程，一种是继承Thread类，一种是实现Runnable接口；Thread类是在java.lang包中定义的。一个类只要继承了Thread类同时覆写了本类中的run()方法就可以实现多线程操作了，但是一个类只能继承一个父类，这是此方法的局限，

    两种实现方式的区别和联系：
    　　在程序开发中只要是多线程肯定永远以实现Runnable接口为主，因为实现Runnable接口相比
    　　继承Thread类有如下好处：
    　　->避免点继承的局限，一个类可以继承多个接口。
    　　->适合于资源的共享
    具体参见 http://blog.csdn.net/wwww1988600/article/details/7309070

    ---



