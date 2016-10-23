package ex;

/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021031 孟京澤
 */
import java.util.*;

public class ex04_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		String a=src.next();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >=i; j--) {
				System.out.print(a);
			}
			System.out.println();
		}
	}

}
