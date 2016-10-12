/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/12
 * Author: 1040210XX 周永振老師
 */

import java.util.Scanner;

public class ex01_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n,s,i=0;
		n = scanner.nextInt();
		
		while (n != 0)  
	    {  
	        s = n % 10;  
	        n = (n - s) / 10;  
	        i = i + s;  
	    }  
		System.out.println(i);
	}

}
