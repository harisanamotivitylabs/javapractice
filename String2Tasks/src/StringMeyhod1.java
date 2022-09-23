import java.util.Scanner;

public class StringMeyhod1 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		System.out.println("ENTER POSITIVE INTEGER IT CONSISTS ONLY DIGITS 6 && 9 ONLY");
		//int num=sc.nextInt();
		int num=9669;
		int count=0;
		int sum=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		for(int i=1;i<=count;++i)
		{
			num=num%10;
			
		}
		

	}

}
