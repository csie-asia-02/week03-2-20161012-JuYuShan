/*
 * Topic: �w���k�ͼз��魫��(������80 )*0.7�F�k�ͼз��魫��(������70)*0.6�F�ռg�@�ӵ{���i�H�p��k�ͤk�ͪ��з��魫�C(��J��ӼƭȡA�̧ǥN�������ΩʧO�]1�N��k�ʡF2�N��k�ʡ^)
 * Date: 2016/10/12
 * Author: 105021085 �P�_��
 */
import java.util.Scanner;


public class hw02_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);		
		int sex;
		float height;
		
		System.out.println("�п�J�ʧO:1=�k�A2=�k:");
		 sex=a.nextInt();		 
		 
		System.out.println("�п�J����:");
		height=a.nextFloat();
		
		if(sex==1)
		{
			System.out.println("�k�ͼз��魫:"+(height-80 )*0.7);
		}
		else if(sex==2)
		{
			System.out.println("�k�ͼз��魫:"+(height-70 )*0.6);
		}
		else
		{
			System.out.println("ERROR");
		}
		
	}

}
