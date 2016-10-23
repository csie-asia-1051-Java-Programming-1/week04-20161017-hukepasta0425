package hw;
import java.util.*;
public class hw04_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner(System.in);
			System.out.println("選擇功能: ");
			int a=src.nextInt();
			int n=0;
			switch(a)
			{
			case 1:
				 n=src.nextInt();
				 for (int i = 1; i <= n; i++) {
						for (int j = n; j >=i; j--) {
							System.out.print("@");
						}
						System.out.println();
					}
				 for(int i=2;i<=n;i++)
					{
						for(int j=1;j<=i;j++)
						{
							System.out.print("@");
						}
						System.out.println();}
				 break;
				 
				 
				
			case 2:
				 n=src.nextInt();
				 for(int i=1;i<=n;i++)
					{
						for(int j=1;j<=i;j++)
						{
							System.out.print("%");
						}
						System.out.println();}
				 for (int i = 2; i <= n; i++) {
						for (int j = n; j >=i; j--) {
							System.out.print("%");
						}
						System.out.println();
					}
				 
				 
				 
			case 3:
				 n=src.nextInt();
				 for (int i = 1; i <= n; i++) {
						for (int j = n; j >=i; j--) {
							System.out.print(" ");
						}
						for(int k=1;k<=(2*i-1);k++)
						{
							System.out.print("#");
						}
						System.out.println();
					}
				 for(int i=2;i<=n;i++)
					{
						for(int j=1;j<=i;j++)
						{
							System.out.print(" ");
						}
						for (int k = (2*n-1); k >=(i*2-1); k--) {
							System.out.print("#");
						}
						System.out.println();
						}
				 
				 break;
				 
			case 4:
				System.out.print("感謝使用～！");
				break;
			
			}
	}

}
