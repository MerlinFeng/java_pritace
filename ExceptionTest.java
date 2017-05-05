/**
 * Created by fengqiang on 2017/5/5.
 */
/*
毕老师用电脑上课。

开始思考上课中出现的问题。


比如问题是
	电脑蓝屏。
	电脑冒烟。

要对问题进行描述，封装成对象。


可是当冒烟发生后，出现讲课进度无法继续。

出现了讲师的问题：课时计划无法完成。


*/

class LanPingException extends Exception{
    LanPingException(String message){
        super(message);
    }
}

class MaoYanException extends Exception{
    MaoYanException(String message){
        super(message);
    }
}

class NoPlanException extends Exception
{
    NoPlanException(String msg)
    {
        super(msg);
    }
}


class Computer {
    private int status = 3;


    public void run() throws LanPingException,MaoYanException{
        if (status == 2){
            throw new LanPingException("蓝屏了");
        }else if(status == 3){
            throw new MaoYanException("冒烟了");
        }else {
            System.out.println("正常运行");
        }
    }

    public void reset(){
        status = 1;
        System.out.println("重启");
    }
}


class Teacher{
    private String name;
    private Computer cmpt;

    public Teacher(String name) {
        this.name = name;
        cmpt = new Computer();
    }

    public void prelect() throws NoPlanException{
        try {
            cmpt.run();
        }catch (LanPingException e){
            cmpt.reset();
        }catch (MaoYanException e){
            test();
            throw new NoPlanException("wuke"+e.getMessage());

        }
    }

    public void test(){
        System.out.println("练习");
    }
}
class ExceptionTest {
    public static void main(String[] args){
        Teacher t = new Teacher("毕老师");
        try
        {
            t.prelect();
        }
        catch (NoPlanException e)
        {
            System.out.println(e.toString());
            System.out.println("换老师或者放假");
        }

    }
}
