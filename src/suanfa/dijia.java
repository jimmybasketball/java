package suanfa;

public class dijia {
	static int addJimmy(int n ){
		if(n==1||n==0)
		return n;
		else 
			return n+addJimmy(n-1);
			}
	public static void main(String[] args){
	System.out.println(addJimmy(10));}
}
