/*
 * Topic: �ռ��g�@�ӵ{���A�i����LŪ�J�@�� 4 ��ƪ���ơA�N���v���~���A�M��P�O�o�Ӧ~���O�_���|�~�]�C�|�~�@�|�A�C�ʦ~���|�A�C�|�ʦ~�@�|�A�Ҧp�褸 1900 ���� 4 �����ơA���i�Q 100 �㰣�A�ҥH���O�|�~�A�P�z�A 2000 �~�O�|�~�A�]�i�Q 400 ��ơA�� 2004 ��M�]�O�|�~�A�]�i�H�Q 4 �㰣�^
 * Date: 2016/10/12
 * Author: 105021085 �P�_��
 */
import java.util.Scanner;

public class hw03_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b=new Scanner(System.in);
	
		System.out.println("�п�J�~��:");
		int a;
		a=b.nextInt();
		if(a%4==0 && a%100!=0)
		{
			System.out.println("�|�~");
		}
		else
		{
			System.out.println("���O�Ӧ~");
		}

	}

}
