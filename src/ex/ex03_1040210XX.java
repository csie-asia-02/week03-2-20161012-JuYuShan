/*
 * Topic: ���@��ΡA���|��200�A�B���߮y�Ь�(0,0)�C�мg�@��{���i�H��J�u�I�v���y�СA�çP�_�u�I�v�O�_�b��Ϊ��d�򤺡C�p�G�u�I�v����m��n�b��ɪ��ܤ]��O�b��νd��(�ҡGx=100�Ay=0)
 * Date: 2016/10/12
 * Author: 105021085 �P�_��
 */
import java.util.Scanner;

public class ex03_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		  
		  //��J�I�y��(x,y)
		  System.out.println("��Jx�b�y��");
		  double x = input.nextDouble();
		  System.out.println("��Jy�b�y��");
		  double y = input.nextDouble();
		  
		  
		  double a = x*x;
		  double b = y*y;
		  double g = a + b;
		  double k = Math.pow(g,0.5);
		  
		  //�L�X���G
		  if( k <=100 )
		  {
		   System.out.println("���I����餺");   
		  }
		  else
		  {
		   System.out.println("���I�����~");
		  }
		  
		 }

	}