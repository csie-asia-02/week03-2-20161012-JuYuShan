import java.util.Scanner;

/*
 * Topic: ���ϥΪ̿�J�@�����n�A�p��1*(1+1) + 2*(2+1) + 3*(3+1) + �K + n*(n+1)�ÿ�X���G
 * Date: 2016/10/12
 * Author:105021085 �P�_��
 */
public class hw04_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in) ;
		int x, i ,k = 0,s=0 ; 
		System.out.print("�п�J�@�ӥ����:");
		x = scn.nextInt();	
		
		
		for ( i=1; i<=x; i++) 
		{
			k=i*(i+1);
			s=k+s;
		}
		
		System.out.println("1*(1+1)+ �K + "+x +"*"+"("+x+"+"+"1"+")"+"="+s);
	}

	}	


