package demo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NameValidate {
	public String NameValidate1(String name){
		
		List<String> list=new ArrayList();
try {
	        
	        //��������
	        
	        //2.����statement���������ִ��SQL��䣡��
	        Statement statement = DBUtil.getConn().createStatement();
	        //Ҫִ�е�SQL���
	        //String sql = "INSERT VALUES into user(name,pass,telephone,'')";
	        String sql="select *from user";
	        //3.ResultSet�࣬������Ż�ȡ�Ľ��������
	        ResultSet rs = statement.executeQuery(sql);

	      //�������
	        while(rs.next()){
	        	
	        	list.add(rs.getString("user_name"));
	        	
	        }
	        DBUtil.closeConn(rs, null, DBUtil.getConn() );
	        //ת���ɼ�����
//	        List<String> list=Arrays.asList(aa);
	        if(list.contains(name)){
//	        	System.out.println("�û�����");
	        	return "�û�����";
	        }else{
//	        	System.out.println("�û�������");
	        	return "�û�������";
	        }
	        
	        
	    } catch(Exception e) {   
	        
	    }

return null;
	}
}
