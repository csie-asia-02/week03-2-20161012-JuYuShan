﻿package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x^2				若 x < -1
 * y = x^3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3				若 x > 1
 * Date: 2016/10/12
 * Author: 1040210XX 周永振老師
 */

public class ex04_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x,y;
		
		x = scanner.nextInt();
		if(x<-1){
		y=3*(x*x);
		System.out.println(y+"\n");
		}
		else if(-1<=x||x<=1)
		{
		y=(x*x*x)+3*x-3;
		System.out.println(y+"\n");
		}
		else if(x>1)
		{
		y=2*x+3;
		System.out.println(y+"\n");
		}
	}

}
