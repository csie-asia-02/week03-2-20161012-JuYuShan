import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果
 * Date: 2016/10/12
 * Author:105021085 周于萱
 */
public class hw04_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in) ;
		int x, i ,k = 0,s=0 ; 
		System.out.print("請輸入一個正整數:");
		x = scn.nextInt();	
		
		
		for ( i=1; i<=x; i++) 
		{
			k=i*(i+1);
			s=k+s;
		}
		
		System.out.println("1*(1+1)+ … + "+x +"*"+"("+x+"+"+"1"+")"+"="+s);
	}

	}	


