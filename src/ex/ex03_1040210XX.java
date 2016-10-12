package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)
 * Date: 2016/10/12
 * Author: 1040210XX 周永振老師
 */

import java.util.Scanner;

public class ex03_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//輸入點座標(x,y)
		  System.out.println("輸入x軸座標");
		  double x = input.nextDouble();
		  System.out.println("輸入y軸座標");
		  double y = input.nextDouble();
		  
		  
		  double a = x*x;
		  double b = y*y;
		  double g = a + b;
		  double k = Math.pow(g,0.5);
		  
		  //印出結果
		  if( k <=100 )
		  {
		   System.out.println("此點位於圓圈內");   
		  }
		  else
		  {
		   System.out.println("此點位於圓圈外");
		  }
	}

}
