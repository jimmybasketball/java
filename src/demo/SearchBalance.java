package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SearchBalance {
	public void Search(String name) throws SQLException{
	
	
		Connection con=DBUtil.getConn();
		String sql=""+"select * from user  "+"where user_name=?";
		//Ԥ����sql���
		         PreparedStatement psmt = con.prepareStatement(sql);
		//�ȶ�ӦSQL��䣬��SQL��䴫�ݲ���
		         psmt.setString(1, name);
		         /*psmt.execute();*///execute()������ִ�и������ݿ�����������������޸ġ�ɾ����;
		         //executeQuery()��ִ�в�ѯ����
		         ResultSet rs = psmt.executeQuery();//����һ�������
		
		
		while(rs.next()){
			
			System.out.println(rs.getString("fund"));
		}
		
			
		
		
		
		
	
	
}
}
