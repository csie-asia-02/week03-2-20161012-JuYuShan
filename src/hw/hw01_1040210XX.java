/*
 * Topic: �q�ܤ��q���p�O�覡�O 600�����H�U�C����0.5���F	600~1200�����q�ܶO�H9��p��F1200�����H�W�q�ܶO�H79��p��A���ϥΪ̿�J���ϥΤ��ɶ�(����)�A��X�q�ܶO(��)
 * Date: 2016/10/12
 * Author: 105021085 �P�_��
 */
import java.util.Scanner;


public class hw01_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in);
		int minute;
		System.out.println("��J���q�ܮɶ�(����):");
		minute=b.nextInt();
	
		if(	minute<600)
		{
			
			System.out.println("�q�ܶO(��):"+minute*0.5+"��");
		}
		else if(minute>=600&&minute<=1200)
		{
			System.out.println("�q�ܶO(��):"+(minute*0.5)*0.9+"��");
		}
		
		else
		{
			System.out.println("�q�ܶO(��):"+(minute*0.5)*0.79+"��");
		}
	}

}
