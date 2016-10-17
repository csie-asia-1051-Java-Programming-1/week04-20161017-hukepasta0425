package hw;
import java.util.*;	
public class hw02_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner(System.in);
			int n=src.nextInt();
			int m=src.nextInt();
			int o=(n-m);
			int sum1=1,sum2=1,sum3=1,ans=0;
			for(int i=n;i>0;i--)
			{
				sum1=sum1*i;
			}
			for(int j=m;j>0;j--)
			{
				sum2=sum2*j;
			}
			for(int k=o;k>0;k--)
			{
				sum2=sum2*k;
			}
			ans=sum1/(sum2*sum3);
			System.out.print(ans);
			
			
			
	}

}
