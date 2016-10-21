/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/10/12
 * Author: 105021085 周于萱
 */
import java.util.Scanner;


public class hw01_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in);
		int minute;
		System.out.println("輸入單月通話時間(分鐘):");
		minute=b.nextInt();
	
		if(	minute<600)
		{
			
			System.out.println("電話費(元):"+minute*0.5+"元");
		}
		else if(minute>=600&&minute<=1200)
		{
			System.out.println("電話費(元):"+(minute*0.5)*0.9+"元");
		}
		
		else
		{
			System.out.println("電話費(元):"+(minute*0.5)*0.79+"元");
		}
	}

}
