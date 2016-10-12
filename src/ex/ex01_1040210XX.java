
import java.util.Scanner;

public class ex01_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n,s,i=0;
		n = scanner.nextInt();
		
		while (n != 0)  
	    {  
	        s = n % 10;  
	        n = (n - s) / 10;  
	        i = i + s;  
	    }  
		System.out.println(i);
	}

}
