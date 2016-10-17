package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021031 孟京澤
 */
import java.util.*;
public class ex01_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner(System.in);
			int n=0;
			int sum=0;
			int a=0;
			while(true)
			{
				a++;
				if(n>=0)
				{
					System.out.print("輸入正整數: ");
					n=src.nextInt();
					sum+=n;
				}
				else
				{
					break;
				}
			
				
				
			}
			System.out.println(sum+1);
			System.out.println((sum+1)/(a-2));
			
	}

}
