package demo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordValidate {
	public int passwordValidate(String name,String password){
		List<String> listPassword=new ArrayList<String>();
		Scanner in =new Scanner(System.in);
		try{String sql1=""+"select * from user "+"where user_name=?";
		
		//Ԥ����sql���
		         PreparedStatement psmt = DBUtil.getConn().prepareStatement(sql1);
		//�ȶ�ӦSQL��䣬��SQL��䴫�ݲ���
		         psmt.setString(1, name);
		         /*psmt.execute();*///execute()������ִ�и������ݿ�����������������޸ġ�ɾ����;
		         //executeQuery()��ִ�в�ѯ����
		         ResultSet rs1 = psmt.executeQuery();//����һ�������
		
		
		while(rs1.next()){
			listPassword.add(rs1.getString("password"));
		}
		
		
		DBUtil.closeConn(rs1, psmt,null);
		if(listPassword.contains(password)){
			return 1;//true
		}else {
			return 2;//false
		}
		
		}
		catch(Exception e){}
		
		
		
		return 0;
		
		
	}
}
