package demo;

import java.util.Scanner;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void login(){
		Scanner in =new Scanner(System.in);
		Scanner in1 =new Scanner(System.in);
		int functionLogin=0;
		System.out.println("======��ӭ������¼ģ��======");
		System.out.println("�������û�����");
		String nameLogin=in.nextLine();
		//У���û����Ƿ����
		String backName= new NameValidate().NameValidate1(nameLogin);
		try {

	        	if(backName.equals("�û�����"))//����������Ƿ����nameLogin
	    	    {

	        		System.out.println("���������룺");
	        		String passLogin=in.nextLine();
	        		int i=0;
	        		int a=new PasswordValidate().passwordValidate(nameLogin, passLogin);
	        		
	        		while(a!=1){
	        			i++;
	        			System.out.println("������˺Ŵ����������������룺");
	        			String passLogin1=in.nextLine();
	        			a=new PasswordValidate().passwordValidate(nameLogin, passLogin1);
	        				if(i>=3){
	        					System.out.println("����������ޣ��˳�ϵͳ");
	        					System.exit(0);
	        						}
	        					}
	        				if(a==1){
	        					while(functionLogin!=5&&functionLogin!=6){
	        					System.out.println("========================="+"\n"+"������ѡ�1��ѯ��2��ת�ˣ�"
		        					+ "3��ȡ�4����5���������˵���6���˳�");
	        	        			 functionLogin=in.nextInt();
	        	        			
	        	        			switch(functionLogin){
	        	        			case 1:System.out.println("====��ʾ���====");
	        	        			SearchBalance aa=new SearchBalance();
	        	        			aa.Search(nameLogin);
	        	        				   break;
	        	        			case 2:System.out.println("=====ת��====");
	        	        			System.out.println("������ת������:");
	        	        			String TransferName =in1.nextLine();	        	   	
	        	        			new NameValidate().NameValidate1(TransferName);
	        	        			
	        	        			System.out.println("������ת�˽�");
	        	        			int TransferMoney=in.nextInt();
	        	        			String ss=new MoneyValidate().moneyValidate(TransferMoney);
	        	        				while(ss.equals("��֤ʧ��!")){
	        	        					System.out.println("����������ת�˽�");
	        	        					TransferMoney=in.nextInt();
	        	        					ss=new MoneyValidate().moneyValidate(TransferMoney);
	        	        				}
	        	        			if(ss.equals("��֤�ɹ�!")){
	        	        				Transfer bb=new Transfer();
		        	        			bb.transferMoney(nameLogin, TransferName, TransferMoney);
	        	        			}
	        	        			
	             				           break;
	        	        			case 3:System.out.println("====ȡ��====");
	        	        			System.out.println("������ȡ���");
	        	        			int WithdrawMoney=in.nextInt();
	        	        			new Withdraw().Withdraw1(nameLogin, WithdrawMoney);
	        				           	   break;
	        	        			case 4:System.out.println("====���====");
	        	        			System.out.println("���������");
	        	        			int DepositoMoney=in.nextInt();
	        	        			new Deposito().Deposito1(nameLogin, DepositoMoney);
	        				               break;
	        	        			case 5:System.out.println("�������˵�");
	        	        			new Atm().Atm1();
	        				               break;
	        	        			case 6:System.out.println("�˳�");
	        				               break;}
	        					}
	        		}
	    	    }

	    	    	
	        	else//�û�������
	    	    {
	    			System.out.println("�û��������ڣ�����ȥע�᣺");
	    				
	    	    }
	        
	        
	    DBUtil.closeConn(null, null, DBUtil.getConn());  //close the connect  
	    	    
	    } catch(Exception e) {   
	        System.out.println("ֱ�������쳣");
	    }

	}
	public void functionMenu(){
		
	}
}
