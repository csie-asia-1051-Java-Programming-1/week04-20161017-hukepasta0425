package hw;
import java.util.*;
public class hw01_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();
		long num[]=new long[n];
		num[0]=1;
		System.out.print(1 );	System.out.print(1 );
		if(n>1)
		{
			num[1]=1;
			for(int i=2;i<n;i++){
				num[i]=num[i-1]+num[i-2];
			System.out.print(num[i]);}
		}
	
		
	}

}
