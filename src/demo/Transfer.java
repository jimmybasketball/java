package demo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Transfer {
	public void transferMoney(String namePayfer,String namePayee,int money){
		/*�۳��Լ��˻�fund:update user set fund-=money where user_name=namePayfer
		 * ���ӶԷ�fund���:update user set fund+=money where user_name=namePayee
		 * �߽�ֵУ��:money=<fund(namePayfer)
		 * 
		 * */
		List<String> list=new ArrayList();
		int[]aa=new int[9];
		int i=0;
		int[]bb=new int[9];
		int j=0;
		try {Connection con=DBUtil.getConn();
		String sql=""+"select * from user  "+"where user_name=?";
		String sql3=""+"select * from user  "+"where user_name=?";
		String sql1=""+"update user set fund=?-?   "+"where user_name=?";
		String sql2=""+"update user set fund=?+?   "+"where user_name=?";
		//Ԥ����sql���
		         PreparedStatement psmt = con.prepareStatement(sql);
		         PreparedStatement psmt1 = con.prepareStatement(sql1);
		         PreparedStatement psmt2 = con.prepareStatement(sql2);
		         PreparedStatement psmt3 = con.prepareStatement(sql3);
		//�ȶ�ӦSQL��䣬��SQL��䴫�ݲ���
		         
					psmt.setString(1, namePayfer);
					psmt3.setString(1, namePayee);
					
		         /*psmt.execute();*///execute()������ִ�и������ݿ�����������������޸ġ�ɾ����;
		         //executeQuery()��ִ�в�ѯ����
		         ResultSet rs = psmt.executeQuery();//����һ�������
		         ResultSet rs1 = psmt3.executeQuery();
		
		//�������Ľ��
		while(rs.next()){
			
			//list.add(rs.getLong("fund"));
			aa[i]=rs.getInt("fund");
			
			i++;
//			rs.getBigDecimal("fund");
//			System.out.println(rs.getBigDecimal("fund"));
		}
		//���У��
		if(aa[0]-money<0){
			System.out.println("����");
			System.exit(0);
		}
		//�տ����Ľ��
				while(rs1.next()){
					
					//list.add(rs.getLong("fund"));
					bb[j]=rs1.getInt("fund");
					
					j++;

				}
		
		psmt1.setInt(1, aa[0]);
		psmt1.setInt(2, money);
		psmt1.setString(3, namePayfer);
		psmt1.execute();
		//
		psmt2.setInt(1, bb[0]);
		psmt2.setInt(2, money);
		psmt2.setString(3, namePayee);
		psmt2.execute();
		System.out.println("ת�˳ɹ�");
		DBUtil.closeConn(rs1, psmt3, con);
		
		
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
