/*
假如我们在开发一个系统时需要对员工进行建模，员工包含 3 个属性：
姓名、工号以及工资。经理也是员工，除了含有员工的属性外，另为还有一个
奖金属性。请使用继承的思想设计出员工类和经理类。要求类中提供必要的方
法进行属性访问。

员工类：name id pay

经理类：继承了员工，并有自己特有的bonus。


*/
class Employee{
    private String name;
    private int id;
    private  double pay;

    Employee(String name, int id, double pay){
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

//    public abstract void work();
}

class EmployeeBase extends Employee{

    EmployeeBase(String name, int id, double pay){
        super(name, id, pay);
    }

    public void work(){
        System.out.println("we are base worker");
    }
}

class EmployeeManage extends Employee{

    private double bonus;

    EmployeeManage(String name, int id, double pay, double bonus){
        super(name, id, pay);
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("we are manager");
    }
}
class emp{
    public static void main(String[] args){

    }
}