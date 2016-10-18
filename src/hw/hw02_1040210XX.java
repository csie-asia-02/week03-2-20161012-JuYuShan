/*
 * Topic: 已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；試寫一個程式可以計算男生女生的標準體重。(輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/10/12
 * Author: 105021085 周于萱
 */
import java.util.Scanner;


public class hw02_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);		
		int sex,height;
		
		System.out.println("請輸入性別:1=男，2=女:");
		 sex=a.nextInt();		 
		 
		System.out.println("請輸入身高:");
		height=a.nextInt();
		
		if(sex==1)
		{
			System.out.println("男生標準體重:"+(height-80 )*0.7);
		}
		else if(sex==2)
		{
			System.out.println("生標準體重:"+(height-70 )*0.6);
		}
		
	}

}
