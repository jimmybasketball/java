package demo;

import java.util.Scanner;

public class Atm {
	public static void main(String[] agrs){
		 Atm ss=new Atm();
		 ss.Atm1();
		 System.exit(0);
	}
	public void Atm1(){

		System.out.println("��ӭʹ��ATM"+"\n"+"1:��¼ 2:ע�� 3:�˳�");
		Scanner in =new Scanner(System.in);
		int shuru= in.nextInt();
		switch(shuru){
		case 1:
			System.out.println("��¼");
			new Login().login();
			break;
		case 2:
			System.out.println("ע��");
			new UserRegistry().regi1stry();
			new Login().login();
			break;
		case 3:
			System.out.println("�˳�");
			
			break;
			
		}
		System.exit(0);
	}
}
