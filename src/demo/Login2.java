package demo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Login2 {
	@Test
	public void login(){
		Scanner in =new Scanner(System.in);
		
		System.out.println("�������û�����");
		String nameLogin=in.nextLine();
try {
	      
	        
	        //2.����statement���������ִ��SQL��䣡��
	        Statement statement = DBUtil.getConn().createStatement();
	        //Ҫִ�е�SQL���
	        
	        
	        String sql1="select * from user where user_name=nameLogin";
    		ResultSet rs1 = statement.executeQuery(sql1);
    		System.out.println(rs1.getString("password"));
	        String sql="select * from user ";
	        //3.ResultSet�࣬������Ż�ȡ�Ľ��������
	        ResultSet rs = statement.executeQuery(sql);
	        List<String> list=new ArrayList();
	        
	        //�������
	        while(rs.next()){
	        	
	        	list.add(rs.getString("user_name"));
	        	
	        }
	        //ת���ɼ�����
//	        List<String> list=Arrays.asList(aa);
	        if(list.contains(nameLogin)){
	        	System.out.println("true");
	        }
	        else{
	        	System.out.println("false");
	        }
	        	}
catch(Exception e){
	
}
	}
}
