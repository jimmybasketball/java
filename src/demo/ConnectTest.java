package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class  ConnectTest {

    
        //����Connection����
        Connection con;
        //����������
        String driver = "com.mysql.jdbc.Driver";
        //URLָ��Ҫ���ʵ����ݿ���mydata
        String url = "jdbc:mysql://localhost:3306/school";
        //MySQL����ʱ���û���
        String user = "root";
        //MySQL����ʱ������
        String password = "qazwsx@123456";
        //������ѯ�����
        public  void connect(){
        try {
            //������������
            Class.forName(driver);
            //1.getConnection()����������MySQL���ݿ⣡��
            con = DriverManager.getConnection(url,user,password);
            if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
//            //2.����statement���������ִ��SQL��䣡��
//            Statement statement = con.createStatement();
//            //Ҫִ�е�SQL���
//            String sql = "select * from user";
//            //3.ResultSet�࣬������Ż�ȡ�Ľ��������
//            ResultSet rs = statement.executeQuery(sql);
           

//            rs.close();
//            con.close();
        } catch(ClassNotFoundException e) {   
            //���ݿ��������쳣����
            System.out.println("Sorry,can`t find the Driver!");   
            e.printStackTrace();   
            } catch(SQLException e) {
            //���ݿ�����ʧ���쳣����
            e.printStackTrace();  
            }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            System.out.println("���ݿ����ݳɹ���ȡ����");
        }
   
        }
       public int add(int x,int y){
    	   return x+y;
       } 
}