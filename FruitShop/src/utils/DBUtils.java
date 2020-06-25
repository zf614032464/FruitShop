package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtils {
	public static final String url = "jdbc:mysql://47.93.213.168/fruitshop?characterEncoding=utf8";  
    public static final String name = "com.mysql.jdbc.Driver";  
    public static final String user = "root";  
    public static final String password = "root";  
 
    public Connection conn = null;  
    public PreparedStatement pst = null;
    ResultSet result = null;// 创建一个结果集对象
 
    public DBUtils() {  
        try {  
            Class.forName(name);//指定连接类型  
            conn = DriverManager.getConnection(url,user,password);//获取连接  
            //System.out.println("数据库连接成功"); 
            
        } catch (Exception e) {  
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }  
    }  
}
