package hw;
import java.util.*;
public class hw03_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner(System.in);
			int x=0,y=0,z=0;
			while(true)
			{
				int a=src.nextInt();
				if(a<0)
				{
					z++;
				}
				else if(a==0)
				{
					y++;
				}
				else if(a==999)
				{
					break;
				}
				else
				{
					x++;
				}
			}
			System.out.println("����"+x+"��");
			System.out.println("0��"+y+"��");
			System.out.println("�t��"+z+"��");
	}

}
