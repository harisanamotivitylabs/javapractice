import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		System.out.println("enter positive number it consits digits 6 && 9 only ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String numString = Integer.toString(n);
		if(numString=="9999")
		{
			System.out.println("Largest number is : "+numString);
		}

        for (int i = 0; i < numString.length(); i++){
            char c = numString.charAt(i);
            if(c=='6') { 
            	
                numString = numString.substring(0, i) + '9' + numString.substring(i + 1);
                break;
            }
        }
        System.out.println("Largest Number is : "+numString);
    }


	}
