/**
 * Created by fengqiang on 2017/4/25.
 */

import java.sql.*;
public class JdbcTest {

    /**
     * @param args
     */
    //驱动程序就是之前在classpath中配置的JDBC的驱动程序的JAR 包中
    public static final String DBDRIVER = "com.mysql.jdbc.Driver";
    //连接地址是由各个数据库生产商单独提供的，所以需要单独记住
    public static final String DBURL = "jdbc:mysql://127.0.0.1:3306/test";
    //连接数据库的用户名
    public static final String DBUSER = "root";
    //连接数据库的密码
    public static final String DBPASS = "root";


    public static void main(String[] args) throws Exception {
        Connection con = null; //表示数据库的连接对象
        Class.forName(DBDRIVER); //1、使用CLASS 类加载驱动程序
        con = DriverManager.getConnection(DBURL,DBUSER,DBPASS); //2、连接数据库
        System.out.println(con);
        con.close(); // 3、关闭数据库
    }


}
