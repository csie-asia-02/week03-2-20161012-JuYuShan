

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

