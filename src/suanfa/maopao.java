package suanfa;

public class maopao {
		public maopao(){
		    int a[]={1,54,6,3,78,34,12,45};
		    int temp=0;
		    for(int i=0;i<a.length;i++){

		       for(int j=i+1;j<a.length;j++){

		       if(a[i]>a[j]){

		           temp=a[i];

		           a[i]=a[j];

		           a[j]=temp;

		       }

		       }

		    }

		    for(int i=0;i<a.length;i++)
		    {
		       System.out.print(a[i]+"\t");   

		
		    }
		
		}
public static void main(String[] agrs){
	maopao aa=new maopao();
}
}
