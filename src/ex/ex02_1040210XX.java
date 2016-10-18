/*
 * Topic: 輸入一正整數，判斷其奇偶數
 * Date: 2016/10/12
 * Author:105021085 周于萱
 */

import java.util.Scanner;

public class ex02_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a;
		a = scanner.nextInt();
		
		if(a%2!=0)
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}
	}

}