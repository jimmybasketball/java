package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class UserRegistry {
	@Test
	public void regi1stry(){
		
		//DBUtil.getConn();
	    //������ѯ�����
		List<String> list=new ArrayList();
	    Scanner in =new Scanner(System.in);
	    System.out.println("======��ӭ����ע��ģ��======");
		System.out.println("�������û�����");
		String name= in.nextLine();
		//�������ݿ�鿴�û����Ƿ��ظ�
		String backName= new NameValidate().NameValidate1(name);
		while(backName.equals("�û�����")){
			System.out.println("�û��Ѵ��ڣ�����������");
        	name=in.nextLine();
        	 backName= new NameValidate().NameValidate1(name);
		}

		
		System.out.println("���������룺 ");
		String pass=in.nextLine();
		System.out.println("������绰���룺");
		String telephone=in.nextLine();
	    try {
	        
	        //��������
	        java.sql.PreparedStatement psql;
	        
	        //Ԥ����������ݣ���������������--������
	        psql = DBUtil.getConn().prepareStatement("insert into user (user_name,password,telephone,fund) "
	                + "values(?,?,?,?)");
	        psql.setString(1, name);              //���ò���1������idΪ3212������
	        psql.setString(2, pass);      //���ò���2��name Ϊ����
	        psql.setString(3, telephone);
	        psql.setString(4, "5000"); 
	       
	        psql.executeUpdate();           //ִ�и���
	       

	      DBUtil.closeConn(null, psql, DBUtil.getConn());  
	    } catch(Exception e) {   
	        
	    }
		

	}
	
	
}


