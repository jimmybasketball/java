package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoneyValidate {
	public String moneyValidate(int money){
		String s = Integer.toString(money);
		 String mre = "^\\+?[1-9][0-9]*$";//Java����Ҫ��˫б�ܴ���������ʽ�ķ�б��
	        Pattern p = Pattern.compile(mre);
	        Matcher m = p.matcher(s);
	        if (m.find()) {
	        	return "��֤�ɹ�!";
	        } else {
	        	return "��֤ʧ��!";
	        }
	}
}
