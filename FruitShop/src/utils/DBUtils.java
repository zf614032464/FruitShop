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
    ResultSet result = null;// ����һ�����������
 
    public DBUtils() {  
        try {  
            Class.forName(name);//ָ����������  
            conn = DriverManager.getConnection(url,user,password);//��ȡ����  
            //System.out.println("���ݿ����ӳɹ�"); 
            
        } catch (Exception e) {  
            e.printStackTrace();
            System.out.println("���ݿ�����ʧ��");
        }  
    }  
}
