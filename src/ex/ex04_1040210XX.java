
import java.util.Scanner;

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
