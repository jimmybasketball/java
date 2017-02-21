package suanfa;

public class count {
	
	    static void count(int n)               //递归方法
	    {
	        if (n<5) 
	            count(n+1); 
	        System.out.print("     "+n);
	    } 
	    public static void main(String args[])
	    {
	        count(1);
	        System.out.println();
	    }
	
}
